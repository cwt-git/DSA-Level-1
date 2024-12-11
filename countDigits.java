import java.util.Scanner;

public class countDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        // Initialize a counter to count the digits
        int digits = 0;
        
        // Loop until the number becomes 0
        while (number != 0) {
            number /= 10; // Remove the last digit of the number
            digits++; // Increment the digit count
        }
        
        // Output the total number of digits in the entered number
        System.out.println("The number of digits is: " + digits);
        
        sc.close(); // Close the scanner
    }
}
