package VideoCourse.SourcePackages.Lesson_4_Class_Object;

public class BankAccountMain {
    //переменные объекта instance variable (object variable)
    int id; // (default - 0)
    String name; // (default - null)
    double balance; // (default - 0.0)

    /* по умолчанию присваиваются значения для:
    id - 0
    name - null
    balance - 0.0 */

    //Существует 2 записи String
    //String name = "Petr";
    //String name = new String("Petr");
}

    class BankAccountTest {

        public static void main(String[] args) {

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
    }
