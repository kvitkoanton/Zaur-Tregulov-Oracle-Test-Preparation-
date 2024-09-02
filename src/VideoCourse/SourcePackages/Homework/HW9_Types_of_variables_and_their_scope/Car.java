package VideoCourse.SourcePackages.Homework.HW9_Types_of_variables_and_their_scope;

public class Car {
    String carBrand;
    String color;
    Car (String model, String color) {
        this.carBrand = model;
        this.color = color;
    }
}

class CarTest{
    public static void main(String[] args) {
        Car car1 = new Car("Mercedes", "V8");
        Car car2 = new Car("Audi", "V10");
        Car car3 = new Car("BMW", "V6");
        Car car4 = new Car("Porsche", "Opposite 6");
        Car car5 = new Car("VW", "Electro");
        Car car6 = new Car("Trabant", "4");
        Car car7 = new Car("Walnderer", "12");
        Car car8 = new Car("Ferrari", "V12");

        car3 = null;
        car4 = null;
        car6 = null;
        car7 = null;
        car8 = null;
        car5 = null;
    }
}
