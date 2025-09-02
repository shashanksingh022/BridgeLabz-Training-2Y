import java.util.Scanner;

public class UnitConverter2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter yards: ");
        double yards = sc.nextDouble();
        System.out.println("Feet = " + (yards * 3));

        System.out.print("Enter feet: ");
        double feet = sc.nextDouble();
        System.out.println("Yards = " + (feet * 0.333333));

        System.out.print("Enter meters: ");
        double meters = sc.nextDouble();
        System.out.println("Inches = " + (meters * 39.3701));

        System.out.print("Enter inches: ");
        double inches = sc.nextDouble();
        System.out.println("Meters = " + (inches * 0.0254));

        System.out.print("Enter inches: ");
        double in2 = sc.nextDouble();
        System.out.println("Centimeters = " + (in2 * 2.54));
        sc.close();
    }
}
