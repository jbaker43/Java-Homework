/**
 * Tester Class for MyCalculatorAdvanced.java
 * @uthor Jakebaker
 * 10/04/2018
 */
import java.util.Scanner;

public class MyCalculatorAdvancedTester {

    public static void main(String[] args)
    {
        int X, Y, Z, total;
        double totalD;
        double XD, YD, ZD;
        Scanner kb = new Scanner(System.in);

        System.out.print("Please enter the value for X as an integer: ");
        X = Integer.parseInt(kb.nextLine());
        System.out.print("Please enter the value for Y as an integer: ");
        Y = Integer.parseInt(kb.nextLine());

        System.out.print("Please enter the value for Z as a double: ");
        Z = Integer.parseInt(kb.nextLine());

        MyCalculatorAdvanced calculator = new MyCalculatorAdvanced();
        calculator.add(X, Y);
        total = calculator.getTotal();
        calculator.subtract(total, Z);
        total = calculator.getTotal();

        System.out.printf("The total of (%d + %d - %d) is %d: \n\n", X, Y, Z, total);

        calculator.clearTotal();

        System.out.print("Please enter the value for X as a double: ");
        XD = Double.parseDouble(kb.nextLine());
        System.out.print("Please enter the value for Y as a double: ");
        YD = Double.parseDouble(kb.nextLine());

        System.out.print("Please enter the value for Z as a double: ");
        ZD = Double.parseDouble(kb.nextLine());

        calculator.add(XD, YD);
        totalD = calculator.getTotalD();
        calculator.subtract(totalD, ZD);
        totalD = calculator.getTotalD();

        System.out.printf("The total of (%.2f + %.2f - %.2f) is %.2f: \n\n", XD, YD, ZD, totalD);
        calculator.clearTotal();

        calculator.multiply(X, Y);
        total = calculator.getTotal();
        calculator.add(total, Z);
        total = calculator.getTotal();

        System.out.printf("The total of (%d * %d + %d) is %d: \n", X, Y, Z, total);
        calculator.clearTotal();

        calculator.multiply(XD, YD);
        totalD = calculator.getTotalD();
        calculator.add(totalD, ZD);
        totalD = calculator.getTotalD();

        System.out.printf("The total of (%.2f * %.2f + %.2f) is %.2f: \n", XD, YD, ZD, totalD);

    }

}
