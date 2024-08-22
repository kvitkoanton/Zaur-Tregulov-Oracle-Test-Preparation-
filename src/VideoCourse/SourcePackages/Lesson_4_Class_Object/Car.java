package VideoCourse.SourcePackages.Lesson_4_Class_Object;

public class Car {
    String color = "red";
    String egine = "V6";
}

class CarTest {
    public static void main(String[] args) {
        int a;
        Car car1 = new Car();
        car1.color = "black";
        car1.egine = "V8";

        System.out.println("Цвет: " + car1.color);
        System.out.println("Двигатель: " + car1.egine);
    }
}
