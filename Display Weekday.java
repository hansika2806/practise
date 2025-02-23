import java.util.Random;
import java.util.Scanner;

public class WeekdayGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Prompt the user to enter a number between 1 and 7
        System.out.print("Enter a number between 1 and 7: ");
        int userInput = scanner.nextInt();

        // Generate a random integer between 1 and 7
        int randomNumber = random.nextInt(7) + 1; // Generates a number between 1 and 7

        // Display the random number
        System.out.println("Generated number: " + randomNumber);

        // Determine the name of the weekday based on the random number
        String weekday;
        switch (randomNumber) {
            case 1:
                weekday = "Monday";
                break;
            case 2:
                weekday = "Tuesday";
                break;
            case 3:
                weekday = "Wednesday";
                break;
            case 4:
                weekday = "Thursday";
                break;
            case 5:
                weekday = "Friday";
                break;
            case 6:
                weekday = "Saturday";
                break;
            case 7:
                weekday = "Sunday";
                break;
            default:
                weekday = "Invalid number"; // This case should never occur
                break;
        }

        // Display the name of the weekday
        System.out.println("The corresponding weekday is: " + weekday);

        // Close the scanner
        scanner.close();
    }
}
