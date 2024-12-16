import java.util.Scanner;

public class digitFrequency {

    // Method to calculate the frequency of digit 'd' in number 'n'
    public static int getDigitFrequency(int n, int d) {
        int frequency = 0; // Initialize frequency counter

        // Loop through each digit of the number
        while (n > 0) {
            int digit = n % 10; // Extract the last digit
            n = n / 10; // Remove the last digit

            // Check if the extracted digit matches the target digit
            if (digit == d) {
                frequency++; // Increment the frequency counter
            }
        }
        return frequency; // Return the calculated frequency
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter the number
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        // Prompt user to enter the digit to count
        System.out.print("Enter the digit to count its frequency: ");
        int d = sc.nextInt();

        // Get the frequency of the digit in the number
        int frequency = getDigitFrequency(n, d);

        // Output the frequency
        System.out.println("The frequency of digit " + d + " in number " + n + " is: " + frequency);

        // Close the scanner
        sc.close();
    }
}
