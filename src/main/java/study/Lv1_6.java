package study;

/*
 * 임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
 * n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고,
 * n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
 *
 * 제한사항: n은 1이상, 50000000000000 이하인 양의 정수입니다.
 */

public class Lv1_6 {

    public static void main(String[] args) {

        class Solution {

            public long solution(long n) {

                long x = (long)Math.sqrt(n);

                if(Math.pow(x,2)==n){
                    return (long)Math.pow(x+1,2);
                }else {
                    return -1;
                }
            }
        }
    }
}
