package Constructor;

public class StudentCall 
{
    public static void main(String[] args) 
    {
        Student stud = new Student("madhur", 21); // here we pass value at the time of object creation so it is possible by Constructor

        System.out.println(stud.getName()+" "+stud.getAge());
        
    }
}

