package study._220921;

/*
 * 정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요.
 * 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요.
 * 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
 *
 * 제한사항: arr은 길이 1 이상인 배열입니다. / 인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.
 */

import java.util.ArrayList;
import java.util.Arrays;


public class Lv1_18 {

    public static void main(String[] args) {

        int[] solution = solution(new int[]{4,3,2,1});

        for(int i=0; i<solution.length; i++) {
            System.out.println(solution[i]);
        }

    }

    public static int[] solution(int[] arr) {

        if(arr.length <= 1) return new int[]{-1};
        return java.util.Arrays.stream(arr).filter(arg -> arg != java.util.Arrays.stream(arr).min().getAsInt()).toArray();

    }
}


/*

    - Arrays.stream(배열).min().getAsInt()
     > 배열에서 가장 작은 요소를 Int형태로 반환

 */


