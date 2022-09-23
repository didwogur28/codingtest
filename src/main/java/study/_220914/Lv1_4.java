package study._220914;

/*

  - 문제
   정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수
   solution을 완성해주세요.

  - 제한사항
   1) n은 0 이상 3000이하인 정수입니다.

 */

public class Lv1_4 {

    public static void main(String[] args) {
        class Solution {

            public int solution(int n) {

                n = 12;
                int answer = 0;

                if(n>=0 && n<=3000) {

                    for(int a=1; a<=n; a++) {

                        if(n % a == 0) {
                            answer = answer + a + (n/a);
                            System.out.println(">>>>" + answer);
                        }
                    }
                }
                return answer;
            }
        }
    }
}
