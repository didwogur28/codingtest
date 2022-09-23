package study._220923;

/*

  - 문제
   이 문제에는 표준 입력으로 두 개의 정수 n과 m이 주어집니다.
   별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력해보세요.

  - 제한사항
   1) n과 m은 각각 1000 이하인 자연수입니다.

 */


import java.util.Scanner;

public class Lv1_29 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i=1; i<=b; i++) {
            for(int j=1; j<=a; j++) {
                System.out.print("*");

                if(j == a) {
                    System.out.println();
                }
            }
        }
    }

    public static long solution(int price, int money, int count) {
        long answer = -1;
        long sum = 0;

        for(int i=1; i<=count; i++) {
            sum += (i*price);
        }


        return money - sum < 0 ? sum-money : 0;
    }
}


/*


 */


