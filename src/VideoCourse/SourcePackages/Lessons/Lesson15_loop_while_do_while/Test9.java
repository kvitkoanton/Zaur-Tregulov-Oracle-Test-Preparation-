package VideoCourse.SourcePackages.Lessons.Lesson15_loop_while_do_while;

public class Test9 {
    public static void main(String[] args) {
        int hour = 0;
        OUTER:
        do {
            int minute = 0;
            INNER1:
            while (minute < 60) {
                if (minute == 21) {
                    break INNER1;
                }
                System.out.println(hour + ":" + minute);
                minute++;
            }
            hour++;
        } while (hour < 24);
    }
}