package VideoCourse.SourcePackages.Lessons.Lesson9_Types_of_variables_and_their_scope;

public class Car {
    String color; //Instance variable (Object variable)
    public static int a = 10;
    String engine; //Instance variable (Object variable)
    static int count; //static variable - принадлежит классу, общая для всех объектов

    public static void changeA(int b){
    Car c = new Car("Black", "V8");
    //this.a = b;
    }

    public Car (String color, String engine) {

      //  int x = 5; //видны только в конструкторе. // локальная переменная нет default значения
      //  int y = x +10;
        count++;
        this.color = color;
        this.engine = engine;
    }

    public void showColor() {
        System.out.println("Car color: " + color);
        changeColor("Red");
    }
    public void changeColor (String otherColor) {
        System.out.println("Color changed");
        int cena = 5000; // local variable
        color = otherColor;
        cena += 1000;
    }
     void abc (int a, int b) {
        // boolean a = true; - нельзя та сделать

     }

     void abcd (int a, int b){

     }

     void changeCarColor (String color){
         color = color;
     }

    public static void main(String[] args) {
        Car car = new Car("red", "V6");
        System.out.println(car.color);
        car.changeCarColor("Black");
        System.out.println(car.color);
    }

}
