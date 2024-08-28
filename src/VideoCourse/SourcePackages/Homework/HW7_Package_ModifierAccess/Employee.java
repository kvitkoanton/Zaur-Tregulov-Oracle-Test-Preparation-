package VideoCourse.SourcePackages.Homework.HW7_Package_ModifierAccess;

public class Employee {
    int id; //access modifier default
    public String surname;
    int age;
    private double salary;
    String department;

    public void showId() {
        System.out.println("Id is: " + id);
    }

    public void showSurname() {
        System.out.println("Surname is: " + surname);
    }

    public void showSalary() {
        System.out.println("Salary is: " + salary);
    }

    public Employee(String lastname, int yearsOld, String branch) {
        surname = lastname;
        age = yearsOld;
        department = branch;
    }

    Employee(int identification, String lastname, int yearsOld, String branch) {
        id = identification;
        surname = lastname;
        age = yearsOld;
        department = branch;
    }

    private Employee(int identification,String lastname, double income) {
        id = identification;
        surname = lastname;
        salary = income;
    }

    public static void main(String[] args) {
            Employee emp1 = new Employee(2,"Kvitko",25_000);
            emp1.showId();
            emp1.showSurname();
            emp1.showSalary();
    }

}
    class EmployeeTest {
        public static void main(String[] args) {
            Employee emp2 = new Employee(3, "Wittchen", 25,"IT");
            emp2.showId();
            emp2.showSurname();
        }
    }

