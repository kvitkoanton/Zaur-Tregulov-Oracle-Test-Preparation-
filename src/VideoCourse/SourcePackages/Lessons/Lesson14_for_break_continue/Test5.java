package VideoCourse.SourcePackages.Lessons.Lesson14_for_break_continue;

public class Test5 {
    public static void main(String[] args) {
        System.out.println("Loop 1:");
        for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                break; //заканчивает работу цикла
            }
            System.out.println(i);
        }

        System.out.println("\nLoop 2:");

        for (int i = 1; i <= 100; i++) {
            if (i == 87) {
                continue; //продолжает работу цикла, но без вывода 87
            }
            System.out.println(i);
        }
    }
}
