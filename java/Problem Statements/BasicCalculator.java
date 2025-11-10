import java.util.Scanner;

public class BasicCalculator {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Basic Calculator");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Choose an operation (1-4): ");
        int choice = sc.nextInt();

        double num1 = getInput("Enter first number: ");
        double num2 = getInput("Enter second number: ");

        switch (choice) {
            case 1 -> System.out.println("Result: " + add(num1, num2));
            case 2 -> System.out.println("Result: " + subtract(num1, num2));
            case 3 -> System.out.println("Result: " + multiply(num1, num2));
            case 4 -> {
                if (num2 == 0) System.out.println("Error: Division by zero");
                else System.out.println("Result: " + divide(num1, num2));
            }
            default -> System.out.println("Invalid choice");
        }
    }

    static double getInput(String message) {
        System.out.print(message);
        return sc.nextDouble();
    }

    static double add(double a, double b) {
        return a + b;
    }

    static double subtract(double a, double b) {
        return a - b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

    static double divide(double a, double b) {
        return a / b;
    }
}
