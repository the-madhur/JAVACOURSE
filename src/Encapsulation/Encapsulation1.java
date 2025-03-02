package Encapsulation;

// Encapsulation - Binding of Data into a single unit is called as Encapsulation 
// Encapsulation = Data Hiding(using private modifiers we can implement Data hiding) + Data Abstraction
// If any java class follow data hiding and abstraction then such class referred as Encapsulated class
// we can also learn Shadowing Problem - if both instance variable and local variable having same name then the result would be name clash
// JVM confuses and always give preference to local variable so that is Shadowing problem
// It can be resolve by using This keyword 
// Setters : used to set the values to the instance var of the class
//  return type should be void        
// In this program we can learn to use private modifiers and this keyword and also use Setters and getters for set and get data

class Student
{
    private String name;
    private int rollNo;

    public void setName(String name)
    {
        this.name = name;    // 1st name is instance var 2nd name is local var 
    }

    public String getName()
    {
        return name;
    }

    public void setRollNo(int rollNo)
    {
        this.rollNo = rollNo;    // use of this keyword
    }

    public int getRollNo()
    {
        return rollNo;
    }
}

public class Encapsulation1 
{
    public static void main(String[] args) 
    {
        Student obj = new Student();
        Student obj1 = new Student();

        obj.setName("Madhur");
        obj1.setName("Anubhav");

        obj.setRollNo(29);
        obj1.setRollNo(39);

        System.out.println("Student 1 "+"Name: "+obj.getName() +" "+"Roll No: "+obj.getRollNo());
        System.out.println("Student 2 "+"Name: "+obj1.getName() +" "+"Roll No: "+obj1.getRollNo());
    }

}
