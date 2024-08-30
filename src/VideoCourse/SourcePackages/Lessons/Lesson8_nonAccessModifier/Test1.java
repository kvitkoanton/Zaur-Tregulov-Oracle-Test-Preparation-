package VideoCourse.SourcePackages.Lessons.Lesson8_nonAccessModifier;

public class Test1 {
    public final int a; // public final or final public does not matter

    Test1() {
        a = 10;
    }
    Test1(boolean b) {
        a = 15;
    }

    public void abc (final short s) {
        final byte b;
        b = 10;
        System.out.println(s+b);
    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        System.out.println(t.a);
    }

}
