import java.util.Scanner;

public class NumberChecker1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        String s = String.valueOf(num);
        int digits = s.length();
        System.out.println("Digits count = " + digits);

        int[] arr = new int[digits];
        for (int i = 0; i < digits; i++) arr[i] = s.charAt(i) - '0';

        boolean duck = s.contains("0");
        System.out.println("Duck number? " + duck);

        int armstrongSum = 0;
        for (int d : arr) armstrongSum += Math.pow(d, digits);
        System.out.println("Armstrong? " + (armstrongSum == num));

        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;

        for (int d : arr) {
            if (d > largest) { secondLargest = largest; largest = d; }
            else if (d > secondLargest && d != largest) secondLargest = d;

            if (d < smallest) { secondSmallest = smallest; smallest = d; }
            else if (d < secondSmallest && d != smallest) secondSmallest = d;
        }

        System.out.println("Largest = " + largest + ", 2nd Largest = " + secondLargest);
        System.out.println("Smallest = " + smallest + ", 2nd Smallest = " + secondSmallest);
        sc.close();
    }
}
