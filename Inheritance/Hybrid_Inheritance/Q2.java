/*Sample Problem 2: Vehicle Management System with Hybrid Inheritance
Description: Model a vehicle system where Vehicle is the superclass and ElectricVehicle and PetrolVehicle are subclasses. Additionally, create a Refuelable interface implemented by PetrolVehicle.
Tasks:
Define a superclass Vehicle with attributes like maxSpeed and model.
Create an interface Refuelable with a method refuel().
Define subclasses ElectricVehicle and PetrolVehicle. PetrolVehicle should implement Refuelable, while ElectricVehicle include a charge() method.
Goal: Use hybrid inheritance by having PetrolVehicle implement both Vehicle and Refuelable, demonstrating how Java interfaces allow adding multiple behaviors. */

interface Refuelable {
    void refuel(double liters);
}

class Vehicle {
    protected int maxSpeed;
    protected String model;

    public Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    public void displayInfo() {
        System.out.println(model + " | MaxSpeed: " + maxSpeed + " km/h");
    }
}

class ElectricVehicle extends Vehicle {
    private int batteryPercent;

    public ElectricVehicle(int maxSpeed, String model, int batteryPercent) {
        super(maxSpeed, model);
        this.batteryPercent = batteryPercent;
    }

    public void charge(int amount) {
        batteryPercent = Math.min(100, batteryPercent + amount);
        System.out.println(model + " charged to " + batteryPercent + "%");
    }

    @Override
    public void displayInfo() {
        System.out.println(model + " (EV) | MaxSpeed: " + maxSpeed + " km/h, Battery: " + batteryPercent + "%");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {
    private double fuelLevel;

    public PetrolVehicle(int maxSpeed, String model, double fuelLevel) {
        super(maxSpeed, model);
        this.fuelLevel = fuelLevel;
    }

    @Override
    public void refuel(double liters) {
        fuelLevel += liters;
        System.out.println(model + " refueled, Fuel: " + fuelLevel + " L");
    }

    @Override
    public void displayInfo() {
        System.out.println(model + " (Petrol) | MaxSpeed: " + maxSpeed + " km/h, Fuel: " + fuelLevel + " L");
    }
}

public class Q2 {
    public static void main(String[] args) {
        Vehicle v1 = new ElectricVehicle(180, "Model-E", 45);
        Vehicle v2 = new PetrolVehicle(200, "Speedster-P", 20.0);

        v1.displayInfo();
        v2.displayInfo();

        ((ElectricVehicle) v1).charge(30);
        ((Refuelable) v2).refuel(15.0);

        Vehicle[] fleet = {
            v1,
            v2,
            new PetrolVehicle(170, "City-P", 12.5),
            new ElectricVehicle(160, "Compact-E", 80)
        };

        for (Vehicle v : fleet) {
            v.displayInfo();
        }
    }
}
