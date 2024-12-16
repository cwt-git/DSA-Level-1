import java.util.Scanner;

public class e_pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int number = scanner.nextInt();

        int sp = number/2;
        int st = 1;
        for (int i = 0; i <= number/2; i++) {
            System.out.println(sp + ",");
        }

        // Close the scanner outside of the loop
        scanner.close();
    }
}
