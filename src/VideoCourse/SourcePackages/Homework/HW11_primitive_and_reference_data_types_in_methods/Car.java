package VideoCourse.SourcePackages.Homework.HW11_primitive_and_reference_data_types_in_methods;

public class Car {
    String color;
    String engine;
    int numberOfDoors;

    Car (String color, String engine, int numberOfDoors) {
        this.color = color;
        this.engine = engine;
        this.numberOfDoors = numberOfDoors;
    }
}

class CarTest {
    public static void changeNumberOfDoors (Car car, int newNumberOfDoors) {
        car.numberOfDoors = newNumberOfDoors;
    }

    public static void swapColor (Car car1, Car car2) {
        String saveColor = car1.color;
        car1.color = car2.color;
        car2.color = saveColor;
    }

    public static void main(String[] args) {
        Car car1 = new Car("Red", "V12", 4);
        Car car2 = new Car("Black", "V8", 2);
        System.out.println("Alt color car 1 is: " + car1.color);
        System.out.println("Alt color car 2 is: " + car2.color);

        changeNumberOfDoors(car1,3);
        changeNumberOfDoors(car2,5);

        System.out.println("New number of doors is: " + car1.numberOfDoors);
        System.out.println("New number of doors is: " + car2.numberOfDoors);

        swapColor(car1,car2);
        System.out.println("New color car 1 is: " + car1.color);
        System.out.println("New color car 2 is: " + car2.color);

    }
}