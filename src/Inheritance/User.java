package Inheritance;

public class User 
{
    private String userName;
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

}
