import java.util.Scanner;

public class PrimeNumberChecker {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int number = getInput("Enter a number to check: ");

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    static int getInput(String message) {
        System.out.print(message);
        return sc.nextInt();
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
