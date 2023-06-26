package study._230626;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Lv2_53 {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(new String[][]{{"korean", "11:40", "30"}, {"math", "12:30", "40"}, {"english", "12:10", "20"}}));
    }

    public static String[] solution(String[][] plans) {

        String[] answer = {};

        List<PlansClass> planList = new ArrayList<>();

        for (int i=0; i<plans.length; i++) {

            planList.add(new PlansClass(plans[i][0], plans[i][1], plans[i][2]));
        }

        planList.sort((o1, o2) -> {
            return o1.startTime - o2.startTime;
        });

        Stack<PlansClass> stack = new Stack<>();    // 진행 중 과제
        List<String> name = new ArrayList<>();

        int curTime = -1;   // 현재 시간 초기화

        for(int i=0; i<planList.size(); i++) {

            if(stack.empty()) {
                stack.push(planList.get(i));
                continue;
            }

            PlansClass curPlan = stack.peek();
            PlansClass newPlan = planList.get(i);

            curTime = curPlan.startTime;

            if (curTime + curPlan.time <= newPlan.startTime) {

                recursivePop(stack, newPlan, curTime, name);
            } else {

                curPlan.time -= newPlan.startTime - curTime;
            }

            stack.push(newPlan);
        }

        while (!stack.isEmpty()) {
            name.add(stack.pop().subject);
        }

        return answer;
    }

    public static void recursivePop(Stack<PlansClass> stack, PlansClass newPlan, int curTime, List<String> name) {

        if (stack.isEmpty()) {
            return;
        }

        PlansClass curPlan = stack.peek();

        if (curTime + curPlan.time <= newPlan.startTime) {
            name.add(stack.pop().subject);
            recursivePop(stack, newPlan, curTime + curPlan.time, name);
        } else {
            curPlan.time -= newPlan.startTime - curTime;
        }
    }

    static class PlansClass {

        private String subject;
        private int startTime, time;

        public PlansClass(String subject, String startTime, String time) {

            this.subject = subject;
            this.startTime = timeToMinute(startTime);
            this.time = Integer.parseInt(time);

        }

        public int timeToMinute(String startTime) {

            String[] stArr = startTime.split(":");

            int h = Integer.parseInt(stArr[0]) * 60;
            int m = Integer.parseInt(stArr[1]);

            return h + m;
        }
    }
}
