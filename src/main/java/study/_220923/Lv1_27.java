package study._220923;

/*

  - 문제
   행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과가 됩니다.
   2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.

  - 제한사항
   1) 행렬 arr1, arr2의 행과 열의 길이는 500을 넘지 않습니다.

 */

public class Lv1_27 {

    public static void main(String[] args) {

        int[][] solution = solution(new int[][]{{1,2}, {2,3}}, new int[][]{{3,4}, {5,6}});

        for(int i=0; i<solution.length; i++) {
            for(int j=0; j< solution[i].length; j++) {
                System.out.println(solution[i][j]);
            }
        }


    }

    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {};

        answer = new int[arr1.length][arr1[0].length];

        for(int i=0; i<answer.length; i++) {
            for(int j=0; j< answer[i].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }
}


/*

 */


