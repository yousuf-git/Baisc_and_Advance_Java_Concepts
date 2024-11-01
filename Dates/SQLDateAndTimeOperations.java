import java.sql.Timestamp;
import java.sql.Date;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SQLDateAndTimeOperations {
    public static void main(String[] args) {
        
        // Current Date/Time Representations for SQL Storage
        Date sqlDate = Date.valueOf(LocalDate.now()); // SQL Date
        Time sqlTime = Time.valueOf(LocalTime.now()); // SQL Time
        Timestamp sqlTimestamp = Timestamp.valueOf(LocalDateTime.now()); // SQL Timestamp

        System.out.println("SQL Date: " + sqlDate); // yyyy-MM-dd
        System.out.println("SQL Time: " + sqlTime); // HH:mm:ss
        System.out.println("SQL Timestamp: " + sqlTimestamp); // yyyy-MM-dd HH:mm:ss.SSS
        
        // Formatting for SQL Dates and Times
        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat timeFormatter = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat timestampFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // Output: 2023-10-11 12:00:00

        System.out.println("Formatted SQL Date: " + dateFormatter.format(sqlDate)); // format returns a string
        System.out.println("Formatted SQL Time: " + timeFormatter.format(sqlTime));
        System.out.println("Formatted SQL Timestamp: " + timestampFormatter.format(sqlTimestamp));
        
        // Parsing Date Strings into SQL Dates and Timestamps
        Date parsedSqlDate = Date.valueOf("2023-10-11"); // String to java.sql.Date
        // Other Possible Formats: 
        /* 
         * - "2023-10-11" (yyyy-MM-dd)  ; Note yyyy-dd-MM or dd-MM-yyyy will throw an exception
         * - "2023-10-11 12:00:00" (yyyy-MM-dd HH:mm:ss)
         * - "2023-10-11 12:00:00.000" (yyyy-MM-dd HH:mm:ss.SSS)
         * - "2023-10-11 12:00:00.000000000" (yyyy-MM-dd HH:mm:ss.SSSSSSSSS)
         * - "2023-10-11 12:00:00.000000000+00:00" (yyyy-MM-dd HH:mm:ss.SSSSSSSSS+00:00)
         * - "2023-10-11 12:00:00.000000000+00:00[UTC]" (yyyy-MM-dd HH:mm:ss.SSSSSSSSS+00:00[UTC])
         * - "2023-10-11 12:00:00.000000000+00:00[UTC][GMT]" (yyyy-MM-dd HH:mm:ss.SSSSSSSSS+00:00[UTC][GMT])
        */
        
        System.out.println("Parsed SQL Date: " + parsedSqlDate);

        // Timestamp Calculations
        // First, convert SQL Timestamp to LocalDateTime then add an hour then convert back to SQL Timestamp
        Timestamp oneHourLater = Timestamp.valueOf(sqlTimestamp.toLocalDateTime().plusHours(1));
        System.out.println("One Hour Later (SQL Timestamp): " + oneHourLater);
        System.out.println("One Hour Later (Formatted SQL Timestamp): " + timestampFormatter.format(oneHourLater));
        
        // SQL Date Comparison
        Date anotherDate = Date.valueOf("2023-01-11"); // yyyy-MM-dd
        boolean isAfter = sqlDate.after(anotherDate);
        boolean isBefore = sqlDate.before(anotherDate);

        System.out.println("Is SQL Date After 2023-01-01? " + isAfter);
        System.out.println("Is SQL Date Before 2023-01-01? " + isBefore);
        
        // SQL Time Arithmetic
        // First, convert SQL Time to LocalTime then add a minute then convert back to SQL Time
        LocalTime time = sqlTime.toLocalTime();
        Time oneMinuteLater = Time.valueOf(time.plusMinutes(1));
        System.out.println("One Minute Later (SQL Time): " + oneMinuteLater);
    }
}
