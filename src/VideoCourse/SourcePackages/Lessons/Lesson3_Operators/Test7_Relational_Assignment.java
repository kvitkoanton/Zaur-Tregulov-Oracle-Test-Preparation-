package VideoCourse.SourcePackages.Lessons.Lesson3_Operators;

public class Test7_Relational_Assignment {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        boolean c = !(a > b); //false

        System.out.println(c);

        int q = 10;
        int w = 50;
        int e = 0;
        int e1 = 99;
        int r = 100;

        boolean t = q < w && e++ == r; // true && false = false
        System.out.println(t);

        boolean t1 = q < w && e1++ == r; // true && true  = true
        System.out.println(t1);

        int x1 = 10;
        int y1 = 5;
        System.out.println(x1 | y1); // 15

        // ^
        boolean z1 = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = true;

        System.out.println(z1^z2^z3^z4);


    }
}
