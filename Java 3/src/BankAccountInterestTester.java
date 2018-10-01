/**
 * A class to test the BankAccountInterest Class.
 * Jacob Baker
 * @9/21/18
 */
public class BankAccountInterestTester
{
    /**
     * Test the methods of the BankAccount class.
     * @parm args not used
     */
    public static void main(String[]args)
    {
        BankAccount harrysChecking = new BankAccount();
        harrysChecking.deposit(2000);
        harrysChecking.withdraw(500);
        System.out.println(harrysChecking.getbalance());
        System.out.println("Expected: 1500");
    }
}