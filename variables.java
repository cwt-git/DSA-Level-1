import java.util.Scanner;

public class variables {
    public static void main(String[] args) {
        // Format: data_type variable_name = value;
        int x = 15; // Declare an integer variable x and assign the value 15
        int y = 20; // Declare an integer variable y and assign the value 20

        // Addition
        int sum = x + y; // Sum of x and y
        System.out.println(sum); // Print the sum
        System.out.println("sum"); // Print the string "sum"
        // Generally, we write as:
        System.out.println("Sum of x and y is " + sum); // Print the sum with a descriptive message

        // Multiplication
        int prd = x * y; // Product of x and y
        System.out.println("Product of x and y is " + prd); // Print the product with a descriptive message

        // Division
        int a = x / y; // Quotient of x divided by y
        int b = y / x; // Quotient of y divided by x

        // Modulo (Remainder)
        int c = x % y; // Remainder of x divided by y
        int d = y % x; // Remainder of y divided by x

        // Note: In Java, no BODMAS rules apply directly to integer division and modulo operations
        System.out.println(a + " " + b + " " + c + " " + d); // Print the results of division and modulo operations
    }
}
