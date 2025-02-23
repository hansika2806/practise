import java.util.Scanner;

public class ArrayCopyExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create the source array with the specified size
        int[] sourceArray = new int[size];

        // Prompt the user to enter the elements of the array
        System.out.println("Enter " + size + " elements for the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            sourceArray[i] = scanner.nextInt();
        }

        // Create a destination array with the same length as the source array
        int[] destinationArray = new int[sourceArray.length];

        // Copy the contents of the source array to the destination array
        for (int i = 0; i < sourceArray.length; i++) {
            destinationArray[i] = sourceArray[i];
        }

        // Print the contents of the destination array to verify the copy
        System.out.println("Contents of the destination array:");
        for (int i = 0; i < destinationArray.length; i++) {
            System.out.print(destinationArray[i] + " ");
        }

        // Close the scanner
        scanner.close();
    }
}
