package BankSystem;

public class SavingsAccount extends BankAccount 
{
    public SavingsAccount(String accountHolder, double balance)
    {
        super(accountHolder, balance);
    }

    @Override
    public void deposit(double amount)
    {
        if(amount>0)
        {
            balance = balance + amount;
            System.out.println(amount +" deposited in Savings Account...");
        }
        else 
        {
            System.out.println("Invalid Deposit Amount");
        }
    }
    
    @Override
    public void withdraw(double amount)
    {
        if(amount>0 && amount <= balance) //that amount you want to withdraw is less or equal to the present balance amount in your bank 
        {
            balance = balance - amount;
            System.out.println(amount + " withdrawn from Savings Account...");
        }
        else 
        {
            System.out.println("Invalid withdrawl amount or Insufficient balance!");
        }
    }
}
