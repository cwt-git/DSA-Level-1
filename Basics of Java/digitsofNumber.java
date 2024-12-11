import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class digitsofNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        sc.close(); // Close the scanner

        // Create an ArrayList to store the digits of the number
        ArrayList<Integer> digits = new ArrayList<>();

        // Extract digits from the number and add to the list
        while (number != 0) {
            int digit = number % 10; // Get the last digit of the number
            digits.add(digit);       // Add the digit to the list
            number = number / 10;    // Remove the last digit from the number
        }

        // Reverse the list to display digits in the correct order
        Collections.reverse(digits);

        // Print each digit from the list
        for (int digit : digits) {
            System.out.println(digit);
        }
    }
}
