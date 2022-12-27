package study._221223;

/*

  - 문제
   머쓱이는 태어난 지 11개월 된 조카를 돌보고 있습니다.
   조카는 아직 "aya", "ye", "woo", "ma" 네 가지 발음과
   네 가지 발음을 조합해서 만들 수 있는 발음밖에 하지 못하고
   연속해서 같은 발음을 하는 것을 어려워합니다.
   문자열 배열 babbling이 매개변수로 주어질 때,
   머쓱이의 조카가 발음할 수 있는 단어의 개수를 return하도록 solution 함수를 완성해주세요.

  - 제한사항
   1) 1 ≤ babbling의 길이 ≤ 100
   2) 1 ≤ babbling[i]의 길이 ≤ 30
   3) 문자열은 알파벳 소문자로만 이루어져 있습니다.

 */

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Lv2_33 {

    public static void main(String[] args) {

        int solution = solution(new String[]{"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"});

        System.out.println(solution);
    }

    public static int solution(String[] babbling) {

        String[] keyword = {"aya", "ye", "woo", "ma"};

        int answer = 0;

        for (String babble : babbling) {
            babble = replaceKeyword(keyword, babble);

            if (babble.matches("^[0-9]*$") && isContinuity(babble)) {
                answer++;
            }
        }

        return answer;
    }

    private static String replaceKeyword(String[] keyword, String babble) {
        for (int i = 0; i < keyword.length; i++) {
            babble = babble.replaceAll(keyword[i], String.valueOf(i));
        }
        return babble;
    }

    private static boolean isContinuity(String babble) {
        for (int i = 0; i < babble.length()-1; i++) {
            if (babble.charAt(i) == babble.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
}

/*



 */

