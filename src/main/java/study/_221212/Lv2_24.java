package study._221212;

/*

  - 문제
   2차원 행렬 arr1과 arr2를 입력받아, arr1에 arr2를 곱한 결과를 반환하는 함수, solution을 완성해주세요.

  - 제한사항
   1) 행렬 arr1, arr2의 행과 열의 길이는 2 이상 100 이하입니다.
   2) 행렬 arr1, arr2의 원소는 -10 이상 20 이하인 자연수입니다.
   3) 곱할 수 있는 배열만 주어집니다.

 */


import java.util.Arrays;

public class Lv2_24 {

    public static void main(String[] args) {

        int[][] solution = solution(new int[][]{{1, 4}, {3, 2}, {4, 1}}, new int[][]{{3, 3}, {3, 3}});

        for(int[] i : solution) {
            for(int j : i) {
                System.out.println(j);
            }
        }

    }

    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {};
        return answer;
    }
}

/*

[[1, 4], [3, 2], [4, 1]]	        [[3, 3], [3, 3]]	                [[15, 15], [15, 15], [15, 15]]
[[2, 3, 2], [4, 2, 4], [3, 1, 4]]	[[5, 4, 3], [2, 4, 1], [3, 1, 1]]	[[22, 22, 11], [36, 28, 18], [29, 20, 14]]

 */


