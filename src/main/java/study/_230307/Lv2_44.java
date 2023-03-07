package study._230307;

/*

  - 문제
   가로 길이가 2이고 세로의 길이가 1인 직사각형모양의 타일이 있습니다.
   이 직사각형 타일을 이용하여 세로의 길이가 2이고 가로의 길이가 n인 바닥을 가득 채우려고 합니다.
   타일을 채울 때는 다음과 같이 2가지 방법이 있습니다.
    1) 타일을 가로로 배치 하는 경우
    2) 타일을 세로로 배치 하는 경우
   직사각형의 가로의 길이 n이 매개변수로 주어질 때, 이 직사각형을 채우는 방법의 수를 return 하는 solution 함수를 완성해주세요.

  - 조건
   1) 가로의 길이 n은 60,000이하의 자연수 입니다.
   2) 경우의 수가 많아 질 수 있으므로, 경우의 수를 1,000,000,007으로 나눈 나머지를 return해주세요.

 */

import java.util.ArrayList;
import java.util.List;

public class Lv2_44 {

    public static void main(String[] args) {

        int solution = solution(4);
        System.out.print(solution);
    }

    public static int solution(int n) {
        int answer = 0;

        int[] Arrays = new int[600001];

        Arrays[1] = 1;
        Arrays[2] = 2;

        for(int i=3; i<=n; i++) {
            Arrays[i] = (Arrays[i-1] + Arrays[i-2]) % 1000000007;
        }
        return Arrays[n];
    }
}

/*

4	5

 */


