package VideoCourse.SourcePackages.Lesson7_package_accessModifier;

import VideoCourse.SourcePackages.Lesson6_Overload.Employee;

public class A {
    public static void main(String[] args) {
        B object = new B();
        VideoCourse.SourcePackages.Lesson6_Overload.Employee emp = new VideoCourse.SourcePackages.Lesson6_Overload.Employee("Kvitko", 37);
        //для вызова класс из другого пакета необходимо ввести полный путь, при этом класс должен быть public


    }

}
