import java.util.Scanner;

public class Sumuntilzero1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        double number;

        System.out.print("Enter a number (0 to stop): ");
        number = sc.nextDouble();

        while (true) {
            total += number;
            System.out.print("Enter a number (0 to stop): ");
            number = sc.nextDouble();
            if(number==0){
                break;
            }
        }

        System.out.println("Total sum = " + total);
        sc.close();
    }
}
