import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Check if the year is valid for the Gregorian calendar
        if (year < 1582) {
            System.out.println("The program works only for years >= 1582.");
        } else {
            System.out.println("---- Using Multiple If-Else Statements ----");
            if (year % 400 == 0) {
                System.out.println(year + " is a Leap Year");
            } else if (year % 100 == 0) {
                System.out.println(year + " is NOT a Leap Year");
            } else if (year % 4 == 0) {
                System.out.println(year + " is a Leap Year");
            } else {
                System.out.println(year + " is NOT a Leap Year");
            }

            System.out.println("---- Using Single If Statement with Logical Operators ----");
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println(year + " is a Leap Year");
            } else {
                System.out.println(year + " is NOT a Leap Year");
            }
        }
        sc.close();
    }
}
