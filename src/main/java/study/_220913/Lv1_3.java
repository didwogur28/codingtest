package study._220913;

/*

  - 문제
   자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
   예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다
   답이 항상 존재함은 증명될 수 있습니다.

  - 제한사항
   1) 100,000,000 이하의 자연수

 */

public class Lv1_3 {

    public static void main(String[] args) {

        class Solution {

            public int solution(int n) {

                int answer = 0;
                String str = String.valueOf(n);

                String[] strArray = str.split("");

                for(String s : strArray) {
                    answer = answer + Integer.valueOf(s);
                }

                return answer;
            }
        }
    }

}
