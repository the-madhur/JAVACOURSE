package Inheritance;

public class RegularUser extends User
{
    public RegularUser(String userName, String email)
    {
        super(userName, email);
    }

    public void browseProducts()
    {
        System.out.println("Customer is browsing product");
    }

    @Override
    public void showDashboard()
    {
        System.out.println("Regular user 's personalized dashboard");
    }
}
