package VideoCourse.SourcePackages.Lessons.Lesson12_if_if_else_ternary_operator;

public class Test10 {

    void max(int i1, int i2, int i3) {
        if(i1>i2 && i1>i3) {
            System.out.println("MAX number - " + i1);
        } else if(i2>i1 &&i2 >i3) {
            System.out.println("MAX number - " + i2);
        } else {
            System.out.println("MAX number - " + i3);
        }
    }

    void abc() {
        String str;
        int a = 10;
        if (a>=10) {
            str = "Privet";
        }
        if (a<10) {
            str = "Poka";
        } else {
            str = null;
        }
        System.out.println(str);
    }
    public static void main(String[] args) {
        int a = 10;
        if (a < 30) {
            System.out.println("a less than 20"); // без фигурных скобок относится только одна строка после if.
        } else {
            System.out.println("a not less than 20"); // без фигурных скобок относится только одна строка после else.
            System.out.println("Hello every body!!!");// только при заключении в фигурные скобки
    }
        int salary = 400;
        if (salary >= 500) {
            System.out.println(":)");
        } else {
            System.out.println(":(");
        }

        int salary2 = 1500;
        if (salary2 < 200) {
            System.out.println("Salary is very low");
        } else if (salary2 < 400) {
            System.out.println("Salary is middle");
        } else if (salary2 < 600) {
            System.out.println("Salary is high");
        } else {
            System.out.println("Salary is very good");
        }

        Test10 maxNumber = new Test10();
        maxNumber.max(3, 5, 7);

        int b = 10;
        int c = 20;
        int max = (b>c) ? b : c;
        System.out.println(max);
    }
}
