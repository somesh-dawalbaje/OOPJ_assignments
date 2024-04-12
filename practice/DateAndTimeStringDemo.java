import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Scanner;

public class DateTimeConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a date
        System.out.print("Enter a date (e.g., yyyy-MM-dd HH:mm:ss): ");
        String inputDate = scanner.nextLine();
        
        // Define input and output date formats
        String inputFormat = "yyyy-MM-dd HH:mm:ss"; // Example input format
        String outputFormat = "EEE, MMM dd, yyyy 'at' HH:mm:ss"; // Example output format
        
        // Perform date conversion
        try {
            SimpleDateFormat inputFormatter = new SimpleDateFormat(inputFormat);
            Date date = inputFormatter.parse(inputDate);
            
            SimpleDateFormat outputFormatter = new SimpleDateFormat(outputFormat);
            String formattedDate = outputFormatter.format(date);
            
            System.out.println("Converted date: " + formattedDate);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please enter date in format: " + inputFormat);
        }
        
        scanner.close();
    }
}