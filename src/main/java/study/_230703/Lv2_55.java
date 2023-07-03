package study._230703;


public class Lv2_55 {

    private static final int MAX_TIME = 1_450; // 24*60 + 10;
    private static final int HOUR = 60;
    private static final int CLEAN_TIME = 10; // 청소시간

    public static void main(String[] args) throws Exception {
        System.out.println(solution(new String[][]{{"09:10", "10:10"}, {"10:20", "12:20"}}));
    }

    public static int solution(String[][] book_time) {

        int anwser = 0;

        int[] rooms = new int[MAX_TIME];

        for (String[] time : book_time) {
            String stTime = time[0];
            String edTime = time[1];

            rooms[roomSch(stTime)] += 1;

            rooms[roomSch(edTime) + CLEAN_TIME] += -1;
        }

        for (int i=1; i<MAX_TIME; i++) {
            rooms[i] += rooms[i-1];
            anwser = Math.max(anwser, rooms[i]);
        }

        return anwser;
    }

    public static int roomSch(String time) {

        String[] times = time.split(":");

        return Integer.parseInt(times[0]) * HOUR + Integer.parseInt(times[1]);
    }

}
