package VideoCourse.SourcePackages.Lessons.Lesson3_Operators;

public class Test_6_Comparison_operators {
    public static void main(String[] args) {

        int a = 3;
        int b = 5;
        int c = 5;

        boolean b1 = a > b; //false
        boolean b2 = b <= c; //true
        boolean b3 = a==b; //false
        boolean b4 = c != b; // false
        boolean b5 = c != b;

        // = оператор присвоения;
        // == оператор равенства;
        // != оператор не равенства;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        // true && true && true = true;
        // true && false && true = false;

        boolean x = true;
        boolean y = true;
        boolean z = true;

        boolean result = x && y && z; // true
        System.out.println(result);

        boolean q = true;
        boolean w = false;
        boolean e = true;

        // если хотя бы один из элементов равен false, значит все выражение равно false (short circuit)
        boolean result2 = q && w && e; // false
        System.out.println(result2);

        // || OR

        boolean g = false;
        boolean h = false;
        boolean j = true;

        // если хотя бы один элемент равен true, тогда все выражение true.
        // если первый элемент true, то дальше действие не выполняются.
        boolean result3 = g || h || j; //true
        System.out.println(result3);

        boolean r = false;
        boolean t = false;
        boolean u = false;

        boolean result4 = r || t || u; //false
        System.out.println(result4);

    }
}
