/*Car Rental System: Create a CarRental class with attributes customerName, carModel, and rentalDays. Add constructors to initialize the rental details and calculate total cost. */

class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;

    public CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Not Selected";
        this.rentalDays = 0;
    }

   
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

   
    public CarRental(CarRental other) {
        this.customerName = other.customerName;
        this.carModel = other.carModel;
        this.rentalDays = other.rentalDays;
    }

    
    public double calculateTotalCost() {
        double ratePerDay;

        switch (carModel.toLowerCase()) {
            case "suv":
                ratePerDay = 2000;
                break;
            case "sedan":
                ratePerDay = 1500;
                break;
            case "hatchback":
                ratePerDay = 1000;
                break;
            default:
                ratePerDay = 1200; 
        }

        return rentalDays * ratePerDay;
    }

    // Display rental details
    public void displayDetails() {
        System.out.println("Customer: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: ₹" + calculateTotalCost());
        System.out.println("-------------------------");
    }

    
    public static void main(String[] args) {
        CarRental rental1 = new CarRental("Kartik", "SUV", 5);
        CarRental rental2 = new CarRental("Aman", "Sedan", 3);
        CarRental rental3 = new CarRental(rental1); // copy constructor

        rental1.displayDetails();
        rental2.displayDetails();
        rental3.displayDetails();
    }
}
