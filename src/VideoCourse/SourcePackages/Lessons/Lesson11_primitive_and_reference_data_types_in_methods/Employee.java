package VideoCourse.SourcePackages.Lessons.Lesson11_primitive_and_reference_data_types_in_methods;

public class Employee {
    public String name;
    public double salary;

    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public double doubleSalary (double a){
        a *= 2;
        return a;
    }

    public double doubleSalary2(){
        salary *= 2;
        return salary;
    }
}

class EmployeeTest{
    public static void main(String[] args) {
        Employee employee = new Employee("Ivan", 100.55);
        double salaryX2 = employee.doubleSalary(employee.salary);
        System.out.println(salaryX2);
        System.out.println(employee.salary);

        employee.doubleSalary2();
        System.out.println(employee.salary);


    }
}