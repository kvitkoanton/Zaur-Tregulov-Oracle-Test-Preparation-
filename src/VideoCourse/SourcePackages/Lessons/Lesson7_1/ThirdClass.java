package VideoCourse.SourcePackages.Lessons.Lesson7_1;

public class ThirdClass {
    public static void main(String[] args) {
        VideoCourse.SourcePackages.Lesson7_package_accessModifier.Employee emp =
                new VideoCourse.SourcePackages.Lesson7_package_accessModifier.Employee(25_000);
        System.out.println(emp.salary);
        emp.doubleSalary();
    }
}