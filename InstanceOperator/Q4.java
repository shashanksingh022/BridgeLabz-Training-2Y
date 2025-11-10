/*Create a Vehicle class with the following features:
Static:
○       A static variable registrationFee common for all vehicles.
○       A static method updateRegistrationFee() to modify the fee.
This:
○       Use this to initialize ownerName, vehicleType, and registrationNumber in the constructor.
Final:
○       Use a final variable registrationNumber to uniquely identify each vehicle.
Instanceof:
○       Check if an object belongs to the Vehicle class before displaying its registration
○       details.
 */

 class Vehicle {
    private String ownerName;
    private String vehicleType;
    private final String registrationNumber;

    static double registrationFee = 5000;

    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public void displayVehicleDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: ₹" + registrationFee);
            System.out.println("-----------------------------");
        } else {
            System.out.println("Not a valid Vehicle object!");
        }
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: ₹" + registrationFee);
        System.out.println("=============================");
    }
}

class Q4{
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Kartik", "Car", "MH12AB1234");
        Vehicle v2 = new Vehicle("Aman", "Bike", "MH12XY5678");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        Vehicle.updateRegistrationFee(7000);

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
