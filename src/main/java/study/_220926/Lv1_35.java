package study._220926;

/*

  - 문제
   어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
   예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다.
   "z"는 1만큼 밀면 "a"가 됩니다.
   문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.

  - 제한사항
   1) 공백은 아무리 밀어도 공백입니다.
   2) s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.
   3) s의 길이는 8000이하입니다.
   4) n은 1 이상, 25이하인 자연수입니다.

 */


import java.util.Arrays;

public class Lv1_35 {

    public static void main(String[] args) {

        String solution = solution("AB", 1);
        System.out.println(solution);
    }

    public static String solution(String s, int n) {
        String answer = "";
        int size = s.length();

        char[] arr = new char[s.length()];

        for(int i=0; i<s.length(); i++){
            arr[i] = s.charAt(i);
        }

        for(int i=0; i<size; i++){
            if(arr[i] == ' ')continue;
            for(int j=1; j<=n; j++){
                if(arr[i] == 'z'){
                    arr[i] = 'a';
                    continue;
                }
                else if(arr[i] == 'Z'){
                    arr[i] = 'A';
                    continue;
                }
                arr[i] = (char)(arr[i] + 1);
            }
        }

        answer = new String(arr);

        return answer;
    }
}


/*

 */


