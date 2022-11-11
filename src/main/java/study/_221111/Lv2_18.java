package study._221111;

/*

  - 문제
   철수와 영희는 선생님으로부터 숫자가 하나씩 적힌 카드들을 절반씩 나눠서 가진 후,
   다음 두 조건 중 하나를 만족하는 가장 큰 양의 정수 a의 값을 구하려고 합니다.
     1. 철수가 가진 카드들에 적힌 모든 숫자를 나눌 수 있고 영희가 가진 카드들에 적힌 모든 숫자들 중 하나도 나눌 수 없는 양의 정수 a
     2. 영희가 가진 카드들에 적힌 모든 숫자를 나눌 수 있고, 철수가 가진 카드들에 적힌 모든 숫자들 중 하나도 나눌 수 없는 양의 정수 a

   예를 들어, 카드들에 10, 5, 20, 17이 적혀 있는 경우에 대해 생각해 봅시다.
   만약, 철수가 [10, 17]이 적힌 카드를 갖고, 영희가 [5, 20]이 적힌 카드를 갖는다면 두 조건 중 하나를 만족하는 양의 정수 a는 존재하지 않습니다.
   하지만, 철수가 [10, 20]이 적힌 카드를 갖고, 영희가 [5, 17]이 적힌 카드를 갖는다면,
   철수가 가진 카드들의 숫자는 모두 10으로 나눌 수 있고, 영희가 가진 카드들의 숫자는 모두 10으로 나눌 수 없습니다.
   따라서 철수와 영희는 각각 [10, 20]이 적힌 카드, [5, 17]이 적힌 카드로 나눠 가졌다면 조건에 해당하는 양의 정수 a는 10이 됩니다.

   철수가 가진 카드에 적힌 숫자들을 나타내는 정수 배열 arrayA와 영희가 가진 카드에 적힌 숫자들을 나타내는 정수 배열 arrayB가 주어졌을 때,
   주어진 조건을 만족하는 가장 큰 양의 정수 a를 return하도록 solution 함수를 완성해 주세요.
   만약, 조건을 만족하는 a가 없다면, 0을 return 해 주세요.

  - 제한사항
   1) 1 ≤ arrayA의 길이 = arrayB의 길이 ≤ 500,000
   2) 1 ≤ arrayA의 원소, arrayB의 원소 ≤ 100,000,000
   3) arrayA와 arrayB에는 중복된 원소가 있을 수 있습니다.

 */

import java.util.*;
import java.util.stream.Collectors;


public class Lv2_18 {

    public static void main(String[] args) {

        int solution = solution(new int[]{10, 17}, new int[]{5, 20});
        System.out.println(solution);
    }

    public static int solution(int[] arrayA, int[] arrayB) {

        int answer = 0;
        int num = 0;
        boolean isPrime = true;

        List<Integer> listA = Arrays.stream(arrayA).boxed().collect(Collectors.toList());
        List<Integer> listB = Arrays.stream(arrayB).boxed().collect(Collectors.toList());
        List<Integer> listAll = new ArrayList<Integer>();

        listA.addAll(listB);

        listAll = listA;

        listA = new ArrayList<Integer>();
        listB = new ArrayList<Integer>();

        for(int i=0; i<listAll.size(); i++) {

            num = listAll.get(i);

            for(int j=2; j<=num/2; j++) {

                if(num%j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime) {
                listB.add(num);
            } else {
                listA.add(num);
            }

            isPrime = true;
        }

        Collections.sort(listA);
        for(int i=2; i<listA.get(listA.size()-1); i++) {

            int chkNum = 0;

            for(int j=0; j<listA.size(); j++) {

                if(listA.get(j) % i != 0) {
                    chkNum = 1;
                    break;
                }
            }

            if(chkNum == 0) {
                for(int j=0; j<listB.size(); j++) {

                    if(listB.get(j) % i == 0) {
                        chkNum = 1;
                        break;
                    }
                }

                if(chkNum == 0) {
                    answer = i;
                }
            }
        }
        //5 10 17 20
        /*
        * 5 10      17 20
        * 5 17      10 20
        * 5 20      10 17
        * 10 17     5  20
        * 10 20     5  17
        * 17 20     5  10
        * */
        return answer;
    }

}

/*

[10, 17]	[5, 20]	0
[10, 20]	[5, 17]	10
[14, 35, 119]	[18, 30, 102]	7

 */


