import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeApp {
  public static void main(String[] args) {
    // Get the current date and time
    LocalDateTime now = LocalDateTime.now();

    // Define the date and time format
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    // Format the date and time using the defined format
    String formattedDateTime = now.format(formatter);

    // Display the formatted date and time
    System.out.println("Current date and time: " + formattedDateTime);
  }
}

