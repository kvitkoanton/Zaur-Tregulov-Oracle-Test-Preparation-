package VideoCourse.SourcePackages.Lessons.Lesson15_loop_while_do_while;

public class Test2 {
    public static void main(String[] args) {
        int money = 100;

        while (money > 0){
            System.out.println("Make a bit");
            System.out.println("You are loose");
            money -= 4;
            System.out.println("The rest of money: " + money);
        }
    }
}
