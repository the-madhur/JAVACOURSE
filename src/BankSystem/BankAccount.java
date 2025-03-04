package BankSystem;

public abstract class BankAccount 
{
    protected String accountHolder;
    protected double balance;

    public BankAccount(String accountHolder, double balance)
    {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    public void checkBalance()
    {
        System.out.println(accountHolder + "'s current balance: "+ balance);
    }
}