import java.util.Scanner;

public class primeTilln {
    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) { 
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(num); i++) { 
            if (num % i == 0) { 
                return false; // If num is divisible by any number other than 1 and itself, it's not prime
            }
        }
        return true; // If no divisors were found, num is prime
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        sc.close(); // Close the scanner

        // Loop through all numbers from 2 to n to check if they are prime
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is Prime"); // Print if the number is prime
            } else {
                System.out.println(i + " is Not Prime"); // Print if the number is not prime
            }
        }
    }
}
