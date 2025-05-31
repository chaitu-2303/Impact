class Vehicle {
    protected int speed;

    public Vehicle() {
        this.speed = 0;
    }

    public void speed() {
        speed += 10;
        System.out.println("Vehicle speed increased to: " + speed + " km/h");
    }
}

class Car extends Vehicle {
    @Override
    public void speed() {
        speed += 20; 
        System.out.println("Car speed increased to: " + speed + " km/h");
    }
}

class Cycle extends Vehicle {
    @Override
    public void speed() {
        speed += 5; 
        System.out.println("Cycle speed increased to: " + speed + " km/h");
    }
}

public class Vehile {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle();
        Vehicle myCar = new Car();
        Vehicle myCycle = new Cycle();

        System.out.println("Increasing speed:");
        myVehicle.speed();
        myCar.speed();
        myCycle.speed();
    }
}
