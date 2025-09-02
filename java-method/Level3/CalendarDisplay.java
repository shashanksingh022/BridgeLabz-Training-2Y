import java.util.*;

public class CalendarDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        String[] months = {"","January","February","March","April","May","June","July","August","September","October","November","December"};
        int[] days = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        if ((year%400==0)||(year%4==0 && year%100!=0)) days[2]=29;

        Calendar cal = new GregorianCalendar(year, month-1, 1);
        int firstDay = cal.get(Calendar.DAY_OF_WEEK);

        System.out.println("\n   " + months[month] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for (int i=1; i<firstDay; i++) System.out.print("    ");
        for (int d=1; d<=days[month]; d++) {
            System.out.printf("%3d ", d);
            if ((d+firstDay-1)%7==0) System.out.println();
        }
        sc.close();
    }
}
