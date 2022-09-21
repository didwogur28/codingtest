package study._220921;

/*
 * 어떤 정수들이 있습니다.
 * 이 정수들의 절댓값을 차례대로 담은 정수 배열 absolutes와 이 정수들의 부호를 차례대로 담은 불리언 배열 signs가 매개변수로 주어집니다.
 * 실제 정수들의 합을 구하여 return 하도록 solution 함수를 완성해주세요.
 *
 * 제한사항: absolutes의 길이는 1 이상 1,000 이하입니다. / signs[i] 가 참이면 absolutes[i] 의 실제 정수가 양수임을, 그렇지 않으면 음수임을 의미합니다.
 */

import java.util.Arrays;


public class Lv1_19 {

    public static void main(String[] args) {

        int solution = solution(new int[]{1,2,3}, new boolean[]{false, false, true});

        System.out.println(solution);

    }

    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for(int i=0; i<absolutes.length; i++) {
            answer += signs[i] ? absolutes[i] : -absolutes[i];
        }

        return answer;
    }
}


/*

    - Math.negateExact(arg)
     > arg의 부호를 바꿈 ( + -> - / - > + )

 */


