import java.util.Scanner;

public class BenjaminBulbs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter the number of bulbs
        System.out.print("Enter Number of Bulbs: ");
        int n1 = sc.nextInt();

        // Iterate to find and print the squares of integers up to n1
        for (int i = 1; i * i <= n1; i++) {
            System.out.println(i * i); // Print the square of the current integer i
        }

        sc.close(); // Close the scanner
    }
}
