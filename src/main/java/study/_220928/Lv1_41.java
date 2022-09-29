package study._220928;

/*

  - 문제
   정수 배열 numbers가 주어집니다.
   numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.

  - 제한사항
   1) numbers의 길이는 2 이상 100 이하입니다.
   2) numbers의 모든 수는 0 이상 100 이하입니다.

 */


import java.util.ArrayList;
import java.util.Arrays;

public class Lv1_41 {

    public static void main(String[] args) {

        int[] solution = solution(new int[]{5,0,2,7});

        for(int i=0; i< solution.length; i++) {
            System.out.println(solution[i]);
        }


    }

    public static int[] solution(int[] numbers) {

        int[] answer = {};

        int num = 1;

        java.util.ArrayList<Integer> arrayList = new java.util.ArrayList<Integer>();

        for(int i=0; i<numbers.length; i++) {
            for(int j=num; j<numbers.length; j++) {

                if(!arrayList.contains(numbers[i] + numbers[j])) {
                    arrayList.add(numbers[i] + numbers[j]);
                }
            }
            num++;
        }

        answer = new int[arrayList.size()];
        for(int i=0; i< arrayList.size(); i++) {
            answer[i] = arrayList.get(i);
        }

        java.util.Arrays.sort(answer);
        return answer;
    }
}


/*


 */


