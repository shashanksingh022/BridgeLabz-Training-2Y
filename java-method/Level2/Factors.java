import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) factors[index++] = i;
        }

        int sum = 0, sumSquares = 0, product = 1;
        System.out.print("Factors: ");
        for (int f : factors) {
            System.out.print(f + " ");
            sum += f;
            sumSquares += f * f;
            product *= f;
        }
        System.out.println("\nSum = " + sum);
        System.out.println("Sum of squares = " + sumSquares);
        System.out.println("Product = " + product);
        sc.close();
    }
}
