package VideoCourse.SourcePackages.Lesson5_Methods_Constructor;

public class Car3 {
    String color;
    String engine;
    Car3(String color, String engine) {
    color = color;
    engine = engine;

        System.out.println("Car color: " + color + ", car engine: " + engine);
    }
}

class CarTest {
    public static void main(String[] args) {
        Car3 car1 = new Car3("Red", "V4");
        Car3 car2 = new Car3("White", "V12");

    }
}
