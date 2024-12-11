import java.util.Scanner;

public class DigitFrequency {
    // Method to calculate the frequency of a target digit in a number
    public static int getDigitFrequency(int n, int d) {
        int frequency = 0; // Initialize frequency counter

        // Loop until the number becomes 0
        while (n > 0) {
            int digit = n % 10; // Get the last digit of the number

            // Check if the digit matches the target digit
            if (digit == d) {
                frequency++; // Increment the frequency counter
            }

            n /= 10; // Remove the last digit from the number
        }
        
        return frequency; // Return the frequency of the target digit
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        // Prompt the user to enter the target digit
        System.out.print("Enter Target digit: ");
        int d = sc.nextInt();

        // Calculate the frequency of the target digit in the number
        int frequency = getDigitFrequency(n, d);
        
        // Output the frequency of the target digit
        System.out.println("The frequency of the digit " + d + " in the number " + n + " is: " + frequency);
        
        sc.close(); // Close the scanner
    }
}
