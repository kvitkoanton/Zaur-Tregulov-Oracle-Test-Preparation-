package VideoCourse.SourcePackages.Homework.HW7_1_forClassEmployee;
import VideoCourse.SourcePackages.Homework.HW7_Package_ModifierAccess.Employee;
public class EmployeeTestFromAnotherPackage {
    public static void main(String[] args) {
        VideoCourse.SourcePackages.Homework.HW7_Package_ModifierAccess.Employee emp3 = new VideoCourse.SourcePackages.Homework.HW7_Package_ModifierAccess.Employee("Lutsiv",25,"IT");
        emp3.showId();
        emp3.showSurname();
        emp3.showSalary();
    }
}
