package study._230626;

import java.util.LinkedList;
import java.util.Queue;

public class Lv2_54 {

    static int xLen, yLen;          // 가로 세로 크기
    static int[] S = new int[2];    // 시작 좌표
    static int[] L = new int[2];    // 레버 좌표
    static int[] E = new int[2];    // 종료 좌표
    static char[][] map;            // 지도
    static boolean[][] visited;      // 방문 여부
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};

    public static void main(String[] args) throws Exception {
        System.out.println(solution(new String[]{"SOOOL", "XXXXO", "OOOOO", "OXXXX", "OOOOE"}));
    }

    public static int solution(String[] maps) {

        int answer = 0;
        int toLever = 0;
        int toEnd = 0;

        map = new char[maps.length][];

        xLen = maps.length;
        yLen = maps[0].length();

        for (int i = 0; i < xLen; i++) {
            for (int j = 0; j < yLen; j++) {

                map[i] = maps[i].toCharArray();

                if (map[i][j] == 'S') {
                    S[0] = i;
                    S[1] = j;
                } else if (map[i][j] == 'L') {
                    L[0] = i;
                    L[1] = j;
                } else if (map[i][j] == 'E') {
                    E[0] = i;
                    E[1] = j;
                }
            }
        }

        visited = new boolean[xLen][yLen];
        toLever = bfs1(S[0], S[1]);

        visited = new boolean[xLen][yLen];
        toEnd = bfs2(L[0], L[1]);

        if (toLever == -1 || toEnd == -1) {
            return -1;
        }

        return toLever + toEnd;
    }

    public static int bfs1(int x, int y) {

        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(x, y, 0));     // S 좌표 큐 삽입
        visited[x][y] = true;

        while (!q.isEmpty()) {

            Node now = q.poll();    // poll() : 큐 맨 앞에 있는 값 반환 후 삭제, 큐가 비어있을 경우 null 반환

            for (int i = 0; i < 4; i++) {

                int nextX = dx[i] + now.x;
                int nextY = dy[i] + now.y;

                if (nextX < 0 || nextY < 0 || nextX >= xLen || nextY >= yLen) {     // 갈수 없는 위치
                    continue;
                }

                if (map[nextX][nextY] == 'X' || visited[nextX][nextY] == true) {     // 벽 이거나 방문 한 곳
                    continue;
                }

                if (map[nextX][nextY] == 'L') {     // 레버지점 도착 시 카운트 +1 하고 리턴
                    return now.cnt + 1;
                }

                q.offer(new Node(nextX, nextY, now.cnt + 1));       // 갈수 있는 지점인데 레버는 아닐 경우 1초 증가 후 Queue 추가
                visited[nextX][nextY] = true;      // 방문처리
            }
        }

        return -1;      // 레버에 도달하지 못하면 -1 반환
    }

    public static int bfs2(int x, int y) {

        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(x, y, 0));     // S 좌표 큐 삽입
        visited[x][y] = true;

        while (!q.isEmpty()) {

            Node now = q.poll();    // poll() : 큐 맨 앞에 있는 값 반환 후 삭제, 큐가 비어있을 경우 null 반환

            for (int i = 0; i < 4; i++) {

                int nextX = dx[i] + now.x;
                int nextY = dy[i] + now.y;

                if (nextX < 0 || nextY < 0 || nextX >= xLen || nextY >= yLen) {     // 갈수 없는 위치
                    continue;
                }

                if (map[nextX][nextY] == 'X' || visited[nextX][nextY] == true) {     // 벽 이거나 방문 한 곳
                    continue;
                }

                if (map[nextX][nextY] == 'E') {     // 종료지점 도착 시 카운트 +1 하고 리턴
                    return now.cnt + 1;
                }

                q.offer(new Node(nextX, nextY, now.cnt + 1));       // 갈수 있는 지점인데 레버는 아닐 경우 1초 증가 후 Queue 추가
                visited[nextX][nextY] = true;                           // 방문처리
            }
        }

        return -1;      // 종료에 도달하지 못하면 -1 반환
    }

    static class Node {

        int x, y, cnt;

        public Node(int x, int y, int cnt) {
            this.x = x;
            this.y = y;
            this.cnt = cnt;
        }
    }
}
