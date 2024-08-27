package VideoCourse.SourcePackages.Homework.HW6_Overload_Methods_Constructors;

public class StudentConstructor {
    int studentCardNumber;
    String firstName;
    String lastName;
    String courseYear;
    double averageGradeInMathematics;
    double averageGradeInEconomics;
    double averageGradeInForeignLanguage;

    StudentConstructor (int sCN, String name, String surname, String course, double Mathematics, double Economics, double ForeignLanguage) {
        studentCardNumber = sCN;
        firstName = name;
        lastName = surname;
        courseYear = course;
        averageGradeInMathematics = Mathematics;
        averageGradeInEconomics = Economics;
        averageGradeInForeignLanguage = ForeignLanguage;
    }
    StudentConstructor (int sCN, String name, String surname, String course) {
        this(sCN, name, surname, course,0.0, 0.0, 0.0);
    }

    StudentConstructor (){
        this (0, null, null, null, 0.0,0.0,0.0 );
    }
}

class StudentConstructorTest {
    public static void main(String[] args) {

        StudentConstructor sdudent1 = new StudentConstructor(2, "Olga", "Kvitko", "PT-2004", 4.5, 4.6, 4.8);
        StudentConstructor sdudent2 = new StudentConstructor(1, "Anton", "Kvitko", "PT-2004");
        StudentConstructor sdudent3 = new StudentConstructor();

        System.out.println(sdudent1.averageGradeInForeignLanguage);

    }

}
