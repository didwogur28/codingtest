package study._220919;

/*
 * 함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다.
 * 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
 *
 * 제한사항: x는 -10000000 이상, 10000000 이하인 정수입니다. / n은 1000 이하인 자연수입니다.
 */

public class Lv1_12 {

    public static void main(String[] args) {

        long[] soluion = solution(-4, 2);

        for(int i=0; i<soluion.length; i++) {
            System.out.println(soluion[i]);
        }

    }

    public static long[] solution(int x, int n) {

        long[] answer = {};
        int i=0;
        long num = 0;

        answer = new long[n];
        num = x;
        while(i < n) {
            answer[i] = num;

            num = num+x;
            i++;
        }

        return answer;
    }
}


/*



 */


