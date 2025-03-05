package ConsTructorInheritance;

class Demo1
{
    int m,n;
    public Demo1()
    {
        System.out.println("Parent Class Constructor....");
    }

    public Demo1(int x, int y)
    {
        System.out.println("Parent Class Parameterized Constructor....");
        m=x;
        n=y;
    }
}

class Demo2 extends Demo1
{
    int a, b;
    public Demo2()
    {
        //super();
        //super(10,20);
        System.out.println("Child Class Constructor....");
    }

    public Demo2(int x, int y)
    {
        super(10,20);
        System.out.println("Child Class Parameterized Constructor....");
    }
}
public class ConstructInherit 
{
    public static void main(String[] args) 
    {
        //Demo2 d1 = new Demo2();
        Demo2 d2 = new Demo2(10,20);
        
    }

}
