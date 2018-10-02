/**
 * A class to test the BankAccount Class.
 * Jacob Baker
 * @9/21/18
 */
public class BankAccountWithNameTester
{
    /**
     * Test the methods of the BankAccountWithName class.
     * @parm args not used
     */
    public static void main(String[]args)
    {
        BankAccountWithName sueAccount = new BankAccountWithName(300,"Sue");
        System.out.println(sueAccount.getname());
        System.out.println(sueAccount.getbalance());
    }
}