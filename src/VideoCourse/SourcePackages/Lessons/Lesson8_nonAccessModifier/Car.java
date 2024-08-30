package VideoCourse.SourcePackages.Lessons.Lesson8_nonAccessModifier;

public class Car {
    String color = "blue";
    String engine = "V6";
}
    class Human {
        String name = "Ivan";

        final Car car1 = new Car();

        public static void main(String[] args) {
            Human human1 = new Human();
            human1.car1.engine = "V8";
        }
    }
