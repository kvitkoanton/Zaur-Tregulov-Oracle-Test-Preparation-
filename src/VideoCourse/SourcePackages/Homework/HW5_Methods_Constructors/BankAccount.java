package VideoCourse.SourcePackages.Homework.HW5_Methods_Constructors;

public class BankAccount {
    int id; // (default - 0)
    String name; // (default - null)
    double balance; // (default - 0.0)

    double accountReplenishment(double sumReplenishment) {
        balance += sumReplenishment;
        return balance;
    }

    double withdrawalFromAccount(double sumWithdrawal) {
        balance -= sumWithdrawal;
        return balance;
    }

    void infoClient() {
        System.out.println("Client id: " + id + ", Client name: " + name + ", Balance status: " + balance);
    }
}

    class UsingTheAccount {
        public static void main(String[] args) {

            BankAccount anton = new BankAccount();
            anton.id = 15;
            anton.name = "Anton";
            anton. balance = 157.58;

            anton.infoClient();
            anton.accountReplenishment(1000);
            anton.infoClient();
            anton.withdrawalFromAccount(25_000);
            anton.infoClient();

        }
    }

