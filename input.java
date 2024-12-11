import java.util.Scanner;

public class input {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read an integer value from the user input
        int n = Integer.parseInt(sc.nextLine());

        // Read a string (name) from the user input
        String name = sc.nextLine();

        // Print a personalized message with the name and age
        System.out.println("Dear, " + name + ". Here is your age " + n);

        sc.close(); // Close the scanner
    }
}
