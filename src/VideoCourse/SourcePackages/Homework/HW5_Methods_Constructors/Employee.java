package VideoCourse.SourcePackages.Homework.HW5_Methods_Constructors;

public class Employee {
    int id;
    String surName;
    int age;
    double salary;
    String department;

    Employee(int identification, String lastName, int Age, double Salary, String Department) {
        id = identification;
        surName = lastName;
        age = Age;
        salary = Salary;
        department = Department;
    }

    void employeeInfo() {
        System.out.println("Employee id: " + id + ", last name: " + surName + ", age: " + age + ", salary: " + salary + ", department: " + department);
    }

    double doubleSalaryIncrease() {
        salary *= 2;
        return salary;
    }
}

    class EmployeeTest {
        public static void main(String[] args) {
        Employee employee1 = new Employee(52,"Kvitko", 37, 45_000, "Logistik");
        Employee employee2 = new Employee(54, "Wittchen", 38, 52_000, "IT");

        employee1.employeeInfo();
        employee1.doubleSalaryIncrease();
        employee1.employeeInfo();
        System.out.println();

        employee2.employeeInfo();
        employee2.doubleSalaryIncrease();
        employee2.employeeInfo();
        }
    }


