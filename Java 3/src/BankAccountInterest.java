
/**
 * A bank account has a balance that can be changed by deposits and withdrawals.
 * Jacob Baker
 * @9/21/18
 */
public abstract class BankAccountInterest
{
    public double balance;
    /**
     * Constructs a bank account with a zero balance.
     */
    public BankAccountInterest()
    {
        balance = 0;
    }
    /**
     * Constructs a bank account with a given balance.
     * @param initialBalance the initial balance
     */
    public BankAccountInterest(double initialBalance)
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
     * Withdrawals money from the bank account.
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
     * Interest Rate.
     * @param Intrest Rate
     */
    public void Intrest(double amount)
    {
      double Interest = .01;
    }
    public abstract void addinterest(double rate);
    } 