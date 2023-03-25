package study._230313;

/*

  - 문제
   n명의 사람이 일렬로 줄을 서고 있습니다.
   n명의 사람들에게는 각각 1번부터 n번까지 번호가 매겨져 있습니다.
   n명이 사람을 줄을 서는 방법은 여러가지 방법이 있습니다.
   예를 들어서 3명의 사람이 있다면 다음과 같이 6개의 방법이 있습니다.
     [1, 2, 3]
     [1, 3, 2]
     [2, 1, 3]
     [2, 3, 1]
     [3, 1, 2]
     [3, 2, 1]

   사람의 수 n과, 자연수 k가 주어질 때,
   사람을 나열 하는 방법을 사전 순으로 나열 했을 때,
   k번째 방법을 return하는 solution 함수를 완성해주세요.

  - 조건
   1) n은 20이하의 자연수 입니다.
   2) k는 n! 이하의 자연수 입니다.

 */

import java.util.ArrayList;

public class Lv2_50 {

    //배열에 들어갈 수 있는 최댓값
    static int max = 10000000;


    public static void main(String[] args) {

        int[] solution = solution(3, 5);

        System.out.print(solution);
        for(int s : solution) {
            System.out.print(s);
        }
    }


    public static int[] solution(int n, long k) {
        int[] answer = new int[n];

        ArrayList<Integer> list = new ArrayList<>();
        long factorial = 1;
        int idx = 0;

        // 팩토리얼과 사람 리스트 구하기
        for (int i = 1; i <= n; i++) {
            factorial *= i;
            list.add(i);
        }

        // 인덱스를 맞추기 위해 k--
        k--;

        while (n > 0) {
            // 각 자리에 자리에 들어갈 경우의 수
            factorial /= n;
            // 자리 숫자 결정
            int val = (int) (k / factorial);
            // 정답 배열에 숫자 삽입
            answer[idx] = list.get(val);
            list.remove(val);

            // 다음 자리수를 구하기 위해 k값 변경
            k %= factorial;
            idx++;
            n--;
        }
        return answer;
    }

}

/*

3	5	[3,1,2]

 */


