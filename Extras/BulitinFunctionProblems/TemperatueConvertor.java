/*Temperature Converter:
○ Write a program that converts temperatures between Fahrenheit and Celsius. ○
The program should have separate functions for converting from Fahrenheit to
Celsius and from Celsius to Fahrenheit.*/

import java.util.Scanner;

public class TemperatureConverter {

    // Convert Fahrenheit to Celsius
    private static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Convert Celsius to Fahrenheit
    private static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.print("Enter temperature value: ");
        double temp = scanner.nextDouble();

        System.out.print("Convert from (C)elsius or (F)ahrenheit? Enter C or F: ");
        char choice = scanner.next().trim().toUpperCase().charAt(0);

        switch (choice) {
            case 'C':
                double f = celsiusToFahrenheit(temp);
                System.out.printf("%.2f Celsius = %.2f Fahrenheit%n", temp, f);
                break;
            case 'F':
                double c = fahrenheitToCelsius(temp);
                System.out.printf("%.2f Fahrenheit = %.2f Celsius%n", temp, c);
                break;
            default:
                System.out.println("Invalid choice. Please enter either C or F.");
        }

        scanner.close();
    }
}
