import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a date (yyyy-MM-dd): ");
        String input = sc.nextLine();

        LocalDate date = LocalDate.parse(input);
        LocalDate result = date.plusDays(7).plusMonths(1).plusYears(2);

        result = result.minusWeeks(3);

        System.out.println("Final date after arithmetic: " + result);
    }
}
