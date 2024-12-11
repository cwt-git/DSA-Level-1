import java.util.Scanner;

public class GCD_LCM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();

        // Store original values of n1 and n2
        int on1 = n1;
        int on2 = n2;

        // Use the Euclidean algorithm to find the GCD
        while (n1 % n2 != 0) {
            int rem = n1 % n2; // Get the remainder
            n1 = n2;          // Update n1 to the current value of n2
            n2 = rem;         // Update n2 to the remainder
        }
        int GCD = n2; // The last non-zero remainder is the GCD

        // Calculate the LCM using the formula: (n1 * n2) / GCD
        int LCM = (on1 * on2) / GCD;

        // Output the GCD and LCM
        System.out.println("GCD = " + GCD);
        System.out.println("LCM = " + LCM);

        sc.close(); // Close the scanner
    }
}
