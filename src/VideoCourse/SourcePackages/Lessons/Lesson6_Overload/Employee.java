package VideoCourse.SourcePackages.Lessons.Lesson6_Overload;

public class Employee {

    Employee (int identification, String lastname, int yearsOld) {
        id = identification;
        surname = lastname;
        age = yearsOld;
    }

    public Employee (String lastname, int yearsOld) {
        surname = lastname;
        age = yearsOld;
    }

    Employee (int identification, String lastname, int yearsOld, double income, String branch) {
        id = identification;
        surname = lastname;
        age = yearsOld;
        salary = income;
        department = branch;
    }

    int id;
    String surname;
    int age;
    double salary;
    String department;
}
class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Ivanov", 25);
        System.out.println(emp1.surname);
        Employee emp2 = new Employee("Petrov", 30);
        System.out.println(emp2.department);

        Employee emp3 = new Employee(2,"Sidorov", 40, 100_000, "IT");

    }
}
