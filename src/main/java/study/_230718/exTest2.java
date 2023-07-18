package study._230718;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class exTest2 {

    public static void main(String[] args) throws Exception {
        for (int answer : solution(3, new String[]{"development", "marketing", "hometask"}, new String[]{"recruitment", "education", "officetask"}, new String[]{"1 development hometask", "1 recruitment marketing", "2 hometask", "2 development marketing hometask", "3 marketing", "3 officetask", "3 development"})){
            System.out.println(answer);
        }

//        solution(2, new String[]{"design"}, new String[]{"building", "supervise"}, new String[]{"2 design", "1 supervise building design", "1 design", "2 design"});
    }

    public static int[] solution(int num_teams, String[] remote_tasks, String[] office_tasks, String[] employees) {

        List<Integer> answerList = new ArrayList<Integer>();

        List<String> officeTasks = new ArrayList<String>(Arrays.asList(office_tasks));
        List<EmpClass> empClassList = new ArrayList<EmpClass>();

        for(int i=0; i< employees.length; i++) {

            int teamNumber = Integer.parseInt(employees[i].split(" ")[0]);
            String tasksArg = employees[i].substring(2);

            List<String> taskList = Arrays.asList(tasksArg.split(" "));

            empClassList.add(new EmpClass(i+1, teamNumber, taskList, true));
        }

        for (int i=0; i<empClassList.size(); i++) {

            EmpClass EmpClass = empClassList.get(i);

            List<String> officeChk = officeTasks.stream().filter(task -> EmpClass.tasks.stream()
                            .anyMatch(Predicate.isEqual(task)))
                    .collect(Collectors.toList());

            if(!officeChk.isEmpty()) {
                empClassList.get(i).remoteTask = false;
            }
        }

        int chkCnt = 1;
        int fstEmNo = -1;

        while(chkCnt < num_teams+1) {

            String allRemoteChk = "Y";

            for (int i=0; i<empClassList.size(); i++) {

                if(empClassList.get(i).tmNo == chkCnt) {

                    if(fstEmNo == -1) fstEmNo = i;

                    if(empClassList.get(i).remoteTask == false) {
                        allRemoteChk = "N";
                    }
                }
            }

            if("Y".equals(allRemoteChk)) {
                empClassList.get(fstEmNo).remoteTask = false;
            }

            fstEmNo = -1;
            chkCnt++;
        }

        for (EmpClass empClass : empClassList) {
            if(empClass.remoteTask == true) {
                answerList.add(empClass.empNo);
            }
        }

        return answerList.stream().mapToInt(Integer::intValue).toArray();

    }

    private static class EmpClass {

        int empNo, tmNo;
        List<String> tasks;
        boolean remoteTask;

        public EmpClass(int empNo, int tmNo, List<String> tasks, boolean remoteTask) {
            this.empNo = empNo;
            this.tmNo = tmNo;
            this.tasks = tasks;
            this.remoteTask = remoteTask;
        }
    }
}
