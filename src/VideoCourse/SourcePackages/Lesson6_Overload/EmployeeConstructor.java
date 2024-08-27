package VideoCourse.SourcePackages.Lesson6_Overload;

public class EmployeeConstructor {
    int id;
    String surname;
    int age;
    double salary;
    String department;

    EmployeeConstructor (String lastname, int yearsOld) {
        surname = lastname;
        age = yearsOld;
    }
    EmployeeConstructor (int identification, String lastname, int yearsOld) {
        this(lastname, yearsOld);
        id = identification;
    }

    EmployeeConstructor (int identification, String lastname, int yearsOld, double income, String branch) {
        this(identification, lastname, yearsOld);
        salary = income;
        department = branch;
    }

}
class EmployeeConstructorTest {
    public static void main(String[] args) {
        EmployeeConstructor emp1 = new EmployeeConstructor(1, "Ivanov", 25);
        System.out.println(emp1.surname);
        EmployeeConstructor emp2 = new EmployeeConstructor("Petrov", 30);
        System.out.println(emp2.department);
        EmployeeConstructor emp3 = new EmployeeConstructor(2,"Sidorov", 40, 100_000, "IT");
        System.out.println(emp3.salary);

    }
}
