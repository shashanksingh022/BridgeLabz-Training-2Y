import java.util.Scanner;

public class UnitConverter3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Fahrenheit: ");
        double f = sc.nextDouble();
        System.out.println("Celsius = " + ((f - 32) * 5 / 9));

        System.out.print("Enter Celsius: ");
        double c = sc.nextDouble();
        System.out.println("Fahrenheit = " + ((c * 9 / 5) + 32));

        System.out.print("Enter pounds: ");
        double pounds = sc.nextDouble();
        System.out.println("Kilograms = " + (pounds * 0.453592));

        System.out.print("Enter kilograms: ");
        double kg = sc.nextDouble();
        System.out.println("Pounds = " + (kg * 2.20462));

        System.out.print("Enter gallons: ");
        double gal = sc.nextDouble();
        System.out.println("Liters = " + (gal * 3.78541));

        System.out.print("Enter liters: ");
        double liters = sc.nextDouble();
        System.out.println("Gallons = " + (liters * 0.264172));
        sc.close();
    }
}
