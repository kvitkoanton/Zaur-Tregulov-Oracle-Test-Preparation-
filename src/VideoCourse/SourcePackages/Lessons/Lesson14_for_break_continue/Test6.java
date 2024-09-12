package VideoCourse.SourcePackages.Lessons.Lesson14_for_break_continue;

public class Test6 {
    public void time() {
        OUTER:for (int hour = 0; hour <= 23; hour++) {
            System.out.println("The beginning of outer loop");

            INNER:for (int minute = 0; minute <= 59; minute++) {
                if (minute == 20){
                    continue OUTER;
                }
                System.out.println(hour + ":" + minute);
            }
            System.out.println("The end of outer loop");
        }
    }

    public static void main(String[] args) {
        Test6 test6 = new Test6();
        test6.time();
    }

}
