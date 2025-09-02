import java.util.Scanner;

public class SumNaturalRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int sumLoop = 0;
        for (int i = 1; i <= n; i++) sumLoop += i;

        int sumFormula = n * (n + 1) / 2;

        System.out.println("Sum using loop: " + sumLoop);
        System.out.println("Sum using formula: " + sumFormula);
        sc.close();
    }
}
