import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();
        System.out.print("Enter wind speed: ");
        double windSpeed = sc.nextDouble();

        double windChill = 35.74 + (0.6215 * temp) + (0.4275 * temp - 35.75) * Math.pow(windSpeed, 0.16);

        System.out.println("Wind Chill: " + windChill);
        sc.close();
    }
}
