package VideoCourse.SourcePackages.Lessons.Lesson5_Methods_Constructor;

public class Car2 {
    String color;
    String engine;
    int speed;


    int aceleration(int changeOfSpeed) {
        speed += changeOfSpeed; // Запись speed = speed + chaneOfSpeed;
        return speed;
    }

    int brake(int changeOfSpeed) {
        speed -= changeOfSpeed;
        return speed;
    }

    void showInformation() {
        System.out.println("Color: " + color + ", engine: " + engine + ", speed: " + speed);
    }
}

    class Car2Test {
        public static void main(String[] args) {
            Car2 c1 = new Car2();
            c1.color = "Red";
            c1.engine = "V6";
            c1.speed = 60;

            c1.showInformation();
            c1.aceleration(20);
            c1.showInformation();
            c1.brake(80);
            c1.showInformation();
        }
    }
