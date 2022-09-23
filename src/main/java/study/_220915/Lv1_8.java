package study._220915;

/*

  - 문제
   대문자와 소문자가 섞여있는 문자열 s가 주어집니다.
   s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성하세요.
   'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다.
   예를 들어 s가 "pPoooyY"면 true를 return하고 "Pyy"라면 false를 return합니다.

  - 제한사항
   1) 문자열 s의 길이 : 50 이하의 자연수
   2) 문자열 s는 알파벳으로만 이루어져 있습니다.

 */

public class Lv1_8 {

    public static void main(String[] args) {

        solution("pPoooyY");
    }

    public static boolean solution(String s) {

        boolean answer = true;

        int p = 0;
        int y = 0;

        String[] charSplit = s.split("");

        for(int i=0; i<charSplit.length; i++) {

            if("p".equals(charSplit[i]) || "P".equals(charSplit[i])) {
                p++;
            }

            if("s".equals(charSplit[i]) || "S".equals(charSplit[i])) {
                y++;
            }
        }

        answer = p == y ? true : false;

        System.out.println("p : "+p);
        System.out.println("y : "+y);
        System.out.println("anser : "+answer);
        return answer;
    }
}


/*

class Solution {
    boolean solution(String s) {
        s = s.toUpperCase();        // 모두 대문자 화

        return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
    }
}

 */


