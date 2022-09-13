package study;

public class Lv1_1 {

    public static void main(String[] args) {
        Long answer = solution(3, 5);

        System.out.println(answer);
    }

    public long solution(int a, int b) throws Exception {

        if(a<-10000000 || a>10000000 || b<-10000000 || b>10000000) throw new Exception("out of range");

        long answer = 0;
        int minus = 0;

        if(a != b) {

            minus = (a>b) ? a-b : b-a;
            answer = (a>b) ? b : a;

            for (int i=1; i<=minus; i++) {
                answer += (answer+i);
            }

        } else {
            answer = a;
        }

        return answer;
    }
}
