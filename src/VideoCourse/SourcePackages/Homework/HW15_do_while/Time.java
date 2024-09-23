package VideoCourse.SourcePackages.Homework.HW15_do_while;

public class Time {
    static int hour;
    static int minute;
    static int second;

    static void time() {
        OUTER:
        //while loop
        while (hour <= 6) {
            MIDDLE:
            //do while
            do {
                if ((hour > 1) && (minute % 10 == 0)) {
                    break OUTER;
                }
                second = 0;
                INNER:
                //while loop
                while (second <= 59) {
                    if ((second * hour) > minute) {
                        minute++;
                        continue MIDDLE;
                    }
                    System.out.println(hour + ":" + minute + ":" + second);
                    second++;
                }
                minute++;
            } while (minute <= 59);
            hour++;
            minute = 0;
        }
    }
}
class TestTime{
    public static void main(String[] args) {
        Time time = new Time();
        time.time();
    }
}


