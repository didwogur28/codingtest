package study._230718;

import java.util.*;

public class exTest3 {

    public static void main(String[] args) throws Exception {
        for(int[] solution : solution(3, new int[][]{{1,2}})) {
            for(int sol : solution) {
                System.out.print(sol);
            }
        };

//        solution(2, new String[]{"design"}, new String[]{"building", "supervise"}, new String[]{"2 design", "1 supervise building design", "1 design", "2 design"});
    }

    public static int[][] solution(int N, int[][] bus_stop) {

        int destRow = 0;
        int destCol = 0;

        int[][] shortestDistances = new int[N][N];

        for(int i=0; i<bus_stop.length; i++) {
            destRow = bus_stop[i][0];
            destCol = bus_stop[i][1];

            Queue<int[]> queue = new LinkedList<>();
            queue.offer(new int[]{destRow, destCol});

            while (!queue.isEmpty()) {
                int[] curr = queue.poll();
                int currRow = curr[0];
                int currCol = curr[1];
                int currDistance = shortestDistances[currRow][currCol] + 1;

                // 현재 위치의 상하좌우 칸들을 확인하며 최단 거리 업데이트
                int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};  // 상하좌우 이동 방향
                for (int[] dir : directions) {
                    int newRow = currRow + dir[0];
                    int newCol = currCol + dir[1];

                    if (newRow >= 0 && newRow < 3 && newCol >= 0 && newCol < 3) {
                        if (shortestDistances[newRow][newCol] > currDistance) {
                            shortestDistances[newRow][newCol] = currDistance;
                            queue.offer(new int[]{newRow, newCol});
                        }
                    }
                }
            }
        }

        return shortestDistances;

    }

}
