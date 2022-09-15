package study;

/*
 * 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요.
 * 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
 *
 * 제한사항 : n은 10,000,000,000이하인 자연수입니다.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lv1_7 {

    public static void main(String[] args) {

        solution(123456789);
    }

    public static int[] solution(long n) {

        long num = n;
        int leng = 0;

        while (n%10 > 0) {

            num = num / 10;
            leng++;
        }

        int[] answer = new int[leng];
        num = n;

        for(int i=0; i<answer.length; i ++) {
            answer[i] = (int) (n % 10);
            num = num / 10;
        }

        return answer;
    }
}


