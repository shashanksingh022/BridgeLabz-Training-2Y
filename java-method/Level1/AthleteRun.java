import java.util.Scanner;

public class AthleteRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1: ");
        double a = sc.nextDouble();
        System.out.print("Enter side 2: ");
        double b = sc.nextDouble();
        System.out.print("Enter side 3: ");
        double c = sc.nextDouble();

        double perimeter = a + b + c;
        double rounds = 5000 / perimeter;  // 5km = 5000m
        System.out.println("Number of rounds: " + rounds);
        sc.close();
    }
}
