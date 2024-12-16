import java.util.Scanner;

public class rotateNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user for input number and rotation value
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        System.out.print("Enter rotation number: ");
        int k = sc.nextInt();

        // Calculate the length of the number
        int length = String.valueOf(n).length();

        // Adjust rotation number if it exceeds length
        k = k % length;

        // If k is negative, convert it to the equivalent positive rotation
        if (k < 0) {
            k = k + length;
        }

        // Calculate the rotated part (remainder) and the remaining part
        int rem = n % (int) Math.pow(10, k);
        int dummy = n / (int) Math.pow(10, k);

        // Form the rotated number by combining both parts
        int ans = rem * (int) Math.pow(10, length - k) + dummy;

        // Print the length of the number and the rotated number
        System.out.println("Length of the number: " + length);
        System.out.println("Rotated number: " + ans);
        sc.close();
    }
}
