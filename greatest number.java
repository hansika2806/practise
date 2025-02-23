import java.util.Scanner;

public class GreatestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();

        // Determine the greatest number using if, else if, and else
        if (num1 >= num2 && num1 >= num3) {
            System.out.println("The greatest number is: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("The greatest number is: " + num2);
        } else {
            System.out.println("The greatest number is: " + num3);
        }

        // Close the scanner
        scanner.close();
    }
}
