import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create the array with the specified size
        int[] array = new int[size];

        // Prompt the user to enter the elements of the array
        System.out.println("Enter " + size + " elements for the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Reverse the array in place
        for (int i = 0; i < size / 2; i++) {
            // Swap elements
            int temp = array[i];
            array[i] = array[size - 1 - i];
            array[size - 1 - i] = temp;
        }

        // Print the reversed array
        System.out.println("Reversed array:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        // Close the scanner
        scanner.close();
    }
}
