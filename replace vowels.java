import java.util.Scanner;

public class ReplaceVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Replace vowels with '$'
        String modifiedString = inputString.replaceAll("[aeiouAEIOU]", "$");

        // Print the modified string
        System.out.println("Modified string: " + modifiedString);

        // Close the scanner
        scanner.close();
    }
}
