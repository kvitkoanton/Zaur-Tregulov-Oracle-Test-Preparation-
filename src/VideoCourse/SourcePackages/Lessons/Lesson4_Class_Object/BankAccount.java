package VideoCourse.SourcePackages.Lessons.Lesson4_Class_Object;

public class BankAccount {

    //переменные объекта instance variable (object variable)
    int id;
    String name;
    double balance;

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(); // создание объекта (для создания обїекта нужен конструктор)
        // BankAccount - Тип данных переменно
        // bA - Имя переменной
        // new BankAccount() - Вызов конструктора создания объекта

        BankAccount myAccount = new BankAccount();
        BankAccount yourAccount = new BankAccount();
        BankAccount hisAccount = new BankAccount();

        myAccount.id = 1;
        myAccount.name = "Anton";
        myAccount.balance = 12.35;

        yourAccount.id = 2;
        yourAccount.name = "Mike";
        yourAccount.balance = 2.00;

        hisAccount.id = 3;
        hisAccount.name = "Serg";
        hisAccount.balance = 124.12;

        System.out.println(yourAccount.name);

    }
class BankAccountTest {

}

}
