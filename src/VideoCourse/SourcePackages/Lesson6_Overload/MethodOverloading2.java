package VideoCourse.SourcePackages.Lesson6_Overload;

public class MethodOverloading2 {
    int sum(int i1, int i2) {
        int result;
        result = i1 + i2;
        return result;
    }

    String sum(String s1, String s2) {
        String result;
        result = s1 + s2;
        return result;
    }
}

    class MethodOveloading2Test {
        public static void main(String[] args) {
            MethodOverloading2 mO2 = new MethodOverloading2();
            int a = mO2.sum(5,7);
            System.out.println(a);

            String s = mO2.sum("Hello, ", "friend");
            System.out.println(s);
        }
    }

