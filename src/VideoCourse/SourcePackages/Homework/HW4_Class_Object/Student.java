package VideoCourse.SourcePackages.Homework.HW4_Class_Object;

public class Student {
    int studentCardNumber;
    String firstName;
    String lastName;
    double averageGradeInMathematics;
    double averageGradeInEconomics;
    double averageGradeInForeignLanguage;
    double averageGrade;

}
class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.studentCardNumber = 47598;
        student1.firstName = "Anton";
        student1.lastName = "Kvitko";
        student1.averageGradeInMathematics = 4.5;
        student1.averageGradeInEconomics = 4.6;
        student1.averageGradeInForeignLanguage = 3;
        student1.averageGrade = (student1.averageGradeInEconomics + student1.averageGradeInMathematics + student1.averageGradeInForeignLanguage)/3;

        System.out.println("Average grade Student " + student1.firstName + " " + student1.lastName + " is " + student1.averageGrade);

        student2.studentCardNumber = 47599;
        student2.firstName = "Olga";
        student2.lastName = "Kvitko";
        student2.averageGradeInMathematics = 4.0;
        student2.averageGradeInEconomics = 4.1;
        student2.averageGradeInForeignLanguage = 4.5;
        student2.averageGrade = (student2.averageGradeInEconomics + student2.averageGradeInMathematics + student2.averageGradeInForeignLanguage)/3;

        System.out.println("Average grade Student " + student2.firstName + " " + student2.lastName + " is " + student2.averageGrade);

        student3.studentCardNumber = 47600;
        student3.firstName = "Valera";
        student3.lastName = "Semenov";
        student3.averageGradeInMathematics = 3.0;
        student3.averageGradeInEconomics = 2.1;
        student3.averageGradeInForeignLanguage = 3.5;
        student3.averageGrade = (student3.averageGradeInEconomics + student3.averageGradeInMathematics + student3.averageGradeInForeignLanguage)/3;

        System.out.println("Average grade Student " + student3.firstName + " " + student3.lastName + " is " + student3.averageGrade);
    }
}

