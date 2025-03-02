package Constructor;

class Student1
{
    private String name;
    private int rollNo;

    public Student1()   // Default constructor
    {
        System.out.println("Default Constructor can called by programmer");
    }
    public Student1(String name, int rollNo)  // Parameterized Constructor
    {
        this.name = name;
        this.rollNo = rollNo;
    }

    void disp()
    {
        System.out.println(name);
        System.out.println(rollNo);
    }
}
public class ConstructorComplete 
{
    public static void main(String[] args) 
    {
        Student1 stud1 = new Student1();
        stud1.disp();

        Student1 stud2 = new Student1("Madhur", 79);
        stud2.disp();

    }

}
