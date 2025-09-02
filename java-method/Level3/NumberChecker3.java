import java.util.Scanner;

public class NumberChecker3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        String s = sc.next();

        String rev = new StringBuilder(s).reverse().toString();
        System.out.println("Reversed = " + rev);

        System.out.println("Palindrome? " + s.equals(rev));
        System.out.println("Duck number? " + s.contains("0"));
        sc.close();
    }
}
