package VideoCourse.SourcePackages.Lessons.Lesson6_Overload;

public class MethodOverloading {
    void show(int i) {
        System.out.print(i);
        System.out.println(" - Data type is int");
    }

    void show(boolean b1) {
        System.out.print(b1);
        System.out.println(" - Data type is boolean");
    }

    void show(String s1) {
        System.out.print(s1);
        System.out.println(" - Data type is String");
    }

    void show(String s, int a) {
        System.out.println("String: " + s + " int: " + a);
    }

    //void show(String a, int s) {
      //  System.out.println("The day is good " + a);
    }


    class MethodOverloadingTest {
        public static void main(String[] args) {
            MethodOverloading mO = new MethodOverloading();
            int a = 500;
            mO.show(a);
            boolean b = true;
            mO.show(b);
            String s = "Hello";
            mO.show(s);
            mO.show(b);

        }
    }

