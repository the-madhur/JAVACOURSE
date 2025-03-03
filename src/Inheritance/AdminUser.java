package Inheritance;

public class AdminUser extends User 
{
    public AdminUser(String userName, String email)
    {
        super(userName, email);
    }

    public void manageProducts()
    {
        System.out.println("Admin is managing products");
    }

    // @Override
    // public void showDashboard()
    // {
    //     System.out.println("Admin user specialised dashboard");
    // }

    public static void main (String[] args)
    {
        AdminUser au = new AdminUser("madhur2018", "madhur2018@gmail.com");
        au.login();
        au.showDashboard();
    }
}


