package VideoCourse.SourcePackages.Lessons.Lesson8_nonAccessModifier;

public class Student_2 {
    String name;
    int course;
    static int count;
    int a;

    // Конструктор класса Student_2
    public Student_2(String firstName, int studyCourse) {
        count++;
        name = firstName;
        course = studyCourse;
        System.out.println("Student " + firstName + " on course " + studyCourse + " with number " + count + " created");
    }

    // Статический метод для отображения количества студентов
    public static void showCount() {
        System.out.println("There are " + count + " students created");
    }

    // Метод для отображения информации о студенте
    public void showInfo() {
        System.out.println("Welcome to the student class!!!");
    }

    // Метод, увеличивающий значение переменной a и count
    void abc() {
        a++;
        count++;
    }

    // Статический метод, где можно работать только с статическими переменными напрямую
    static void abcd() {
        count++;  // Увеличиваем только статическую переменную count
        Student_2 student2 = new Student_2("Anton", 2);  // Создание объекта для доступа к нестатическим полям и методам
        student2.a++;  // Увеличение нестатической переменной через объект
    }

    public static void main(String[] args) {
        abcd();  // Вызов статического метода
        Student_2 student3 = new Student_2("Olga", 2);  // Создание нового объекта Student_2
        showCount();  // Вызов статического метода
    }
}