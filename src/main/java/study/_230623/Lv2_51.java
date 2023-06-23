package study._230623;

public class Lv2_51 {

    public static void main(String[] args) {

        System.out.println(solution(2, 3));
    }

    public static long solution ( int r1, int r2){

        long answer = 0;
        long side = 0;

        long r1x = (long) Math.pow(r1, 2);
        long r2x = (long) Math.pow(r2, 2);

        for (int i = 0; i <= r2; i++) {

            long y2 = (long) Math.sqrt(r2x - Math.pow(i, 2));
            long y1 = (long) Math.sqrt(r1x - Math.pow(i, 2));

            if(Math.sqrt(r1x - Math.pow(i, 2)) % 1 == 0) {
                side++;
            }

            answer += (y2 - y1) * 4;
        }

        answer += side * 4 - 4;
        return answer;
    }
}
