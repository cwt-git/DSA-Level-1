import java.util.Scanner;

public class c_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        // Loop through each row
        for (int i = 1; i <= n; i++) {
            // Print leading underscores
            for (int p = 1; p <= n - i; p++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
            sc.close();
        }
    }
}
