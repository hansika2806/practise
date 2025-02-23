public class Comparator {

    // Method to compare two integers
    public void compare(int a, int b) {
        if (a > b) {
            System.out.println("Greater integer: " + a);
        } else if (b > a) {
            System.out.println("Greater integer: " + b);
        } else {
            System.out.println("Both integers are equal: " + a);
        }
    }

    // Method to compare two characters
    public void compare(char a, char b) {
        if (a > b) {
            System.out.println("Greater character: " + a);
        } else if (b > a) {
            System.out.println("Greater character: " + b);
        } else {
            System.out.println("Both characters are equal: " + a);
        }
    }

    // Method to compare two strings
    public void compare(String a, String b) {
        int result = a.compareTo(b);
        if (result > 0) {
            System.out.println("Greater string: " + a);
        } else if (result < 0) {
            System.out.println("Greater string: " + b);
        } else {
            System.out.println("Both strings are equal: " + a);
        }
    }

    public static void main(String[] args) {
        Comparator comparator = new Comparator();

        // Comparing integers
        System.out.println("Comparing integers:");
        comparator.compare(10, 20);
        comparator.compare(30, 30);

        // Comparing characters
        System.out.println("\nComparing characters:");
        comparator.compare('a', 'b');
        comparator.compare('z', 'z');

        // Comparing strings
        System.out.println("\nComparing strings:");
        comparator.compare("apple", "banana");
        comparator.compare("grape", "grape");
    }
}

Explanation of the Code:
Class Definition: The Comparator class contains three overloaded compare() methods.

Method Overloading:

compare(int a, int b): Compares two integers and prints the greater one or indicates if they are equal.
compare(char a, char b): Compares two characters and prints the greater one or indicates if they are equal.
compare(String a, String b): Compares two strings using the compareTo() method. It prints the greater string or indicates if they are equal.
Main Method: The main method creates an instance of the Comparator class and calls each overloaded compare() method with different types of arguments (integers, characters, and strings).
