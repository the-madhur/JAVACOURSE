package Constructor;

class Car1
{
    private String carName;
    private int maxSpeed;

    Car1()
    {
        this("G-Class",250);
        System.out.println("Default Constructor");
        // carName = "Mercedes-AMG G63 V8";
        // maxSpeed = 240;
    }

    Car1(String carName)
    {
        this();
        this.carName = carName;
        maxSpeed = 180;
    }

    Car1(String carName, int maxSpeed)
    {
        this.carName = carName;
        this.maxSpeed = maxSpeed;
    }

    void disp()
    {
        System.out.println("Model Name: "+carName);
        System.out.println("Max Speed: "+maxSpeed+" kmph");
    }

}
public class ConstructorLast 
{
    
    public static void main(String[] args) 
    {
        Car1 carM = new Car1();
        carM.disp();

        Car1 carM1 = new Car1("Mercedes-Benz G-Class Electric G 580");
        carM1.disp();

        Car1 carM2 = new Car1("Mercedes-Benz G-Class G 500D" ,216);
        carM2.disp();
        
    }

}

