import java.util.Scanner;

public class Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[3];
        double[] heights = new double[3];
        String[] names = {"Amar", "Akbar", "Anthony"};

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of " + names[i] + ": ");
            heights[i] = sc.nextDouble();
        }

        int minIndex = 0, maxIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[minIndex]) minIndex = i;
            if (heights[i] > heights[maxIndex]) maxIndex = i;
        }

        System.out.println("Youngest: " + names[minIndex]);
        System.out.println("Tallest: " + names[maxIndex]);
        sc.close();
    }
}
