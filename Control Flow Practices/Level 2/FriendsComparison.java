import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amar's age: ");
        int amarAge = sc.nextInt();
        System.out.print("Enter Amar's height (in cm): ");
        int amarHeight = sc.nextInt();

        System.out.print("Enter Akbar's age: ");
        int akbarAge = sc.nextInt();
        System.out.print("Enter Akbar's height (in cm): ");
        int akbarHeight = sc.nextInt();

        System.out.print("Enter Anthony's age: ");
        int anthonyAge = sc.nextInt();
        System.out.print("Enter Anthony's height (in cm): ");
        int anthonyHeight = sc.nextInt();

        String youngest = (amarAge <= akbarAge && amarAge <= anthonyAge) ? "Amar" :
                          (akbarAge <= amarAge && akbarAge <= anthonyAge) ? "Akbar" : "Anthony";

        String tallest = (amarHeight >= akbarHeight && amarHeight >= anthonyHeight) ? "Amar" :
                         (akbarHeight >= amarHeight && akbarHeight >= anthonyHeight) ? "Akbar" : "Anthony";

        System.out.println("Youngest Friend: " + youngest);
        System.out.println("Tallest Friend: " + tallest);

        sc.close();
    }
}
