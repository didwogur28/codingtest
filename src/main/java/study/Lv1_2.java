package study;

/*
 * 정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수,
 * solution을 완성해주세요.
 * 답이 항상 존재함은 증명될 수 있습니다.
 *
 * 제한사항: num은 int 범위의 정수입니다. / 0은 짝수입니다.
 */

public class Lv1_2 {

    public static void main(String[] args) {

        class Solution {
            public String solution(int num) {
                String anser = "";

                anser = num % 2 == 0 ? "Even" : "Odd";
                return anser;
            }
        }
    }
}
