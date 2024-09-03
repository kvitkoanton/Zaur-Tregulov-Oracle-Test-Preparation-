package VideoCourse.SourcePackages.Homework.HW10_import_import_static.p4;

import static VideoCourse.SourcePackages.Homework.HW10_import_import_static.p1.p2.B.count;
import VideoCourse.SourcePackages.Homework.HW10_import_import_static.p4.p5.*;

public class D {
    String model;
    String color;
    String engine;


    D(String model, String color, String engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    void showInfo (){
        count++;
        System.out.println("Car " +model + " " + color + " " + engine +  " with number " + count + " is created");
    }

}
class DTest {
    public static void main(String[] args) {

        D car1 = new D("Mercedes", "Red", "V8");
        D car2 = new D("BMW", "Black", "V12");
        D car3 = new D("VW", "Yellow", "W16");
        D car4 = new D("Audi", "Blue", "V10");
        D car5 = new D("Porsche", "Green", "V6");
        D car6 = new D("Trabant", "Pink", "V4");

        car1.showInfo();
        car2.showInfo();
        car3.showInfo();
        car4.showInfo();
        car5.showInfo();
        car6.showInfo();


        E circle1 = new E(1);
        E circle2 = new E(2);
        E circle3 = new E(3);
        E circle4 = new E(4);

        circle1.сalculateTheAreaOfACircle();
        circle2.сalculateTheAreaOfACircle();
        circle3.сalculateTheAreaOfACircle();
        circle4.сalculateTheAreaOfACircle();


    }




}
