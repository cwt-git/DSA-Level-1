import java.util.Scanner;

public class d_pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int number = scanner.nextInt();

        // Loop through each row
        for (int row = 0; row <= number; row++) {
            // Print leading spaces
            for (int space = number; space >= number - row + 1; space--) {
                System.out.print(" ");
            }
            // Print stars
            for (int star = 1; star <= number - row; star++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
        
        // Close the scanner outside of the loop
        scanner.close();
    }
}

