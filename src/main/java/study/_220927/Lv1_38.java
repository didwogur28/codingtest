package study._220927;

/*

  - 문제
   문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다.
   예를 들어 strings가 ["sun", "bed", "car"]이고 n이 1이면 각 단어의 인덱스 1의 문자 "u", "e", "a"로 strings를 정렬합니다.

  - 제한사항
   1) strings는 길이 1 이상, 50이하인 배열입니다.
   2) strings의 원소는 소문자 알파벳으로 이루어져 있습니다.
   3) strings의 원소는 길이 1 이상, 100이하인 문자열입니다.
   4) 모든 strings의 원소의 길이는 n보다 큽니다.
   5) 인덱스 1의 문자가 같은 문자열이 여럿 일 경우, 사전순으로 앞선 문자열이 앞쪽에 위치합니다.

 */


import java.util.ArrayList;
import java.util.Arrays;

public class Lv1_38 {

    public static void main(String[] args) {

        String[] solution = solution(new String[]{"sun", "bed", "car"}, 1);

        for(int i=0; i<solution.length; i++) {
            System.out.println(solution[i]);
        }

    }

    public static String[] solution(String[] strings, int n) {

        String[] answer = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            String plus = strings[i].substring(n, n + 1);
            strings[i] = plus + strings[i];
        }

        Arrays.sort(strings);

        for (int i = 0; i < strings.length; i++) {
            answer[i] = strings[i].substring(1);
        }

        return answer;
    }
}


/*


 */


