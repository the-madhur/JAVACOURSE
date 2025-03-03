package Inheritance;

public class User 
{
    protected String userName;  // protected - this can help to be accessible by all the sub classes
    private String email;

    public User(String userNamme, String email)
    {
        this.userName = userNamme;
        this.email = email;
    }

    public void login()
    {
        System.out.println(userName+" logged in");
    }

    public void showDashboard()
    {
        System.out.println(userName + "'s dashboard");
    }

}
