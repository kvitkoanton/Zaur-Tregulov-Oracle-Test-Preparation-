package VideoCourse.SourcePackages.Homework.HW12_if_if_else_ternary_operator;
import VideoCourse.SourcePackages.Lessons.Lesson11_primitive_and_reference_data_types_in_methods.*;

public class StudentTest {
    static void comparisonOfStudents(Student student1, Student student2) {
        if (student1.name.equals(student2.name) && student1.course == student2.course && student1.grade == student2.grade) {
            System.out.println("Student 1 and Student 2 are equal");
        } else {
            System.out.println("Student 1 and Student 2 are not equal");
        }
    }

    static void comparisonOfStudentsElements(Student student1, Student student2) {
        if (student1.name.equals(student2.name) && student1.course == student2.course && student1.grade == student2.grade) {
            System.out.println("Student 1 and Student 2 are equal.\n");

        } else if (!student1.name.equals(student2.name) && (student1.course == student2.course) && (student1.grade == student2.grade)) {
                System.out.println("Student 1 and Student 2 are not equal in field NAME");
                System.out.println("student1 name is " + student1.name + ", student2 name is " + student2.name + "\n");

        } else if (!student1.name.equals(student2.name) && (student1.course != student2.course) && (student1.grade == student2.grade)) {
                System.out.println("Student 1 and Student 2 are not equal in fields NAME and COURSE");
                System.out.println("student1 name is " + student1.name + ", student2 name is " + student2.name);
                System.out.println("student1 course is " + student1.course + ", student2 course is " + student2.course + "\n");

        } else if (!student1.name.equals(student2.name) && (student1.course == student2.course) && (student1.grade != student2.grade)) {
                System.out.println("Student 1 and Student 2 are not equal in fields NAME and GRADE");
                System.out.println("student1 name is " + student1.name + ", student2 name is " + student2.name);
                System.out.println("student1 grade is " + student1.grade + ", student2 grade is " + student2.grade + "\n");

        } else if (student1.name.equals(student2.name) && (student1.course != student2.course) && (student1.grade != student2.grade)) {
                System.out.println("Student 1 and Student 2 are not equal in fields COURSE and GRADE");
                System.out.println("student1 course is " + student1.course + ", student2 course is " + student2.course);
                System.out.println("student1 grade is " + student1.grade + ", student2 grade is " + student2.grade + "\n");

        } else {
                System.out.println("Student 1 and Student 2 are not equal in all fields:");
                System.out.println("student1 name is " + student1.name + ", student2 name is " + student2.name);
                System.out.println("student1 course is " + student1.course + ", student2 course is " + student2.course);
                System.out.println("student1 grade is " + student1.grade + ", student2 grade is " + student2.grade + "\n");
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("Anton",2004,10.5);
        Student student2 = new Student("Olga",2004,11.5);
        Student student3 = new Student("Anton",2004,10.5);
        Student student4 = new Student("Valera",2005,10.6);

        comparisonOfStudents(student1,student2);
        comparisonOfStudents(student1,student3);
        System.out.println();

        comparisonOfStudentsElements(student1,student3);
        comparisonOfStudentsElements(student1,student2);
        comparisonOfStudentsElements(student2,student4);
    }
}

