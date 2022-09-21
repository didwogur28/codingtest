package study._220919;

/*
 * 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
 * 예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
 * 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
 *
 * 제한사항: x는 1 이상, 10000 이하인 정수입니다.
 */

import java.util.Arrays;

public class Lv1_10 {

    public static void main(String[] args) {

        boolean soluion = solution(10);
        System.out.println(soluion);
    }

    public static boolean solution(int x) {

        boolean answer = true;
        int num = 0;
        int a = 0;

        num = x;
        while(num != 0) {
            a = a + (num%10);

            num = num/10;
        }

        if(x % a == 0) {
            answer = true;
        } else {
            answer = false;
        }

        return answer;
    }
}


/*



 */


