package Inheritance;

public class SellerUser extends User 
{
    public SellerUser(String userName, String email)
    {
        super(userName, email);
    }

    public void addProducts()
    {
        System.out.println("Seller is adding a new product");
    }

    @Override
    public void showDashboard()
    {
        System.out.println("Seller user 's personalized dashboard");
    }
}
