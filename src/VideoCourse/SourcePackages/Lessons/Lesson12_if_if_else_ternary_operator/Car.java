package VideoCourse.SourcePackages.Lessons.Lesson12_if_if_else_ternary_operator;

public class Car {
    int engine;
    int doorCount;

    Car (int engine, int doorCount) {
        this.engine = engine;
        this.doorCount = doorCount;
    }
}

class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car(3, 4);
        Car car2 = new Car(2, 5);

        if(car1.engine> car2.engine){
            if(car1.doorCount>car2.doorCount) {
                System.out.println("The Power of engine and number of doors Vehicle #1 is higher than Vehicle #2");
            } else {
                System.out.println("The Power of engine Vehicle #1 is higher than Vehicle #2, but number of doors Vehicle #1 is lower than Vehicle #2");
            }
        }else {
                System.out.println("The Power of engine Vehicle #1 is lower than Vehicle #2");
            }
    }
}

