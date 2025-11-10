/*Date Arithmetic Create a program that:
➢ Takes a date input and adds 7 days, 1 month, and 2 years to it.
➢ Then subtracts 3 weeks from the result.
Hint: Use LocalDate.plusDays(), plusMonths(), plusYears(), and
minusWeeks() methods.
*/

import java.time.LocalDate;

public class Problem2 {
    public static void main(String[] args) {
        // Example: input date
        LocalDate inputDate = LocalDate.of(2025, 9, 1);

        // Add 7 days, 1 month, and 2 years
        LocalDate modifiedDate = inputDate.plusDays(7).plusMonths(1).plusYears(2);

        // Subtract 3 weeks
        LocalDate finalDate = modifiedDate.minusWeeks(3);

        System.out.println("Initial date     : " + inputDate);
        System.out.println("After additions  : " + modifiedDate);
        System.out.println("After subtraction: " + finalDate);
    }
}
