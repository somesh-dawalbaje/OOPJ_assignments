import java.util.*;
import java.text.*;

public class DateTimeConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user input for date components
        System.out.println("Enter year:");
        int year = scanner.nextInt();
        
        System.out.println("Enter month (1-12):");
        int month = scanner.nextInt();
        
        System.out.println("Enter day of month:");
        int day = scanner.nextInt();
        
        // Get user input for time components
        System.out.println("Enter hour (0-23):");
        int hour = scanner.nextInt();
        
        System.out.println("Enter minute (0-59):");
        int minute = scanner.nextInt();
        
        System.out.println("Enter second (0-59):");
        int second = scanner.nextInt();
        
        // Create a Calendar instance and set date and time
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day, hour, minute, second); // Note: month is 0-based
        
        // Get the Date object from Calendar
        Date date = calendar.getTime();
        
        // Format the Date object using SimpleDateFormat
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = dateFormat.format(date);
        
        // Print the formatted date
        System.out.println("Formatted Date: " + formattedDate);
        
        // Close the scanner
        scanner.close();
    }
}