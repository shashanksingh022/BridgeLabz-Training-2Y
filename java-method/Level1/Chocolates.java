import java.util.Scanner;

public class Chocolates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter chocolates: ");
        int chocolates = sc.nextInt();
        System.out.print("Enter children: ");
        int children = sc.nextInt();

        int each = chocolates / children;
        int remaining = chocolates % children;

        System.out.println("Each child gets: " + each + ", Remaining: " + remaining);
        sc.close();
    }
}
