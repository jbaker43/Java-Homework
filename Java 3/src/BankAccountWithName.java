/**
 * A bank account has a balance that can be changed by deposits and withdrawls.
 * Jacob Baker
 * @9/21/18
 */
public class BankAccountWithName
{
    private double balance;
    public String name;
    /**
     * Constructs a bank account with a zero balance.
     */
    public BankAccountWithName()
    {
        balance = 0;
        name = "Jane Doe";
    }
    /**
     * Constructs a bank account with a given balance.
     * @param initialBalance the initial balance
     */
    public BankAccountWithName(double initialBalance, String n)
    {
        balance = initialBalance;
        name = n;
    }
    /**
     * Deposits money into the bank account
     * @param amount the the amount to deposit 
     */
    public void deposit(double amount)
    {
        balance = balance + amount;
    }
    /** 
     * Withdrawls money from the bank account.
     * @param amount the amount to withdraw
     */
    public void withdraw(double amount)
    {
        balance = balance - amount;
    }
    /**
     * Gets the current balance of the bank account.
     * @return  the current balance
     */
    public double getbalance()
    {
        return balance;
    }
    /**
     * Prints the name of the Accoutn holder.
     * @return the name
     */
    public String getname()
    {
        return name;
    }
}