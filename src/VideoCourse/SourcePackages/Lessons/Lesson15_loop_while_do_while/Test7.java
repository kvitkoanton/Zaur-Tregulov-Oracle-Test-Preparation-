package VideoCourse.SourcePackages.Lessons.Lesson15_loop_while_do_while;

public class Test7 {
    public static void main(String[] args) {
        int money = 100;
        do{
            System.out.println("Make a bit");
            System.out.println("You are loose");
            money -=10;
        }
        while (money > 500); //выполняется минимум 1 раз
    }
}
