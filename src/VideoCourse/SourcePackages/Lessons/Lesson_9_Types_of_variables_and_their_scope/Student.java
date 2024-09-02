package VideoCourse.SourcePackages.Lessons.Lesson_9_Types_of_variables_and_their_scope;

public class Student {

}

class StudentTest {
    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3; // не создание объект
        String а = "Hello"; // создание объекта класса String
        student1 = null; // удаление объекта student1 приравнявши его к нулю.
        // student1 готов к удалению Garbage collector, но удалит ли он его никто не знает
    } // после віхода из єтого метода student2 перестает существовать

}
