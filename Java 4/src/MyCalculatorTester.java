import java.util.Scanner;

public class MyCalculatorTester {

    public static void main(String[] args)
    {
        int X, Y;
        double XD, YD;
        Scanner kb = new Scanner(System.in);
        System.out.print("Please enter the value for X as an integer: ");
        X = Integer.parseInt(kb.nextLine());
        System.out.print("Please enter the value for Y as an integer: ");
        Y = Integer.parseInt(kb.nextLine());

        System.out.print("Please enter the value for X as a double: ");
        XD = Double.parseDouble(kb.nextLine());
        System.out.print("Please enter the value for Y as a double: ");
        YD = Double.parseDouble(kb.nextLine());

        MyCalculator calculator = new MyCalculator();

        System.out.printf("The sum of %d and %d is %d: \n", X, Y, calculator.add(X, Y));
        System.out.printf("The difference of %d and %d is %d: \n", X, Y, calculator.subtract(X, Y));
        System.out.printf("The product of %d and %d is %d: \n", X, Y, calculator.multiply(X, Y));
        System.out.printf("The quotient of %d and %d is %d: \n\n", X, Y, calculator.divide(X, Y));

        System.out.printf("The sum of %.2f and %.2f is %.2f: \n", XD, YD, calculator.add(XD, YD));
        System.out.printf("The difference of %.2f and %.2f is %.2f: \n", XD, YD, calculator.subtract(XD, YD));
        System.out.printf("The product of %.2f and %.2f is %.2f: \n", XD, YD, calculator.multiply(XD, YD));
        System.out.printf("The quotient of %.2f and %.2f is %.2f: \n\n", XD, YD, calculator.divide(XD, YD));

    }

}
