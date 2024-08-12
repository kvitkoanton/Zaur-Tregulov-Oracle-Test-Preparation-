package VideoCourse.SourcePackages.Homework;

public class HW2_PrimitiveDataTypes {
    public static void main(String[] args) {

        System.out.println("1. Создать 4 целочисленных типов данных в следующем виде");
        byte b1Decimal = 12;
        byte b2Binary = 0b1100;
        byte b3Octal = 014;
        byte b4Hexadecimal = 0xC;

        System.out.println("Число 12");
        System.out.println(b1Decimal);
        System.out.println(b2Binary);
        System.out.println(b3Octal);
        System.out.println(b4Hexadecimal + "\n");

        short s1Decimal = 1300;
        short s2Binary = 0b0101_0001_0100;
        short s3Octal = 02424;
        short s4Hexadecimal = 0x514;

        System.out.println("Число 1300");
        System.out.println(s1Decimal);
        System.out.println(s2Binary);
        System.out.println(s3Octal);
        System.out.println(s4Hexadecimal + "\n");

        int i1Decimal = 0;
        int i2Binary = 0b0;
        int i3Octal = 00;
        int i4Hexadecimal = 0x0;

        System.out.println("Число 0");
        System.out.println(i1Decimal);
        System.out.println(i2Binary);
        System.out.println(i3Octal);
        System.out.println(i4Hexadecimal + "\n");

        long l1Decimal = 123456789L;
        long l2Binary = 0b0111_0101_1011_1100_1101_0001_0101L;
        long l3Octal = 0726_746_425L;
        long l4Hexadecimal = 0x75B_CD15L;

        System.out.println("Число 123_456_789");
        System.out.println(l1Decimal);
        System.out.println(l2Binary);
        System.out.println(l3Octal);
        System.out.println(l4Hexadecimal + "\n");

        System.out.println("2. Создать по 2 переменных float, boolean, double");

        float f1 = 15;
        float f2 = 3.7F;

        boolean boolean1 = true;
        boolean boolean2 = false;

        double d1 = 7.5;
        double d2 = 8.5;

        System.out.println("Float: ");
        System.out.println(f1);
        System.out.println(f2 + "\n");

        System.out.println("Boolean: ");
        System.out.println(boolean1);
        System.out.println(boolean2 + "\n");

        System.out.println("Double: ");
        System.out.println(d1);
        System.out.println(d2 + "\n");

        System.out.println("3. Создать создать переменные типа Char: ");
        char c1 = 'A';
        char c2 = 'N';
        char c3 = 'T';
        char c4 = 'O';
        char c5 = 'N';
        char c6 = 400;
        char c7 = '\u0400';

        System.out.println("Char: ");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c7);
    }
}
