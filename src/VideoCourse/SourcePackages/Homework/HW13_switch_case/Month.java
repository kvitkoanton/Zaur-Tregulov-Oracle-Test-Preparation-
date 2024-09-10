package VideoCourse.SourcePackages.Homework.HW13_switch_case;
import static VideoCourse.SourcePackages.Homework.HW13_switch_case.MonthData.*;
public class Month {

    public static void monthNumber(int monthNumber) {
        switch (monthNumber) {
            case 1:
                System.out.println("There are " + januaryNumberOfDays + " days in " + january);
                break;
            case 2:
                System.out.println("There are " + februaryNumberOfDays + " days in " + february);
                break;
            case 3:
                System.out.println("There are " + marchNumberOfDays + " days in " + march);
                break;
            case 4:
                System.out.println("There are " + aprilNumberOfDays + " days in " + april);
                break;
            case 5:
                System.out.println("There are " + mayNumberOfDays + " days in " + may);
                break;
            case 6:
                System.out.println("There are " + juneNumberOfDays + " days in " + june);
                break;
            case 7:
                System.out.println("There are " + julyNumberOfDays + " days in " + july);
                break;
            case 8:
                System.out.println("There are " + augustNumberOfDays + " days in " + august);
                break;
            case 9:
                System.out.println("There are " + septemberNumberOfDays + " days in " + september);
                break;
            case 10:
                System.out.println("There are " + oktoberNumberOfDays + " days in " + oktober);
                break;
            case 11:
                System.out.println("There are " + novemberNumberOfDays + " days in " + november);
                break;
            case 12:
                System.out.println("There are " + decemberNumberOfDays + " days in " + december);
                break;
            default:
                System.out.println("The number of month is wrong. Try again");
        }
    }

    public static void main(String[] args) {
        monthNumber(5);
    }
}

