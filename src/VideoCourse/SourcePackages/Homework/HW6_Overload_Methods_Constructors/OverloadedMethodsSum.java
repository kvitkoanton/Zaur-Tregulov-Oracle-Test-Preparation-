package VideoCourse.SourcePackages.Homework.HW6_Overload_Methods_Constructors;

public class OverloadedMethodsSum {

    int sum (){
        int sumNumbers;
        sumNumbers = 0;
        printSum(sumNumbers);
        return sumNumbers;
    }

    int sum (int a){
        int sumNumbers;
        sumNumbers = a;
        printSum(sumNumbers);
        return sumNumbers;
    }

    int sum (int a, int b){
        int sumNumbers;
        sumNumbers = a + b;
        printSum(sumNumbers);
        return sumNumbers;
    }

    int sum (int a, int b, int c){
        int sumNumbers;
        sumNumbers = a + b + c;
        printSum(sumNumbers);
        return sumNumbers;
    }

    int sum (int a, int b, int c, int d){
        int sumNumbers;
        sumNumbers = a + b + c + d;
        printSum(sumNumbers);
        return sumNumbers;
    }

    void printSum (int sumNumbers){
        System.out.println("The sum of the numbers is: " + sumNumbers);
    }

}
class OverloadedMethodsSumTest {
    public static void main(String[] args) {
        OverloadedMethodsSum result = new OverloadedMethodsSum();
        result.sum();

        result.sum(2);

        result.sum(5,3);

        result.sum(5,6,7);

        result.sum(1,2,3,4);

    }
}


