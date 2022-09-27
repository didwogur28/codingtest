package study._220927;

/*

  - 문제
   네오와 프로도가 숫자놀이를 하고 있습니다.
   네오가 프로도에게 숫자를 건넬 때 일부 자릿수를 영단어로 바꾼 카드를 건네주면 프로도는 원래 숫자를 찾는 게임입니다.
   다음은 숫자의 일부 자릿수를 영단어로 바꾸는 예시입니다.
     1478 → "one4seveneight"
     234567 → "23four5six7"
     10203 → "1zerotwozero3"
   이렇게 숫자의 일부 자릿수가 영단어로 바뀌어졌거나, 혹은 바뀌지 않고 그대로인 문자열 s가 매개변수로 주어집니다.
   s가 의미하는 원래 숫자를 return 하도록 solution 함수를 완성해주세요.
   참고로 각 숫자에 대응되는 영단어는 다음 표와 같습니다.
     0	zero
     1	one
     2	two
     3	three
     4	four
     5	five
     6	six
     7	seven
     8	eight
     9	nine

  - 제한사항
   1) 1 ≤ s의 길이 ≤ 50
   2) s가 "zero" 또는 "0"으로 시작하는 경우는 주어지지 않습니다.
   3) return 값이 1 이상 2,000,000,000 이하의 정수가 되는 올바른 입력만 s로 주어집니다.

 */


import java.util.Arrays;

public class Lv1_40 {

    public static void main(String[] args) {

        int solution = solution("123");

        System.out.println(solution);

    }

    public static int solution(String s) {

        String answer = "";
        String chkNum = "";

        for(int i=0; i<s.split("").length; i++) {

            chkNum = chkNum + s.split("")[i];

            try {
                Integer.parseInt(chkNum);
                answer = answer + chkNum;
                chkNum = "";

            } catch (Exception e) {

                if(!chgNum(chkNum).equals("non")) {
                    answer = answer + chgNum(chkNum);
                    chkNum = "";
                }
            }
        }

        return Integer.parseInt(answer);
    }

    public static String chgNum(String arg) {

        String chgNum = "";

        switch (arg) {
            case "zero": chgNum = "0"; break;
            case "one": chgNum = "1"; break;
            case "two": chgNum = "2"; break;
            case "three": chgNum = "3"; break;
            case "four": chgNum = "4"; break;
            case "five": chgNum = "5"; break;
            case "six": chgNum = "6"; break;
            case "seven": chgNum = "7"; break;
            case "eight": chgNum = "8"; break;
            case "nine": chgNum = "9"; break;
            default: chgNum = "non"; break;
        }

        return chgNum;
    }
}


/*

"one4seveneight"	1478
"23four5six7"	234567
"2three45sixseven"	234567
"123"	123

 */


