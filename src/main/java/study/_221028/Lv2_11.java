package study._221028;

/*

  - 문제
   전쟁에 참여한 화랑이는 적군의 기지에 침투하여 정보를 훔쳐오는 임무를 받았습니다.
   화랑이는 야간 전술 보행을 이용하여 직진하며, 야간 전술 보행은 1m/s의 일정한 속도로 나아갈 수 있습니다.
   화랑이의 침입 경로에는 경비병들이 각자 일부 구간들을 감시하고 있습니다.
   각각의 경비병들이 감시하는 구간은 서로 겹치지 않으며, 일정 시간 동안 근무 후 일정 시간 동안 휴식을 취하는 과정을 반복합니다.
   화랑이가 지나가고 있는 위치를 감시하는 경비병이 근무 중이라면 화랑이는 경비병에게 발각되어 즉시 붙잡히게 됩니다.
   하지만 해당 위치를 감시하는 경비병이 휴식을 취하고 있으면 화랑이는 무사히 해당 위치를 지나갈 수 있습니다.
   경비병의 근무 정보를 모르는 화랑이는 쉬지 않고 전진을 하며, 화랑이가 출발할 때 모든 경비병들이 동시에 근무를 시작합니다.
   예를 들어, 적군 기지까지의 거리가 10m이고 2명의 경비병들이 근무를 시작한다고 가정합시다.
   첫 번째 경비병의 감시 구간은 화랑이의 출발 위치로부터 3m부터 4m까지이고,
   두 번째 경비병의 감시 구간은 화랑이의 출발 위치로부터 5m부터 8m까지입니다.
   첫 번째 경비병의 근무 및 휴식 시간은 각각 2초, 5초를 반복하며, 두 번째 경비병의 근무 및 휴식 시간은 각각 4초, 3초를 반복합니다.
   이 경우 출발지로부터 화랑이의 위치에 따른 두 경비병의 상태는 아래 표와 같습니다.
   첫 번째 경비병이 감시하는 3m ~ 4m 구간을 화랑이는 3초일 때 진입하지만,
   첫 번째 경비병은 2초간의 근무를 마치고, 휴식을 시작했으므로, 화랑이는 붙잡히지 않습니다.
   하지만 두 번째 경비병이 감시하는 5m ~ 8m 구간에서 화랑이가 8m 지점에 진입했을 때,
   두 번째 경비병이 3초간의 휴식을 마치고 근무를 시작하므로 화랑이는 붙잡히게 됩니다.
     첫 번째 경비병의 상태	근무	근무	휴식	휴식	휴식	휴식	휴식	근무	근무	휴식
     두 번째 경비병의 상태	근무	근무	근무	근무	휴식	휴식	휴식	근무	근무	근무
     화랑이의 위치	        1	2	3	4	5	6	7	8	9	10
   화랑이의 현재 위치와 적군 기지 사이의 거리를 나타내는 정수 distance,
   각 경비병의 감시 구간을 담은 2차원 정수 배열 scope, 같은 순서로 각 경비병의 근무 시간과 휴식 시간을 담은 2차원 정수 배열 times가 주어질 때,
   화랑이가 경비를 피해 최대로 이동할 수 있는 거리를 return 하는 solution 함수를 완성하세요.

  - 제한사항
   1) 10 ≤ distance ≤ 10,000,000
   2) 1 ≤ scope의 길이, times의 길이 ≤ 1,000
     - scope[i]는 i+1번째 경비병이 감시하는 구간입니다.
     - scope[i]를 [a, b]라고 했을 때, (a ≠ b)입니다.
     - scope[i]는 정렬되어 있지 않을 수 있습니다(예시 2번 참조).
     - 경비병의 감시구간은 서로 겹치지 않습니다.
     - 1 ≤ scope의 원소 ≤ distance
     - 1 ≤ times의 원소 ≤ 10
     - times[i]는 i+1번째 경비병의 [근무 시간, 휴식 시간]입니다.

 */

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lv2_11 {

    public static void main(String[] args) {

        int solution = solution(10, new int[][]{{3,4}, {5,8}}, new int[][]{{2,5}, {4,3}});

        System.out.print(solution);


    }

    public static int solution(int distance, int[][] scope, int[][] times) {

        List<Integer> ans = new ArrayList<Integer>();

        for(int i=0; i<scope.length; i++) {
            int alltime = times[i][0] + times[i][1];

            Arrays.sort(scope[i]);

            for(int j=scope[i][0]; j<=scope[i][1]; j++) {

                if(j%alltime == 0) {
                    continue;
                } else if(j%alltime <= times[i][0]) {
                    ans.add(j);
                }
            }
        }

        Collections.sort(ans);

        if(ans.size() > 0) {
            return ans.get(0);
        }

        return distance;
    }

}

/*

 */


