package study._221020;

/*

  - 문제
   JadenCase란 모든 단어의 첫 문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열입니다.
   단, 첫 문자가 알파벳이 아닐 때에는 이어지는 알파벳은 소문자로 쓰면 됩니다.
   문자열 s가 주어졌을 때, s를 JadenCase로 바꾼 문자열을 리턴하는 함수, solution을 완성해주세요.

  - 제한사항
   1) s는 길이 1 이상 200 이하인 문자열입니다.
   2) s는 알파벳과 숫자, 공백문자(" ")로 이루어져 있습니다.
     - 숫자는 단어의 첫 문자로만 나옵니다.
     - 숫자로만 이루어진 단어는 없습니다.
     - 공백문자가 연속해서 나올 수 있습니다.

 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class Lv2_2 {

    public static void main(String[] args) {

        String solution = solution("for the last week");
        System.out.print("/"+solution+"/");
    }

    public static String solution(String s) {

        String chgS = s.replaceAll(" ", "@");

        String answer = "";
        String splitArg = "";
        int upCaseChk = 0;

        for(int i=0; i<chgS.split("").length; i++) {

            splitArg = chgS.split("")[i];

            if(splitArg.equals("@")) {
                answer += " ";
                upCaseChk = 1;
            } else {
                if(upCaseChk==1) {
                    answer += splitArg.toUpperCase(Locale.ROOT);

                } else if (i == 0){
                    answer += splitArg.toUpperCase(Locale.ROOT);
                } else {
                    answer += splitArg.toLowerCase(Locale.ROOT);
                }
                upCaseChk = 0;
            }
        }

        return answer;
    }
}

/*

 */


