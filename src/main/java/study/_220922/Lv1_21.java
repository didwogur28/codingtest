package study._220922;

/*

  - 문제
   0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다.
   numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.

  - 제한사항
   1) 1 ≤ numbers의 길이 ≤ 9
   2) 0 ≤ numbers의 모든 원소 ≤ 9
   3) numbers의 모든 원소는 서로 다릅니다.

 */


public class Lv1_21 {

    public static void main(String[] args) {

        int solution = solution(new int[] {5,8,4,0,6,7,9});

        System.out.println(solution);

    }

    public static int solution(int[] numbers) {

        int answer = 0;

        for (int i=0; i<numbers.length; i++) {
            answer += numbers[i];
        }

        answer = 45 - answer;
        return answer;
    }
}


/*

    - Arrays.stream(numbers).sum();
     > 배열의 요소들을 모두 합
     
 */


