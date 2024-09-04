package VideoCourse.SourcePackages.Lessons.Lesson7_package_accessModifier;

public class Employee {
    public double salary;

    public void doubleSalary () {
        double result;
        result = salary * 2;
        System.out.println("New salary = " +result);
    }

    public Employee (double income) {
        salary = income;
    }

    public static void main(String[] args) {
        Employee emp = new Employee(25_000);
        System.out.println(emp.salary);
        emp.doubleSalary();
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee(25_000);
        System.out.println(emp.salary);
        emp.doubleSalary();
    }
}


