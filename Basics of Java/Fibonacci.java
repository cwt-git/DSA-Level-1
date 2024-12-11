import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        sc.close(); // Close the scanner

        // Initialize the first two Fibonacci numbers
        int a = 0, b = 1;

        // Print the first two Fibonacci numbers
        System.out.println(a);
        System.out.println(b);

        // Calculate and print the next Fibonacci numbers up to n
        for (int i = 2; i <= n; i++) {
            int c = a + b; // Calculate the next Fibonacci number
            System.out.println(c); // Print the Fibonacci number

            // Update the values of a and b for the next iteration
            a = b;
            b = c;
        }
    }
}
