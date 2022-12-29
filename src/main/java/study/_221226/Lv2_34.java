package study._221226;

/*

  - 문제
   햄버거 가게에서 일을 하는 상수는 햄버거를 포장하는 일을 합니다.
   함께 일을 하는 다른 직원들이 햄버거에 들어갈 재료를 조리해 주면 조리된 순서대로 상수의 앞에 아래서부터 위로 쌓이게 되고,
   상수는 순서에 맞게 쌓여서 완성된 햄버거를 따로 옮겨 포장을 하게 됩니다.
   상수가 일하는 가게는 정해진 순서(아래서부터, 빵 – 야채 – 고기 - 빵)로 쌓인 햄버거만 포장을 합니다.
   상수는 손이 굉장히 빠르기 때문에 상수가 포장하는 동안 속 재료가 추가적으로 들어오는 일은 없으며,
   재료의 높이는 무시하여 재료가 높이 쌓여서 일이 힘들어지는 경우는 없습니다.

   예를 들어, 상수의 앞에 쌓이는 재료의 순서가 [야채, 빵, 빵, 야채, 고기, 빵, 야채, 고기, 빵]일 때,
   상수는 여섯 번째 재료가 쌓였을 때, 세 번째 재료부터 여섯 번째 재료를 이용하여 햄버거를 포장하고,
   아홉 번째 재료가 쌓였을 때, 두 번째 재료와 일곱 번째 재료부터 아홉 번째 재료를 이용하여 햄버거를 포장합니다.
   즉, 2개의 햄버거를 포장하게 됩니다.

   상수에게 전해지는 재료의 정보를 나타내는 정수 배열 ingredient가 주어졌을 때,
   상수가 포장하는 햄버거의 개수를 return 하도록 solution 함수를 완성하시오.

  - 제한사항
   1) 1 ≤ ingredient의 길이 ≤ 1,000,000
   2) ingredient의 원소는 1, 2, 3 중 하나의 값이며, 순서대로 빵, 야채, 고기를 의미합니다.

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class Lv2_34 {

    public static void main(String[] args) {

        int solution = solution(new int[]{2, 1, 1, 2, 3, 1, 2, 3, 1});

        System.out.println(solution);
    }

    public static int solution(int[] ingredient) {

        //  리턴할 변수 answer 0으로 초기화, 주어진 재료로 햄버거를 하나도 못만드는 경우가 발생할 수 도 있고, 햄버거를 만들때마다 하나씩 증가
        int answer = 0;

        // Stack 으로 처리를 해주고자, data (Stack) 선언
        Stack data = new Stack();

        // ingredient 원소를 스택에 하나씩 대입하며, 비교
        for (int i : ingredient){

            // 햄버거가 만들어지려면, 빵이 맨위에 쌓여야 하기때문에,
            // i 값이 1 일경우, index error를 피하기위해 stack의 데이터가 3이상일때,
            // 현재 스택에쌓여있는 원소들을 비교하고자 lastIndexOf() 메서드를 사용하여,
            // 3(고기) 이 스택의 마지막, 그 다음 2(야채)가, 그다음 1(빵) 인지 확인
            if (i == 1 &&
                data.size() >= 3 &&
                data.lastIndexOf(3) == data.size()-1 &&
                data.lastIndexOf(2) == data.size()-2 &&
                data.lastIndexOf(1) == data.size()-3)
            {
                // 주어진 데이터가 조건을 만족하면, 만든 햄버거의 갯수 추가하고, 스택에있던 재료를 사용했음으로 pop을 세번하여 재료를 제거
                answer++;
                data.pop();
                data.pop();
                data.pop();

            }else
                // 조건을 만족하지 못할경우 i 를 그냥 스택에 추가
                data.add(i); //
        }
        return answer;
    }
}

/*

 */


