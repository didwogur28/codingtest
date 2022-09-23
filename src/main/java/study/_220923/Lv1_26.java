package study._220923;

/*

  - 문제
   두 정수 left와 right가 매개변수로 주어집니다.
   left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고,
   약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.

  - 제한사항
   1) 1 ≤ left ≤ right ≤ 1,000

 */

import java.util.Arrays;
import java.util.stream.IntStream;

public class Lv1_26 {

    public static void main(String[] args) {

        int solution = solution(25,26);

        System.out.println(solution);

    }

    public static int solution(int left, int right) {

        int answer = 0;
        int cnt = 0;

        for (int i = left; i <= right; i++) {
            cnt = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    cnt += 1;
            }

            if (cnt % 2 == 0)
                answer += i;
            else
                answer -= i;
        }

        return answer;
    }
}


/*

    - Math.sqrt()
     > 제곱수 구하기
     > 제곱수는 약수의 개수가 홀수 아닐경우 짝수

 */


