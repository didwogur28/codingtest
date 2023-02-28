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

    public static void main(String[] args) {

        int[] solution = solution(6, 4, new int[][]{{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}});

        for(int i: solution) {
            System.out.println(i);
        }
    }

    public static int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;

        int[] answer = new int[2];

        for(int i=0; i< picture.length; i++) {

        }
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;


        return answer;
    }
}

/*

6	4	[[1, 1, 1, 0], [1, 2, 2, 0], [1, 0, 0, 1], [0, 0, 0, 1], [0, 0, 0, 3], [0, 0, 0, 3]]	[4, 5]

 */


