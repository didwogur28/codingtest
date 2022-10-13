package study._221013;

/*

  - 문제
   점심시간에 도둑이 들어, 일부 학생이 체육복을 도난당했습니다.
   다행히 여벌 체육복이 있는 학생이 이들에게 체육복을 빌려주려 합니다.
   학생들의 번호는 체격 순으로 매겨져 있어, 바로 앞번호의 학생이나 바로 뒷번호의 학생에게만 체육복을 빌려줄 수 있습니다.
   예를 들어, 4번 학생은 3번 학생이나 5번 학생에게만 체육복을 빌려줄 수 있습니다.
   체육복이 없으면 수업을 들을 수 없기 때문에 체육복을 적절히 빌려 최대한 많은 학생이 체육수업을 들어야 합니다.
   전체 학생의 수 n, 체육복을 도난당한 학생들의 번호가 담긴 배열 lost,
   여벌의 체육복을 가져온 학생들의 번호가 담긴 배열 reserve가 매개변수로 주어질 때,
   체육수업을 들을 수 있는 학생의 최댓값을 return 하도록 solution 함수를 작성해주세요.

  - 제한사항
   1) 전체 학생의 수는 2명 이상 30명 이하입니다.
   2) 체육복을 도난당한 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
   3) 여벌의 체육복을 가져온 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
   4) 여벌 체육복이 있는 학생만 다른 학생에게 체육복을 빌려줄 수 있습니다.
   5) 여벌 체육복을 가져온 학생이 체육복을 도난당했을 수 있습니다. 이때 이 학생은 체육복을 하나만 도난당했다고 가정하며, 남은 체육복이 하나이기에 다른 학생에게는 체육복을 빌려줄 수 없습니다.

 */


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lv1_50 {

    public static void main(String[] args) {

        int solution = solution(5, new int[]{2,4}, new int[]{1,3,5});

        System.out.println(solution);
    }

    public static int solution(int n, int[] lost, int[] reserve) {

        //교집합 제거를 위한 교집합 생성
        Set<Integer> realReserve, realLost, retainSet;

        realReserve = Arrays.stream(reserve).boxed().collect(java.util.stream.Collectors.toSet());
        realLost = Arrays.stream(lost).boxed().collect(java.util.stream.Collectors.toSet());

        retainSet = new HashSet<>(realReserve);
        retainSet.retainAll(realLost);


        realReserve.removeAll(retainSet);
        realLost.removeAll(retainSet);

        //이 부분에서 if문의 순서가 바뀌면 어떻게 될지 생각해 보세요.
        for (int r : realReserve)
            if (realLost.contains(r - 1))
                realLost.remove(r - 1);
            else if (realLost.contains(r + 1))
                realLost.remove(r + 1);

        return n - realLost.size();

    }
}

/*

    - Arrays.stream().boxed()
     > int[]로 생성된 배열을 원하는 collecter로 셋팅하기 위하여 선언

    - A.retailAll(B)
     > A와 B의 공통 요소만 남기고 모두 제거 -> 교집합

 */


