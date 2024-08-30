package VideoCourse.SourcePackages.Lessons.Lesson5_Methods_Constructor;

public class Human {
    String name;
    Car4 car;
    BankAccount bA;

    void humanInfo () {
        System.out.println("Name: " + name + ", Car color: " + car.color + ", Bank account balance: " + bA.balance);
    }
}

class HumanTest {
    public static void main(String[] args) {
        Human human = new Human(); // создание обїекта класса Human
        human.name = "David";
        human.car = new Car4("Red", "V12");
        human.bA = new BankAccount(152, 12_000_000);
        human.humanInfo();
    }
}


class  Car4 {
    String color;
    String engine;

    Car4(String color, String engine) {
        color = color;
        engine = engine;
    }
}

    class BankAccount {
        int id;
        double balance;
        BankAccount (int identification, double accountBalance) {
            id = identification;
            balance = accountBalance;
        }
    }
