import java.util.Scanner;

public class PythagoreanTriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.print("Enter three numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        sc.close(); // Close the scanner

        // Determine the maximum value among the three numbers
        int max = n1;
        if (n2 >= max) {
            max = n2;
        }
        if (n3 >= max) {
            max = n3;
        }

        // Check if the numbers form a Pythagorean triplet
        if (max == n1) {
            boolean flag = ((n2 * n2) + (n3 * n3) == (n1 * n1));
            System.out.println(flag); // Print the result
        } else if (max == n2) {
            boolean flag = ((n1 * n1) + (n3 * n3) == (n2 * n2));
            System.out.println(flag); // Print the result
        } else {
            boolean flag = ((n1 * n1) + (n2 * n2) == (n3 * n3));
            System.out.println(flag); // Print the result
        }
    }
}
