package study._220929;

/*

  - 문제
   1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.
   소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다. (1은 소수가 아닙니다.)

  - 제한사항
   1) n은 2이상 1000000이하의 자연수입니다.

 */


import java.util.Arrays;

public class Lv1_44 {

    public static void main(String[] args) {

        int solution = solution(20);

        System.out.println(solution);
    }

    public static int solution(int n) {
        int answer = 0;

        // 에라토스테네스의 체
        int[] filter = new int[n + 1];
        Arrays.fill(filter, 1);

        // 0, 1은 소수가 아님
        filter[0] = 0;
        filter[1] = 0;

        for (int i = 2; i < Math.sqrt(n) + 1; i++){

            if (filter[i] == 1){
                for (int j = i * 2; j <= n; j+=i){
                    filter[j] = 0;
                }
            }
        }

        for (int check: filter){
            if (check == 1){
                answer++;
            }
        }

        return answer;
    }
}


/*

    - 에라토스테네스의 체
     > int[] filter = new int[n + 1];
       Arrays.fill(filter, 1);
     > n+1개의 배열 선언 후 일단 1로 모두 채움

 */


