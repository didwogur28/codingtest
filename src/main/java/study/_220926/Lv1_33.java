package study._220926;

/*

  - 문제
   자연수 n이 매개변수로 주어집니다.
   n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.

  - 제한사항
   1) n은 1 이상 100,000,000 이하인 자연수입니다.

 */


import java.util.Arrays;

public class Lv1_33 {

    public static void main(String[] args) {

        long solution = solution(45);
        System.out.println(solution);
    }

    public static long solution(long n) {

        long answer = 0;
        String arg = "";
        int cnt = 0;
        String splitChr = "";

        while(n > 0) {
            arg += String.valueOf(n%3);
            n = n/3;
        }

        answer = Integer.parseInt(arg, 3);

        return answer;
    }
}


/*

    - Integer.parseInt(arg, number);
     > arg 문자열을 number진법으로 형변환....

 */


