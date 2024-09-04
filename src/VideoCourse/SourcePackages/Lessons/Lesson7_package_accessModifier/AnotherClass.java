package VideoCourse.SourcePackages.Lessons.Lesson7_package_accessModifier;

public class AnotherClass {
    public static void main(String[] args) {
        Employee emp = new Employee(25_000);
        System.out.println(emp.salary);
        emp.doubleSalary();
    }
}
