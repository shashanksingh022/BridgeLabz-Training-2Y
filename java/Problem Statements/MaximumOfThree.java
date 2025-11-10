import java.util.Scanner;

public class MaximumOfThree {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = getInput("Enter the first number: ");
        int num2 = getInput("Enter the second number: ");
        int num3 = getInput("Enter the third number: ");

        int max = findMaximum(num1, num2, num3);

        System.out.println("The maximum number is: " + max);
    }

    static int getInput(String message) {
        System.out.print(message);
        return sc.nextInt();
    }

    static int findMaximum(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }
}
