import java.util.Scanner;

public class FactorsExtended {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int count = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) count++;
        int[] factors = new int[count]; int idx = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) factors[idx++] = i;

        int sum = 0, prod = 1, cubeProd = 1, greatest = 0;
        for (int f : factors) {
            sum += f;
            prod *= f;
            cubeProd *= Math.pow(f, 3);
            if (f > greatest) greatest = f;
        }
        System.out.println("Sum = " + sum);
        System.out.println("Product = " + prod);
        System.out.println("Cube product = " + cubeProd);
        System.out.println("Greatest factor = " + greatest);
        sc.close();
    }
}
