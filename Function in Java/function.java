import java.util.*;

public class function {

    // Method to calculate the factorial of a number
    public static int fact(int x) {
        int factorial = 1;
        for (int i = 1; i <= x; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for values of n and r
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        System.out.print("Enter the value of r: ");
        int r = scanner.nextInt();

        // Calculate factorials
        int nFactorial = fact(n);
        int rFactorial = fact(n - r);

        // Calculate nPr
        int nPr = nFactorial / rFactorial;

        // Output the result
        System.out.println("nPr (n! / (n-r)!): " + nPr);

        // Close the scanner
        scanner.close();
    }
}
