package VideoCourse.SourcePackages.Lessons.Lesson13_switch_case;

public class Employee {
    public static void main(String[] args) {
        switch ("sgas") { // могут быть только byte, short, int, char, String
            case "Monday":
                System.out.println("Work until 18:00");
                break;
            case "Tuesday":
                System.out.println("Work until 18:00");
                break;
            case "Wednesday":
                System.out.println("Work until 18:00");
                break;
            case "Thursday":
                System.out.println("Work until 18:00");
                break;
            case "Friday":
                System.out.println("Work until 18:00");
                break;
            case "Saturday":
                System.out.println("Work until 14:00");
                break;
            case "Sunday":
                System.out.println("No work");
                break;
            default:
                System.out.println("There is a mistake in day name");
        }
    }

}
