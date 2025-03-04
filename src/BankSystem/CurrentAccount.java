package BankSystem;

public class CurrentAccount extends BankAccount
{
    private double overdraftLimit = 5000; 
    public CurrentAccount(String accountHolder, double balance)
    {
        super(accountHolder, balance);
    }

    @Override
    public void deposit(double amount)
    {
        if(amount>0)
        {
            balance = balance + amount;
            System.out.println(amount +" deposited in Current Account...");
        }
        else 
        {
            System.out.println("Invalid Deposit Amount");
        }
    }
    
    @Override
    public void withdraw(double amount)
    {
        if(amount > 0 && (balance + overdraftLimit) >= amount) //that amount you want to withdraw is less or equal to the present balance amount in your bank 
        {
            balance = balance - amount;
            System.out.println(amount + " withdrawn from Current Account...");
        }
        else 
        {
            System.out.println("Withdrawl exceeds overdraft limit!");
        }
    }

}
