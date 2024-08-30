package VideoCourse.SourcePackages.Lessons.Lesson2_primitives_variables_numberSystems;

public class PrimitiveDataTypes {

    public static void main(String[] args) {

        byte b1 = 10; //тип переменной / название переменной / = / значение -128 - +127)
        byte b2 = 20;
        byte b3 = 100;

        short s1 = 5;
        short s2 = -10;
        short s3 = 0;

        int i1 = 500; // default

        long l1 = 1000;
        long l2 = 10000000000L;
        long l3 = 51L;

        float f1 = 3.14F;
        float f2 = 2.5f;
        float f3 = 20;

        double d1 = 5.5D;
        double d2 = 87.65d;
        double d3 = 65.45; // default


        char c1 = 'a';
        char c2 = 'A';
        char c3 = '7';
        char c4 = ' ';

        char c5 = 500;// номер символа в Юникоде 10-тиричная система исчисления
        char c6 = '\u0500'; // номер символа в Юникоде 16-тиричная система исчисления (всегда 4 символа)

        System.out.println(c5);
        System.out.println(c6);

        boolean bool1 = true;
        boolean bool2 = false;

        int a1 = 60;
        int a2 = 0B111100; //0B означает, что число в двоичной системе исчисления
        int a3 = 0b111100;
        int a4 = 074; // 0 означает, что число в восьмеричной системе исчисления
        int a5 = 0x3C; // 0x означает, что число в шестнадцатиричной системе исчисления
        int a6 = 0X3c;

        // Decimal - десятичный
        // Binary - двоичный
        // Octal - восьмеричный
        // Hexadecimal - шестнадцатеричный

        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);
        System.out.println(a6);

        int a7 = 1_000_000; //использование "_" разрешено
        // (нельзя использовать:
        // в начале и в конце числа
        // перед и после разделения числа
        // перед и после букв обозначающих тип даннх в конце числа (F,f,L,l)
        // до, после и между симфолов указывающих тип системы исчисления (0B,0b,0X,0x)
        System.out.println(a7);



    }
}
