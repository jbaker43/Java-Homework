/**
 * A bank account has a balance that can be changed by deposits and withdrawls.
 * Jacob Baker
 * @9/21/18
 */
public class BankAccount
{
    private double balance;
    /**
     * Constructs a bank account with a zero balance.
     */
    public BankAccount()
    {
        balance = 0;
    }
    /**
     * Constructs a bank account with a given balance.
     * @param initialBalance the initial balance
     */
    public BankAccount(double initialBalance)
    {
        balance = initialBalance;
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
}