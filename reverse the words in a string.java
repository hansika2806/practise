import java.util.Scanner;

public class ReverseWordsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Split the string into words
        String[] words = inputString.split(" ");

        // Reverse the order of words
        StringBuilder reversedString = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedString.append(words[i]);
            if (i != 0) {
                reversedString.append(" "); // Add a space between words
            }
        }

        // Print the reversed string
        System.out.println("Reversed string: " + reversedString.toString());

        // Close the scanner
        scanner.close();
    }
}
