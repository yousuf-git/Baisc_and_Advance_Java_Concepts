// This class shows how to work with dates and times in Java using the java.time package.

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class DateAndTimeOperations {
    public static void main(String[] args) {
        
        // Basic Date/Time Representations
        LocalDate date = LocalDate.now(); // Current Date
        LocalTime time = LocalTime.now(); // Current Time
        LocalDateTime dateTime = LocalDateTime.now(); // Current Date and Time

        System.out.println("Current Date: " + date); // yyyy-MM-dd
        System.out.println("Current Time: " + time); // HH:mm:ss.SSS (includes milliseconds)
        System.out.println("Current Date and Time: " + dateTime); // yyyy-MM-ddTHH:mm:ss
        
        // Custom Date/Time Formats
        DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("Formatted Date and Time: " + dateTime.format(customFormatter)); // output: 01-11-2024 15:11:23
        
        // Different Date/Time Formats
        System.out.println("ISO Date: " + date.format(DateTimeFormatter.ISO_DATE)); // yyyy-MM-dd
        System.out.println("ISO Time: " + time.format(DateTimeFormatter.ISO_TIME)); // HH:mm:ss
        System.out.println("ISO DateTime: " + dateTime.format(DateTimeFormatter.ISO_DATE_TIME)); // yyyy-MM-ddTHH:mm:ss
        
        // Parsing Dates and Times
        LocalDate parsedDate = LocalDate.parse("2023-10-11", DateTimeFormatter.ISO_DATE); // yyyy-MM-dd
        System.out.println("Parsed Date (ISO format): " + parsedDate); // 2023-10-11
        
        // Date Calculations
        LocalDate tomorrow = date.plusDays(1);
        System.out.println("Tomorrow's Date: " + tomorrow);
        
        LocalDate nextWeek = date.plusWeeks(1);
        System.out.println("Date Next Week: " + nextWeek);
        
        // Time Calculations
        LocalTime oneHourLater = time.plusHours(1);
        System.out.println("One Hour Later: " + oneHourLater);

        // Date Comparisons
        LocalDate pastDate = LocalDate.of(2000, Month.JANUARY, 1);
        boolean isAfter = date.isAfter(pastDate);
        boolean isBefore = date.isBefore(tomorrow);
        
        System.out.println("Is Today After 01-01-2000? " + isAfter);
        System.out.println("Is Today Before Tomorrow? " + isBefore);
        
        // Time Differences
        long daysBetween = ChronoUnit.DAYS.between(pastDate, date); // Days between two dates
        System.out.println("Days Between 01-01-2000 and Today: " + daysBetween);
        
        // Zoned Date/Time
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("New York Date and Time: " + zonedDateTime);
        
        // DateTimeFormatter for Different Locales
        DateTimeFormatter frenchFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.FRENCH);
        System.out.println("Date in French Format: " + parsedDate.format(frenchFormatter)); // 11 octobre 2023
    }
}
