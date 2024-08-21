package VideoCourse.SourcePackages.Homework;

public class HW3_Comparison_and_assignment_operations {
    public static void main(String[] args) {
        System.out.println("1. Вычислите следующую часть кода:");

        int i1 = 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20L;
        double result = 0;

        result = i2 / d1 + d2 % i1 - l;
        System.out.println(result);

        System.out.println("2. Чему равны выражения:");
        int a = 5;
        int result2 = a-- - --a + ++a + a++ + a;
        //               5   -   3 +   4 + 4   + 5
        // int result2 = b-- - --b + ++b + b++ + b;
        // стало         4       3    4      5
        System.out.println(result2);

        int b = 8;
        int result3 = ++b - b++ + ++b - --b;

        //                 9 - 9   +   11-   10
        // int result3 = ++b - b++ + ++b - --b;
        // стало           9   10      11
        System.out.println(result3);


    }
}
