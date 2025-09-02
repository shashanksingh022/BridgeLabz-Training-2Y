import java.util.Scanner;

public class NumbersCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();

            if (arr[i] >= 0) {
                System.out.print("Positive ");
                if (arr[i] % 2 == 0)
                    System.out.println("Even");
                else
                    System.out.println("Odd");
            } else {
                System.out.println("Negative");
            }
        }

        if (arr[0] > arr[4]) System.out.println("First > Last");
        else if (arr[0] < arr[4]) System.out.println("First < Last");
        else System.out.println("First == Last");
        sc.close();
    }
}
