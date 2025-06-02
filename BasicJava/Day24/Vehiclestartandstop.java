package BasicJava.Day24;

class Vehicle 
{
    public void startEngine() 
    {
        System.out.println("Start the engine");
    }

    public void stopEngine() 
    {
        System.out.println("Stop the engine");
    }
}

class Car extends Vehicle 
{
    @Override
    public void startEngine() 
    {
        System.out.println("Start the car engine");
    }

    @Override
    public void stopEngine() 
    {
        System.out.println("Stop the car engine");
    }
}

class Motorcycle extends Vehicle 
{
    @Override
    public void startEngine() 
    {
        System.out.println("Start the motorcycle engine");
    }

    @Override
    public void stopEngine() 
    {
        System.out.println("Stop the motorcycle engine");
    }
}

public class Vehiclestartandstop 
{
    public static void main(String[] args) 
    {
        Vehicle myCar = new Car();
        Vehicle myMotorcycle = new Motorcycle();
        myCar.startEngine();
        myCar.stopEngine();
        myMotorcycle.startEngine();
        myMotorcycle.stopEngine();
    }
}