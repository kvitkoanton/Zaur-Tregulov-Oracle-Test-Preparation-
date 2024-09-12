package VideoCourse.SourcePackages.Lessons.Lesson14_for_break_continue;

public class Test2 {
    public static void main(String[] args) {
        System.out.println("Loop 1:");
        for(int i = 1, j = 2, k = 3; i < 11; i++) {     // в инциализации может быть несколько переменных,
                                                        // записанных через запятую (данные всегда одного типа (int, byte, usw)
                                                        // можно так же использовать boolean символы && ||
           // for(int i = 1, j = 2, k = 3; i < 11 && i> -3 || i > 4; i++,  j += 20)
            System.out.println(i);
        }
        System.out.println("\nLoop 2:");

        for (int i = 5; i < 11; i++, abc(10)) {         // можно візівать методы
            System.out.println(i);
        }
        }
    static void abc(int n){
        System.out.println(n);
    }
}
