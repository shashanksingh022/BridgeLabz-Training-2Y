import java.util.Scanner;

public class StudentVoteChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();

            if (ages[i] < 0) {
                System.out.println("Invalid age, cannot vote");
            } else if (ages[i] >= 18) {
                System.out.println("Can vote");
            } else {
                System.out.println("Cannot vote");
            }
        }
        sc.close();
    }
}
