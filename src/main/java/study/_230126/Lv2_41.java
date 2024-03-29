package study._230126;

/*

  - 문제
   124 나라가 있습니다. 124 나라에서는 10진법이 아닌 다음과 같은 자신들만의 규칙으로 수를 표현합니다.
     1. 124 나라에는 자연수만 존재합니다.
     2. 124 나라에는 모든 수를 표현할 때 1, 2, 4만 사용합니다.
   예를 들어서 124 나라에서 사용하는 숫자는 다음과 같이 변환됩니다.
     10진법	124나라	10진법	124나라
     1	    1	    6	    14
     2	    2	    7	    21
     3	    4	    8	    22
     4	    11  	9	    24
     5	    12	    10	    41
   자연수 n이 매개변수로 주어질 때, n을 124 나라에서 사용하는 숫자로 바꾼 값을 return 하도록 solution 함수를 완성해 주세요.

  - 조건
   1) n은 50,000,000이하의 자연수 입니다.

 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Lv2_41 {

    public static void main(String[] args) {

        String solution = solution(1);

        System.out.print(solution);
    }

    public static String solution(int n) {

        String answer = "";
        int[] values = {0,1,2,4};
        List<Integer> remainders = new ArrayList<>();

        while(n > 3){
            int q = n / 3;  //3
            int r = n % 3;  //0

            if(r == 0){
                q = q-1;      //2
                r = r+3;      //3
            }
            n = q;
            remainders.add(r);
        }

        if(n < 4){
            remainders.add(n);
        }

        StringBuffer sb = new StringBuffer();
        remainders.stream()
                .forEachOrdered(v -> sb.append(values[v]));

        answer = sb.reverse().toString();

        return answer;
    }
}

/*

 */


