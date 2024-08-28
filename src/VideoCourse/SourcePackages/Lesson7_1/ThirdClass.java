package VideoCourse.SourcePackages.Lesson7_1;

import VideoCourse.SourcePackages.Lesson7_package_accessModifier.Employee;

public class ThirdClass {
    public static void main(String[] args) {
        VideoCourse.SourcePackages.Lesson7_package_accessModifier.Employee emp =
                new VideoCourse.SourcePackages.Lesson7_package_accessModifier.Employee(25_000);
        System.out.println(emp.salary);
        emp.doubleSalary();
    }
}