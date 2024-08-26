package VideoCourse.SourcePackages.Lesson5_Methods_Constructor;

public class Test20_Method_Creation {
    int sum(int a, int b, int c) {
        int result;
        result = a + b + c;
        return result;
    }

    int arithmeticMean (int a1, int b1, int c1) {
        int result2 = sum(a1, b1, c1) / 3;
        return result2;
    }

}



    class Test21_CallMethod {
        public static void main(String[] args) {
            Test20_Method_Creation s3N = new Test20_Method_Creation();
            int sumThreeNumbers = s3N.sum(15, 2, 3);
            System.out.println(sumThreeNumbers);
            System.out.println(s3N.sum(15, 2, 3));

            System.out.println(s3N.arithmeticMean(15,2,3));
        }
    }
