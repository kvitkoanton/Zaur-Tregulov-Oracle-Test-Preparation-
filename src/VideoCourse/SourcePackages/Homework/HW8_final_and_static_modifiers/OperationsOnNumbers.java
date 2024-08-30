package VideoCourse.SourcePackages.Homework.HW8_final_and_static_modifiers;

public class OperationsOnNumbers {
    static final double pi = 3.14;

    // Статический метод для умножения трех чисел
    static int multiplicationThreeNumbers(int a, int b, int c) {
        int result;
        result = a * b * c;
        System.out.println("The product of three numbers is: " + result);
        return result;
    }

    // Статический метод для деления двух чисел
    static void divisionOfTwoNumbers(int a, int b) {
        int resultWhole;
        int resultRest;
        resultWhole = a / b;
        resultRest = a % b;
        System.out.println("The division of a by b is: " + resultWhole + " with rest " + resultRest);
    }
    // Не статический метод для вычисления площади круга
    double calculationOfTheAreaOfACircle (int radius) {
        double areaOfACircle;
        areaOfACircle = pi * radius * radius;
        System.out.println("Area of a circle with radius " + radius + " is " + areaOfACircle);
        return areaOfACircle;
    }
    // Статический метод для вычисления длины окружности
    static double calculationOfTheCircumference (int radius) {
        double circumference;
        circumference = pi * 2 * radius;
        System.out.println("Circumference with radius " + radius + " is " + circumference);
        return circumference;
        }

    // Не статический метод для вывода радиуса, площади круга, длине окружности
    void showCircuitParameters (int radius){
        double circumference = calculationOfTheCircumference(radius);
        double areaOfACircle = calculationOfTheAreaOfACircle(radius);

        System.out.println("Circuit with radius " + radius + " has the following parameters: Radius - " + radius
                + ", circumference - " + circumference + ", area of the circle - " + areaOfACircle);
    }
}

class OperationsOnNumbersTest {
    public static void main(String[] args) {
        // Вызов статических методов напрямую через имя класса
        OperationsOnNumbers.multiplicationThreeNumbers(1, 2, 3);
        OperationsOnNumbers.multiplicationThreeNumbers(4,5,6);
        OperationsOnNumbers.divisionOfTwoNumbers(3, 2);
        OperationsOnNumbers.divisionOfTwoNumbers(5,3);


        // Вызов не статических методов через объект класса

        OperationsOnNumbers one = new OperationsOnNumbers();
        one.showCircuitParameters(7);
        one.calculationOfTheAreaOfACircle(4);
    }
}
