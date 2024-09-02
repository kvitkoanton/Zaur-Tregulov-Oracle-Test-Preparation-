package VideoCourse.SourcePackages.Homework.HW9_Types_of_variables_and_their_scope;

public class Test1 {
    int a = 1;
    //static int a = 2;

    void abc(int a) {
        System.out.println(a);
        System.out.println(this.a);
    }


    public static void main(String[] args) {

    }
}
