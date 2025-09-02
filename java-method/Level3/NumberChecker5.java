import java.util.Scanner;

public class NumberChecker5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int sumDiv = 0;
        for (int i = 1; i < num; i++) if (num % i == 0) sumDiv += i;
        System.out.println("Perfect? " + (sumDiv == num));
        System.out.println("Abundant? " + (sumDiv > num));
        System.out.println("Deficient? " + (sumDiv < num));

        int temp = num, strongSum = 0;
        while (temp > 0) {
            int d = temp % 10;
            int fact = 1;
            for (int i = 1; i <= d; i++) fact *= i;
            strongSum += fact;
            temp /= 10;
        }
        System.out.println("Strong? " + (strongSum == num));
        sc.close();
    }
}
