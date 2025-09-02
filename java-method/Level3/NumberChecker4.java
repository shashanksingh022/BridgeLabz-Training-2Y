import java.util.Scanner;

public class NumberChecker4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        boolean prime = true;
        if (num <= 1) prime = false;
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) { prime = false; break; }
        }
        System.out.println("Prime? " + prime);

        int square = num * num, sumDigits = 0;
        int temp = square;
        while (temp > 0) { sumDigits += temp % 10; temp /= 10; }
        System.out.println("Neon? " + (sumDigits == num));

        int sum = 0, prod = 1;
        temp = num;
        while (temp > 0) { int d = temp % 10; sum += d; prod *= d; temp /= 10; }
        System.out.println("Spy? " + (sum == prod));

        System.out.println("Automorphic? " + String.valueOf(square).endsWith(String.valueOf(num)));
        System.out.println("Buzz? " + (num % 7 == 0 || num % 10 == 7));
        sc.close();
    }
}
