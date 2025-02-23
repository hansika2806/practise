import java.util.Arrays;
import java.util.Scanner;

public class IntegerArrayToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create the integer array with the specified size
        int[] intArray = new int[size];

        // Prompt the user to enter the elements of the array
        System.out.println("Enter " + size + " elements for the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            intArray[i] = scanner.nextInt();
        }

        // Method 1: Using Arrays.toString()
        String arrayAsString1 = Arrays.toString(intArray);
        System.out.println("Array as String using Arrays.toString(): " + arrayAsString1);

        // Method 2: Using StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < intArray.length; i++) {
            stringBuilder.append(intArray[i]);
            if (i < intArray.length - 1) {
                stringBuilder.append(", "); // Add a comma and space between elements
            }
        }
        String arrayAsString2 = stringBuilder.toString();
        System.out.println("Array as String using StringBuilder: " + arrayAsString2);

        // Close the scanner
        scanner.close();
    }
}
