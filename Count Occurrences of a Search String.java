import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the text string
        System.out.print("Enter the text string: ");
        String textString = scanner.nextLine();

        // Prompt the user to enter the search string
        System.out.print("Enter the search string: ");
        String searchString = scanner.nextLine();

        // Count occurrences of the search string in the text string
        int count = countOccurrences(textString, searchString);

        // Print the result
        System.out.println("The search string '" + searchString + "' occurs " + count + " time(s) in the text string.");

        // Close the scanner
        scanner.close();
    }

    // Method to count occurrences of a substring in a string
    public static int countOccurrences(String text, String search) {
        int count = 0;
        int index = 0;

        // Loop to find occurrences of the search string
        while ((index = text.indexOf(search, index)) != -1) {
            count++;
            index += search.length(); // Move index forward to avoid counting the same occurrence
        }

        return count;
    }
}
