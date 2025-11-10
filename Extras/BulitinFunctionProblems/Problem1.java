/*Problem 1: Time Zones and ZonedDateTime Write a program that displays the current
time in different time zones:
➢ GMT (Greenwich Mean Time)
➢ IST (Indian Standard Time)
➢ PST (Pacific Standard Time)
Hint: Use ZonedDateTime and ZoneId to work with different time zones.
*/

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class   Problem1 {
    public static void main(String[] args) {
        // Get current time in UTC
        ZonedDateTime utcNow = ZonedDateTime.now(ZoneId.of("UTC"));

        // Define the zones
        ZoneId gmtZone = ZoneId.of("GMT");
        ZoneId istZone = ZoneId.of("Asia/Kolkata");
        ZoneId pstZone = ZoneId.of("America/Los_Angeles");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");

        // Display the current time in all zones
        System.out.println("GMT: " + utcNow.withZoneSameInstant(gmtZone).format(formatter));
        System.out.println("IST: " + utcNow.withZoneSameInstant(istZone).format(formatter));
        System.out.println("PST: " + utcNow.withZoneSameInstant(pstZone).format(formatter));
    }
}
