package BankSystem;

public class SavingsAccount extends BankAccount 
{
    public SavingsAccount(String accountHolder, double balance)
    {
        super(accountHolder, balance);
    }

    public void deposit(double amount)
    {
        if(amount>0)
        {
            balance = balance + amount;
            System.out.println("₹" + amount +" deposited in Savings Account...");
        }
        else 
        {
            System.out.println("Invalid Deposit Amount");
        }
    }
    
    public void withdraw(double amount)
    {
        if(amount>0)
        {
            balance = balance + amount;
            System.out.println("₹" + amount +" deposited in Savings Account...");
        }
        else 
        {
            System.out.println("Invalid Deposit Amount");
        }
    }
}
