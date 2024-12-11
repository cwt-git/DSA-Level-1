import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        sc.close(); // Close the scanner

        // Check for numbers less than or equal to 1, which are not prime
        if (n <= 1) {
            System.out.println(n + " is not a prime number.");
            return; // Exit the program early
        }

        boolean isPrime = true; // Assume the number is prime

        // Loop to check divisibility from 2 up to the square root of n
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false; // If n is divisible by i, it's not prime
                break; // Exit the loop early
            }
        }

        // Output the result
        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}
