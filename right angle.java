import java.util.Scanner;

public class RightAngleTrianglePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of rows
        System.out.print("Input number of rows: ");
        int rows = scanner.nextInt();

        // Loop to print the triangle pattern
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " "); // Print numbers from 1 to i
            }
            System.out.println(); // Move to the next line after each row
        }

        // Close the scanner
        scanner.close();
    }
}
