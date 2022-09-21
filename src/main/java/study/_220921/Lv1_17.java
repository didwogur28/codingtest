package study._220921;

/*
 * array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
 * divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
 *
 * 제한사항: arr은 자연수를 담은 배열입니다. / 정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다. / divisor는 자연수입니다. / array는 길이 1 이상인 배열입니다.
 */

import java.util.Arrays;

public class Lv1_17 {

    public static void main(String[] args) {

        int[] solution = solution(new int[]{2, 36, 1, 3}, 1);

        for(int i=0; i<solution.length; i++) {
            System.out.println(solution[i]);
        }

    }

    public static int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int chk = 1;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] % divisor == 0) {
                chk++;
            }
        }

        if(chk==1) {
            answer = new int[chk];
            answer[0] = -1;
            return answer;
        }

        answer = new int[chk-1];
        chk = 0;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] % divisor == 0) {
                answer[chk] = arr[i];
                chk++;
            }
        }

        Arrays.sort(answer);
        return answer;
    }
}


/*

    - 배열의 원소 가공
     Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();

     > map: 요소들을 특정 조건에 해당하는 값으로 변환
     > filter: 요소들을 조건에 따라 걸러줌
     > sorted: 요소들을 정렬

 */


