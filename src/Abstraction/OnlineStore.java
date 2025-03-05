package Abstraction;

public class OnlineStore 
{
    public static void main(String[] args) 
    {
        Product electronics = new Electronics("Smartphone", 10000);
        Product clothing = new Electronics("T-Shirt", 270);

        System.out.println("Tax on Electronics at Price: "+electronics.calculateTax());
        System.out.println("Shipping Cost on Clothing at Price: "+clothing.calculateShippingCost());
        
    }

}
