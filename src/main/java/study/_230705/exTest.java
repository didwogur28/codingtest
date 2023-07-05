package study._230705;

public class exTest {

    public static void main(String[] args) throws Exception {
        solution(new int[]{-10, -4, -3, -1, 0, 1, 4, 7, 10, 13, 15});
    }

    public static void solution(int[] args) {

        for(int i=0; i<args.length; i++) {
            if(i == args[i]) {
                System.out.println(args[i]);
            }
        }
    }
}
