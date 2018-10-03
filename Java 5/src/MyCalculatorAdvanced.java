/**
 * My Calculator Advanced
 * @author jakebaker
 *10/02/2018
 */
public class MyCalculatorAdvanced {

    private int total;
    private double totalD;

    public MyCalculatorAdvanced()
    {
        total = 0;
        totalD = 0;
    }

    public void add(int X, int Y)
    {
        total =  X + Y;
    }

    public void add(double X, double Y)
    {
        totalD =  X + Y;
    }

    public void subtract(int X, int Y)
    {
        total =  X - Y;
    }

    public void subtract(double X, double Y)
    {
        totalD = X - Y;
    }

    public void multiply(int X, int Y)
    {
        total = X * Y;
    }

    public void multiply(double X, double Y)
    {
        totalD = X * Y;
    }

    public void divide(int X, int Y)
    {
        total = X / Y;
    }

    public void divide(double X, double Y)
    {
        totalD = X / Y;
    }

    public int getTotal()
    {
        return total;
    }

    public double getTotalD()
    {
        return totalD;
    }

    public void clearTotal()
    {
        total = 0;
        totalD = 0.0;
    }

}