import java.util.Scanner;

public class UnitConverter1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter kilometers: ");
        double km = sc.nextDouble();
        System.out.println("Miles = " + (km * 0.621371));

        System.out.print("Enter miles: ");
        double miles = sc.nextDouble();
        System.out.println("Km = " + (miles * 1.60934));

        System.out.print("Enter meters: ");
        double m = sc.nextDouble();
        System.out.println("Feet = " + (m * 3.28084));

        System.out.print("Enter feet: ");
        double feet = sc.nextDouble();
        System.out.println("Meters = " + (feet * 0.3048));
        sc.close();
    }
}
