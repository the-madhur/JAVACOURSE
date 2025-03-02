package Constructor;

// Constructor Overloading - Creating multiple constructors with same name but having different parameters are referred as Constructor Overloading
class Car
{
    private String carName;
    private int maxSpeed;

    Car()
    {
        System.out.println("Default Constructor");
        carName = "Mercedes-AMG G63 V8";
        maxSpeed = 240;
    }

    Car(String carName)
    {
        this.carName = carName;
        maxSpeed = 180;
    }

    Car(String carName, int maxSpeed)
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
public class ConstructorOverloading 
{
    public static void main(String[] args) 
    {
        Car car = new Car();
        car.disp();

        Car car1 = new Car("Mercedes-Benz G-Class Electric G 580");
        car1.disp();

        Car car2 = new Car("Mercedes-Benz G-Class G 500D" ,216);
        car2.disp();
        
    }

}
