import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize variables to store the sum and average
        double sum = 0;
        double average;

        // Prompt the user to input 5 numbers
        System.out.println("Enter 5 numbers:");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Number " + i + ": ");
            double number = scanner.nextDouble();
            sum += number; // Add the number to the sum
        }

        // Calculate the average
        average = sum / 5;

        // Display the sum and average
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        // Close the scanner
        scanner.close();
    }
}
