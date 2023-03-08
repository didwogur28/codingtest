package study._230308;

/*

  - 문제
   1와 0로 채워진 표(board)가 있습니다. 표 1칸은 1 x 1 의 정사각형으로 이루어져 있습니다.
   표에서 1로 이루어진 가장 큰 정사각형을 찾아 넓이를 return 하는 solution 함수를 완성해 주세요.
   (단, 정사각형이란 축에 평행한 정사각형을 말합니다.)

   예를 들어
     1	 2	 3	 4
     0	 1	 1	 1
     1	 1	 1	 1
     1	 1	 1	 1
     0	 0	 1	 0
   가 있다면 가장 큰 정사각형은
     1	 2	 3	 4
     0	 1	 1	 1
     1	 1	 1	 1
     1	 1	 1	 1
     0	 0	 1	 0
   가 되며 넓이는 9가 되므로 9를 반환해 주면 됩니다.

  - 조건
   1) 표(board)는 2차원 배열로 주어집니다.
   2) 표(board)의 행(row)의 크기 : 1,000 이하의 자연수
   3) 표(board)의 열(column)의 크기 : 1,000 이하의 자연수
   4) 표(board)의 값은 1또는 0으로만 이루어져 있습니다.

 */

public class Lv2_46 {

    public static void main(String[] args) {

        int solution = solution(new int[][]{{0, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {0, 0, 1, 0}});
        System.out.print(solution);
    }

    public static int solution(int[][] board) {

        int[][] map = new int[board.length + 1][board[0].length + 1];

        int maxLen = 0;

        for (int i = 1; i <= board.length; i++) {

            for (int j = 1; j <= board[0].length; j++) {

                if(board[i-1][j-1] != 0) {
                    int min = Math.min(Math.min(map[i - 1][j], map[i][j - 1]), map[i - 1][j - 1]);
                    map[i][j] = min + 1;

                    maxLen = Math.max(maxLen, min + 1);
                }
            }
        }

        return maxLen * maxLen;

    }
}

/*

[[0,1,1,1],[1,1,1,1],[1,1,1,1],[0,0,1,0]]	9
[[0,0,1,1],[1,1,1,1]]	4

 */


