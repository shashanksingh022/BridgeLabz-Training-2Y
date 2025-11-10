/*Vehicle and Transport System
Description: Design a vehicle hierarchy where Vehicle is the superclass, and Car, Truck, and Motorcycle are subclasses with unique attributes.
Tasks:
Define a superclass Vehicle with maxSpeed and fuelType attributes and a method displayInfo().
Define subclasses Car, Truck, and Motorcycle, each with additional attributes, such as seatCapacity for Car.
Demonstrate polymorphism by storing objects of different subclasses in an array of Vehicle type and calling displayInfo() on each.
Goal: Understand how inheritance helps in organizing shared and unique features across subclasses and use polymorphism for dynamic method calls. */

class Vehicle {
    protected int maxSpeed;
    protected String fuelType;

    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    public void displayInfo() {
        System.out.println("Vehicle | MaxSpeed: " + maxSpeed + " km/h, Fuel: " + fuelType);
    }
}

class Car extends Vehicle {
    private int seatCapacity;

    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car | MaxSpeed: " + maxSpeed + " km/h, Fuel: " + fuelType + ", Seats: " + seatCapacity);
    }
}

class Truck extends Vehicle {
    private double payloadCapacityTons;

    public Truck(int maxSpeed, String fuelType, double payloadCapacityTons) {
        super(maxSpeed, fuelType);
        this.payloadCapacityTons = payloadCapacityTons;
    }

    @Override
    public void displayInfo() {
        System.out.println("Truck | MaxSpeed: " + maxSpeed + " km/h, Fuel: " + fuelType + ", Payload: " + payloadCapacityTons + " tons");
    }
}

class Motorcycle extends Vehicle {
    private boolean hasABS;

    public Motorcycle(int maxSpeed, String fuelType, boolean hasABS) {
        super(maxSpeed, fuelType);
        this.hasABS = hasABS;
    }

    @Override
    public void displayInfo() {
        System.out.println("Motorcycle | MaxSpeed: " + maxSpeed + " km/h, Fuel: " + fuelType + ", ABS: " + hasABS);
    }
}

public class Q3 {
    public static void main(String[] args) {
        Vehicle v1 = new Car(180, "Petrol", 5);
        Vehicle v2 = new Truck(120, "Diesel", 12.5);
        Vehicle v3 = new Motorcycle(160, "Petrol", true);

        Vehicle[] garage = { v1, v2, v3, new Car(200, "Hybrid", 4), new Truck(100, "CNG", 8.0) };

        for (Vehicle v : garage) {
            v.displayInfo();
        }
    }
}
