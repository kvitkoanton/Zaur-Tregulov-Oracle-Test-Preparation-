package VideoCourse.SourcePackages.Lesson6_Overload;

public class EmployeeConstructorWriting {
    int id;
    String surname;
    int age;
    double salary;
    String department;

    EmployeeConstructorWriting (String lastname, int yearsOld) {

        this(0, lastname, yearsOld,0.0, null);
    }

    EmployeeConstructorWriting (int identification, String lastname, int yearsOld) {
        this(identification,lastname, yearsOld, 0.0, null);
    }

    EmployeeConstructorWriting (int identification, String lastname, int yearsOld, double income, String branch) {
        id = identification;
        surname = lastname;
        age = yearsOld;
        salary = income;
        department = branch;
    }

}
class EmployeeConstructorWritingTest {
    public static void main(String[] args) {
        EmployeeConstructorWriting emp1 = new EmployeeConstructorWriting(1, "Ivanov", 25);
        System.out.println(emp1.surname);
        EmployeeConstructorWriting emp2 = new EmployeeConstructorWriting("Petrov", 30);
        System.out.println(emp2.department);
        EmployeeConstructorWriting emp3 = new EmployeeConstructorWriting(2,"Sidorov", 40, 100_000, "IT");
        System.out.println(emp3.salary);

    }
}
