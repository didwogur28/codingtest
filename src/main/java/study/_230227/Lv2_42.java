package study._230227;

/*

  - 문제
   출판사의 편집자인 어피치는 네오에게 컬러링북에 들어갈 원화를 그려달라고 부탁하여 여러 장의 그림을 받았다.
   여러 장의 그림을 난이도 순으로 컬러링북에 넣고 싶었던 어피치는
   영역이 많으면 색칠하기가 까다로워 어려워진다는 사실을 발견하고 그림의 난이도를 영역의 수로 정의하였다.

   그림에 몇 개의 영역이 있는지와 가장 큰 영역의 넓이는 얼마인지 계산하는 프로그램을 작성해보자.

  - 입력형식
   입력은 그림의 크기를 나타내는 m과 n, 그리고 그림을 나타내는 m × n 크기의 2차원 배열 picture로 주어진다.

  - 출력형식
   리턴 타입은 원소가 두 개인 정수 배열이다.
   그림에 몇 개의 영역이 있는지와 가장 큰 영역은 몇 칸으로 이루어져 있는지를 리턴한다.

  - 조건
   1) 1 <= m, n <= 100
   2) picture의 원소는 0 이상 2^31 - 1 이하의 임의의 값이다.
   3) picture의 원소 중 값이 0인 경우는 색칠하지 않는 영역을 뜻한다.

 */

import java.util.ArrayList;
import java.util.List;

public class Lv2_42 {

    // 변수 접근을 위한 전역 변수들.
    static int numberOfArea;
    static int maxSizeOfOneArea;

    // 한 영역의 수를 저장하는 변수.
    static int temp_cnt = 0;

    // 좌표에서의 상,하,좌,우 탐색을 위한 배열.
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};

    public static void main(String[] args) {

        int[] solution = solution(6, 4, new int[][]{{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}});

        for(int i: solution) {
            System.out.println(i);
        }
    }

    public static int[] solution(int m, int n, int[][] picture) {

        // 전역변수 초기화
        numberOfArea = 0;
        maxSizeOfOneArea = 0;

        int[] answer = new int[2];

        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;

        // DFS시 방문여부를 체크 할 배열
        boolean[][] check = new boolean[m][n];

        // 주어진 picture 배열을 탐색
        for(int i=0; i<m; i++) {

            for(int j=0; j<n; j++) {

                // 원소가 0이 아니고, 방문한적이 없다면
                if(picture[i][j] != 0 && !check[i][j]) {
                    // 영역의 수 1개 증가하며 DFS 탐색 수행
                    numberOfArea++;
                    dfs(i, j, picture, check);
                }

                // 한 영역의 탐색이 모두 끝났다면, 조건에 따라 최대 영역의 수를 변경
                if(temp_cnt > maxSizeOfOneArea) maxSizeOfOneArea = temp_cnt;

                // 한 영역의 수는 다시 초기화
                temp_cnt = 0;
            }

        }

        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;

        return answer;
    }

    public static void dfs(int x, int y, int[][] picture, boolean[][] check) {

        // 방문한 적 있는 좌표라면 DFS 종료
        if(check[x][y]) return;

        // 처음 방문 시 방문 처리
        check[x][y] = true;

        // 영역의 수 증가
        temp_cnt++;

        // 한 좌표에서 상, 하, 좌, 우 탐색
        for(int i=0; i<4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            // picture 배열의 범위를 벗어나면 continue
            if(nx < 0 || nx >= picture.length || ny < 0 || ny >= picture[0].length) continue;

            // 현 좌표의 색 == 상, 하, 좌, 우 좌표의 색 && 방문한적 없는 상, 하, 좌, 우 좌표라면
            if(picture[x][y] == picture[nx][ny] && !check[nx][ny]) {

                // DFS를 위한 재귀호출
                dfs(nx, ny, picture, check);
            }
        }
    }
}

/*

6	4	[[1, 1, 1, 0], [1, 2, 2, 0], [1, 0, 0, 1], [0, 0, 0, 1], [0, 0, 0, 3], [0, 0, 0, 3]]	[4, 5]

 */


