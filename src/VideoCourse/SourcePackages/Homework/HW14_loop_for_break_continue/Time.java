package VideoCourse.SourcePackages.Homework.HW14_loop_for_break_continue;

public class Time {
    static int hour;
    static int minute;
    static int second;

    static void time() {
        OUTER:
        for (hour = 0; hour <= 6; hour++) {
            INNER1:
            for (minute = 0; minute <= 59; minute++) {
                if((hour > 1) && (minute % 10 == 0)) {
                    break OUTER;
                }
                INNER2:
                for (second = 0; second <= 59; second++) {
                    if((second * hour) > minute) {
                        continue INNER1;
                    }
                    System.out.println(hour + ":" + minute + ":" + second);
                }
            }
        }
    }
}
    class TestTime{
        public static void main(String[] args) {
            Time time = new Time();
            time.time();
        }
    }

