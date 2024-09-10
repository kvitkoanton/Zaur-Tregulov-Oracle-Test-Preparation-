package VideoCourse.SourcePackages.Lessons.Lesson13_switch_case;

public class Test1 {
}

class Student {
    int grade;

    Student (int grade){
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student student1 = new Student(4);
        if(student1.grade == 2){
            System.out.println("TThe student is not studying well");
        } else if (student1.grade == 3) {
            System.out.println("The student is doing well in his studies");
        } else if (student1.grade == 4) {
            System.out.println("The student studies well");
        } else if (student1.grade == 5) {
            System.out.println("The student studies excellent");
        } else {
            System.out.println("The rating is not correct");
        }
        System.out.println();

        Student student2 = new Student(5);

        switch (student2.grade){
            case 2:
                System.out.println("TThe student is not studying well");
                break;
            case 3:
                System.out.println("The student is doing well in his studies");
                break;
            case 4:
                System.out.println("The student studies well");
                break; // break означает віход из switch
            case 5:
                System.out.println("The student studies excellent");
                break;
            default: // можно писать где угодно. Но, если в середине, мі должні писать break
                System.out.println("The rating is not correct");
        }

    }
}

