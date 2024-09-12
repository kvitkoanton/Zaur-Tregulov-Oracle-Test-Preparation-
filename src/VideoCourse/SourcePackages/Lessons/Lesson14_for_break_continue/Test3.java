package VideoCourse.SourcePackages.Lessons.Lesson14_for_break_continue;

public class Test3 {

    public static void main(String[] args) {
        System.out.println("Loop 1:");
        for (int i = 2; i <= 30; i += 2){
            System.out.println(i);
        }
        System.out.println("\nloop 2:");
        for (int i = 2; i <+ 30; i += 2){
            System.out.println(i);
        }

        System.out.println("\nif statement:");
        int j = 2;
        if (j < 3) {
            System.out.println("Lower than 3");
        }
    }

}
