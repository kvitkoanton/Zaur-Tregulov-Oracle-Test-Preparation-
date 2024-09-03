package VideoCourse.SourcePackages.Homework.HW10_import_import_static.p4.p5;

import static VideoCourse.SourcePackages.Homework.HW10_import_import_static.p1.p2.B.pi;

public class E {
    public  int radius;
    public E(int radius){
        this.radius = radius;
    }
    public double сalculateTheAreaOfACircle(){
        double areaOfACircle;
        areaOfACircle = pi * radius * radius;
        System.out.println("The Area of a circle with radius " + radius + " is " + areaOfACircle);
        return areaOfACircle;
    }
}
