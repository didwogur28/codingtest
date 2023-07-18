package study._230718;

import java.util.*;

public class exTest {

    public static void main(String[] args) throws Exception {
        for(String answer : solution(new String[]{"morgan string_compare", "felix string_compare", "morgan reverse", "rohan sort", "andy reverse", "morgan sqrt"})){
            System.out.println(answer);
        }
    }

    public static String[] solution(String[] logs) {

        List<String> answerList = new ArrayList<>();
        Map<String, Integer> logInfoMap = new HashMap<>();

        Set<String> logNames = new HashSet<>();

        for (String log : logs) {
            String[] parts = log.split(" ");
            String name = parts[0];
            String logName = parts[1];

            logNames.clear();
            for (String entry : logs) {
                if (entry.contains(logName)) {
                    logNames.add(entry.split(" ")[0]);
                }
            }

            logInfoMap.put(logName, logInfoMap.getOrDefault(logName, 0) + logNames.size());
        }

        int nameCnt = logs.length / 2 + 1;

        for (Map.Entry<String, Integer> entry : logInfoMap.entrySet()) {
            if (entry.getValue() >= nameCnt) {
                answerList.add(entry.getKey());
            }
        }

        Collections.sort(answerList);
        return answerList.toArray(new String[0]);

    }
}
