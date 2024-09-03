package VideoCourse.SourcePackages.Lessons.Lesson10_import_import_static;

import VideoCourse.SourcePackages.Lessons.Lesson9_Types_of_variables_and_their_scope.Student;
import static VideoCourse.SourcePackages.Lessons.Lesson9_Types_of_variables_and_their_scope.Car.a;

public class A {
    public static void main(String[] args) {
        VideoCourse.SourcePackages.Lessons.Lesson9_Types_of_variables_and_their_scope.Car car1 = new VideoCourse.SourcePackages.Lessons.Lesson9_Types_of_variables_and_their_scope.Car("Red", "V6");
        VideoCourse.SourcePackages.Lessons.Lesson8_nonAccessModifier.Car car2 = new VideoCourse.SourcePackages.Lessons.Lesson8_nonAccessModifier.Car();

        VideoCourse.SourcePackages.Lessons.Lesson9_Types_of_variables_and_their_scope.Student student1 = new VideoCourse.SourcePackages.Lessons.Lesson9_Types_of_variables_and_their_scope.Student();
        VideoCourse.SourcePackages.Lessons.Lesson8_nonAccessModifier.Student student2 = new VideoCourse.SourcePackages.Lessons.Lesson8_nonAccessModifier.Student("Anton",2004);

        String student10 = new String("Hello");
        Student student3 = new Student();
        System.out.println(student3.z);
        System.out.println(Student.c);

        System.out.println(a);
    }
}

class B {
    Student student4 = new Student();
}

