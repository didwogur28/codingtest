package study._221116;

/*

  - 문제
   카카오배 양궁대회가 열렸습니다.
   라이언은 저번 카카오배 양궁대회 우승자이고 이번 대회에도 결승전까지 올라왔습니다.
   결승전 상대는 어피치입니다.
   카카오배 양궁대회 운영위원회는 한 선수의 연속 우승보다는 다양한 선수들이 양궁대회에서 우승하기를 원합니다.
   따라서, 양궁대회 운영위원회는 결승전 규칙을 전 대회 우승자인 라이언에게 불리하게 다음과 같이 정했습니다.

     어피치가 화살 n발을 다 쏜 후에 라이언이 화살 n발을 쏩니다.
     점수를 계산합니다.
     과녁판은 아래 사진처럼 생겼으며 가장 작은 원의 과녁 점수는 10점이고 가장 큰 원의 바깥쪽은 과녁 점수가 0점입니다.
     만약, k(k는 1~10사이의 자연수)점을 어피치가 a발을 맞혔고 라이언이 b발을 맞혔을 경우
     더 많은 화살을 k점에 맞힌 선수가 k 점을 가져갑니다.
     단, a = b일 경우는 어피치가 k점을 가져갑니다.
     k점을 여러 발 맞혀도 k점 보다 많은 점수를 가져가는 게 아니고 k점만 가져가는 것을 유의하세요.
     또한 a = b = 0 인 경우, 즉, 라이언과 어피치 모두 k점에 단 하나의 화살도 맞히지 못한 경우는 어느 누구도 k점을 가져가지 않습니다.
     예를 들어, 어피치가 10점을 2발 맞혔고 라이언도 10점을 2발 맞혔을 경우 어피치가 10점을 가져갑니다.
     다른 예로, 어피치가 10점을 0발 맞혔고 라이언이 10점을 2발 맞혔을 경우 라이언이 10점을 가져갑니다.
     모든 과녁 점수에 대하여 각 선수의 최종 점수를 계산합니다.
     최종 점수가 더 높은 선수를 우승자로 결정합니다.
     단, 최종 점수가 같을 경우 어피치를 우승자로 결정합니다.

   현재 상황은 어피치가 화살 n발을 다 쏜 후이고 라이언이 화살을 쏠 차례입니다.
   라이언은 어피치를 가장 큰 점수 차이로 이기기 위해서 n발의 화살을 어떤 과녁 점수에 맞혀야 하는지를 구하려고 합니다.
   화살의 개수를 담은 자연수 n, 어피치가 맞힌 과녁 점수의 개수를 10점부터 0점까지 순서대로 담은 정수 배열 info가 매개변수로 주어집니다.
   이때, 라이언이 가장 큰 점수 차이로 우승하기 위해 n발의 화살을 어떤 과녁 점수에 맞혀야 하는지를
   10점부터 0점까지 순서대로 정수 배열에 담아 return 하도록 solution 함수를 완성해 주세요.
   만약, 라이언이 우승할 수 없는 경우(무조건 지거나 비기는 경우)는 [-1]을 return 해주세요.

  - 제한사항
   1) 1 ≤ n ≤ 10
   2) info의 길이 = 11
     - 0 ≤ info의 원소 ≤ n
     - info의 원소 총합 = n
     - info의 i번째 원소는 과녁의 10 - i 점을 맞힌 화살 개수입니다. ( i는 0~10 사이의 정수입니다.)
   3) 라이언이 우승할 방법이 있는 경우, return 할 정수 배열의 길이는 11입니다.
     - 0 ≤ return할 정수 배열의 원소 ≤ n
     - return할 정수 배열의 원소 총합 = n (꼭 n발을 다 쏴야 합니다.)
     - return할 정수 배열의 i번째 원소는 과녁의 10 - i 점을 맞힌 화살 개수입니다. ( i는 0~10 사이의 정수입니다.)
     - 라이언이 가장 큰 점수 차이로 우승할 수 있는 방법이 여러 가지 일 경우, 가장 낮은 점수를 더 많이 맞힌 경우를 return 해주세요.
     - 가장 낮은 점수를 맞힌 개수가 같을 경우 계속해서 그다음으로 낮은 점수를 더 많이 맞힌 경우를 return 해주세요.
     - 예를 들어, [2,3,1,0,0,0,0,1,3,0,0]과 [2,1,0,2,0,0,0,2,3,0,0]를 비교하면 [2,1,0,2,0,0,0,2,3,0,0]를 return 해야 합니다.
     - 다른 예로, [0,0,2,3,4,1,0,0,0,0,0]과 [9,0,0,0,0,0,0,0,1,0,0]를 비교하면[9,0,0,0,0,0,0,0,1,0,0]를 return 해야 합니다.
   4) 라이언이 우승할 방법이 없는 경우, return 할 정수 배열의 길이는 1입니다.
     - 라이언이 어떻게 화살을 쏘든 라이언의 점수가 어피치의 점수보다 낮거나 같으면 [-1]을 return 해야 합니다.


 */


import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Lv2_20 {

    public static void main(String[] args) {

        int[] solution = solution(5, new int[]{2,1,1,1,0,0,0,0,0,0,0});

        for(int s : solution) {
            System.out.print(s+" ");
        }

    }

    public static int[] solution(int n, int[] info) {

        int[] answer = new int[11];
        int[] tmp = new int[11];
        int maxDiff = 0;

        for(int subset=1; subset<(1 << 10); subset++) {

            int ryan = 0, apeach = 0, cnt = 0;

            for(int i=0; i<10; ++i) {
                if ((subset & (1 << i)) != 0) {
                    ryan += 10 - i;
                    tmp[i] = info[i]+1;
                    cnt += tmp[i];
                } else {
                    tmp[i] = 0;
                    if(info[i] > 0) {
                        apeach += 10 -i;
                    }
                }
            }

            if(cnt > n) continue;
            tmp[10] = n - cnt;

            if(ryan - apeach == maxDiff) {

                for(int i=10; i>=0; i--) {

                    if(tmp[i] > answer[i]) {
                        maxDiff = ryan - apeach;
                        answer = Arrays.copyOf(tmp, tmp.length);
                        break;
                    } else if (tmp[i] < answer[i]) {
                        break;
                    }
                }
            } else if(ryan - apeach > maxDiff) {
                maxDiff = ryan - apeach;
                answer = Arrays.copyOf(tmp, tmp.length);
            }
        }

        if(maxDiff == 0) {
            return new int[]{-1};
        }

        return answer;
    }
}

/*

    - 비트연산자
     > '>>' : 비트 값을 오른쪽으로 이동 한 후 왼쪽 빈 공간을 0으로 채움
     > '<<' : 비트 값을 왼쪽으로 이동 한 후 오른쪽 빈 공간을 0으로 채움
     
    - 낮은 점수를 많이 쏜 승리 자 찾기 -> 2진수를 사용해서 처리
     > 0000000001 ~ 1111111111 전체 검색
     > 1은 승리 0은 패배

     어피치가 2,1,1,1,0,0,0,0,0,0,0를 쐈다고 했을떄
     > 0000000001 일때는 3 0 0 0 0 0 0 0 0 0 2 -> 10점만 승리이기때문에 10점 승을 만들고 나머지 화살 2발은 0점으로 처리

 */


