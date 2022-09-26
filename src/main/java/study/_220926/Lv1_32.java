package study._220926;

/*

  - 문제
   문자열 s는 한 개 이상의 단어로 구성되어 있습니다.
   각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
   각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.

  - 제한사항
   1) 문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
   2) 첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.

 */


import java.util.Locale;

public class Lv1_32 {

    public static void main(String[] args) {

        String solution = solution("try hello  world");
        System.out.println(solution);
    }

    public static String solution(String s) {

        String answer = "";
        String splitChar = "";
        int splitLen = s.split(" ", -1).length;

        for(int i=0; i<splitLen; i++) {

            splitChar = s.split(" ", -1)[i];

            for(int j=0; j<splitChar.split("").length; j++) {
                answer += j % 2 == 0 ? splitChar.split("")[j].toUpperCase() : splitChar.split("")[j].toLowerCase();
            }

            if(i+1 != splitLen) {
                answer +=  " ";
            }
        }
        return answer;
    }
}


/*

    - split
     > arg.split(" ", -1): split에 뒤에 -1을 붙이면 맨 뒤의 공백을 카운트 할 수 있음

 */


