package VideoCourse.SourcePackages.Lessons.Lesson8_nonAccessModifier;

public class Student {
    String name;
    int course;
    static int count;

    public Student(String firstName, int studyCourse) {
        count++;
        name = firstName;
        course = studyCourse;
        System.out.println("Student " + firstName + " on course " + studyCourse + " with number " + count + " created");
    }

    public static void shoeCount () {
        System.out.println("There are " + count + " students created");
    }

    public static void main(String[] args) {
        Student student1 = new Student("Anton",1);
        Student student2 = new Student("Olga",1);
        Student student3 = new Student("Sergey",4);

        shoeCount();
    }
}

