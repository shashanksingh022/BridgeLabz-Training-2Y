/*Sample Problem 2: Smart Home Devices
Description: Create a hierarchy for a smart home system where Device is the superclass and Thermostat is a subclass.
Tasks:
Define a superclass Device with attributes like deviceId and status.
Create a subclass Thermostat with additional attributes like temperatureSetting.
Implement a method displayStatus() to show each device's current settings.
Goal: Understand single inheritance by adding specific attributes to a subclass, keeping the superclass general.
 */

 class Device {
    protected String deviceId;
    protected String status;

    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    public void displayStatus() {
        System.out.println("Device " + deviceId + " | Status: " + status);
    }
}

class Thermostat extends Device {
    private double temperatureSetting;

    public Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    public void displayStatus() {
        System.out.println("Thermostat " + deviceId + " | Status: " + status + " | Temp: " + temperatureSetting + "°C");
    }
}

public class Q2 {
    public static void main(String[] args) {
        Device d1 = new Device("DEV-001", "ONLINE");
        Device d2 = new Thermostat("THERM-101", "ONLINE", 23.5);

        d1.displayStatus();
        d2.displayStatus();

        Device[] devices = {
            new Device("DEV-002", "OFFLINE"),
            new Thermostat("THERM-202", "ONLINE", 21.0)
        };

        for (Device d : devices) {
            d.displayStatus();
        }
    }
}
