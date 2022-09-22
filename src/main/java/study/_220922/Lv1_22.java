package study._220922;

/*
 * 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요.
 * 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
 *
 * 제한사항: s는 길이가 1 이상, 100이하인 스트링입니다.
 */


public class Lv1_22 {

    public static void main(String[] args) {

        String solution = solution("ab");

        System.out.println(solution);

    }

    public static String solution(String s) {

        int cnt = s.length()/2;

        return s.length() % 2 != 0 ? s.split("")[cnt] : s.substring(cnt-1, cnt+1);
    }
}


/*

 */


