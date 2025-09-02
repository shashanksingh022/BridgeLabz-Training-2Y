import java.util.Scanner;

public class NumberChecker2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        String s = String.valueOf(num);
        int[] arr = new int[s.length()];
        for (int i = 0; i < arr.length; i++) arr[i] = s.charAt(i) - '0';

        int sum = 0, sumSq = 0;
        for (int d : arr) {
            sum += d;
            sumSq += d * d;
        }
        System.out.println("Sum of digits = " + sum);
        System.out.println("Sum of squares = " + sumSq);

        System.out.println("Harshad? " + (num % sum == 0));

        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) freq[i][0] = i;
        for (int d : arr) freq[d][1]++;

        System.out.println("Digit frequency:");
        for (int i = 0; i < 10; i++) {
            if (freq[i][1] > 0)
                System.out.println(i + " -> " + freq[i][1]);
        }
        sc.close();
    }
}
