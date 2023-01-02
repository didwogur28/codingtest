package study._230102;

/*

  - 문제
   ROR 게임은 두 팀으로 나누어서 진행하며, 상대 팀 진영을 먼저 파괴하면 이기는 게임입니다.
   따라서, 각 팀은 상대 팀 진영에 최대한 빨리 도착하는 것이 유리합니다.

   게임 맵의 상태 maps가 매개변수로 주어질 때,
   캐릭터가 상대 팀 진영에 도착하기 위해서 지나가야 하는 칸의 개수의 최솟값을 return 하도록 solution 함수를 완성해주세요.
   단, 상대 팀 진영에 도착할 수 없을 때는 -1을 return 해주세요.

  - 제한사항
   1) maps는 n x m 크기의 게임 맵의 상태가 들어있는 2차원 배열로, n과 m은 각각 1 이상 100 이하의 자연수입니다.
     - n과 m은 서로 같을 수도, 다를 수도 있지만, n과 m이 모두 1인 경우는 입력으로 주어지지 않습니다.
   2) maps는 0과 1로만 이루어져 있으며, 0은 벽이 있는 자리, 1은 벽이 없는 자리를 나타냅니다.
   3) 처음에 캐릭터는 게임 맵의 좌측 상단인 (1, 1) 위치에 있으며, 상대방 진영은 게임 맵의 우측 하단인 (n, m) 위치에 있습니다.

 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lv2_38 {

    public static void main(String[] args) {

        int solution = solution(new int[][]{{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}});

        System.out.print(solution);
    }

    public static int solution(int[][] maps) {
        int answer = 0;
        return answer;
    }
}

/*

[[1,0,1,1,1],[1,0,1,0,1],[1,0,1,1,1],[1,1,1,0,1],[0,0,0,0,1]]	11
[[1,0,1,1,1],[1,0,1,0,1],[1,0,1,1,1],[1,1,1,0,0],[0,0,0,0,1]]	-1

 */


