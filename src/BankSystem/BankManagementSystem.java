package BankSystem;
import java.util.Scanner;

public class BankManagementSystem 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Account Type");
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        int accountType = sc.nextInt();
        sc.nextLine(); // for new line

        System.out.println("Enter Account Holder's Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Balance: ");
        double balance = sc.nextDouble();

        BankAccount account;
        if(accountType ==1)
        {
            account = new SavingsAccount(name, balance);
        }
        else
        {
            account = new CurrentAccount(name, balance);
        }

        System.out.println("\nAccount created succesfully for "+name);

        while(true)
        {
            System.out.println("\n===BANK MANAGEMENT SYSTEM ===");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println("Choose an option...");

            int choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                System.out.println("Enter deposit amount: ");
                double depositAmount = sc.nextDouble();
                account.deposit(depositAmount);
                break;

                case 2:
                System.out.println("Enter withdrawl amoubt: ");
                double withdrawAmount = sc.nextDouble();
                account.withdraw(withdrawAmount);
                break;

                case 3:
                account.checkBalance();
                break;

                case 4:
                System.out.println("Thank you for using the Bank Mangement System!");
                sc.close();
                System.exit(0);

                default:
                System.out.println("Invalid choice! Please try again.");
            }
        }
    }

}
