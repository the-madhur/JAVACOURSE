package IntroTopics;

// here we learn to connect files in same package like that we connect while making project

public class HelloImplement 
{
    public static void main(String[] args) 
    {
        HelloWorld obj = new HelloWorld();
        obj.setHello("FINAL HELLO");
        System.out.println(obj.getHello());
        
    }

}
