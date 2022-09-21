package study._220915;

/*
 * 함수 solution은 정수 n을 매개변수로 입력받습니다.
 * n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
 * 예를들어 n이 118372면 873211을 리턴하면 됩니다.
 *
 * 제한사항: n은 1이상 8000000000 이하인 자연수입니다.
 */

import java.util.Arrays;
import java.util.Collections;

public class Lv1_9 {

    public static void main(String[] args) {

        solution(118372);
    }

    public static long solution(long n) {

        long answer = 0;

        String str = String.valueOf(n);
        char[] s = str.toCharArray();

        Arrays.sort(s);

        String sb = new StringBuilder(new String(s)).reverse().toString();

        answer = Long.parseLong(sb.toString());
        return answer;
    }
}


/*

    Arrays.sort : 배열내 오름차순 정렬

 */


