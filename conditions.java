public class conditions {
    public static void main(String[] args) {
        // Initializing variable x with the value 12
        int x = 12;

        // Check if x is an even number
        if (x % 2 == 0) {
            System.out.println("True"); // Print "True" if x is even
        } else {
            System.out.println("False"); // Print "False" if x is odd
        }

        // This statement always executes
        System.out.println("This will print always");

        // New section to compare two integers n1 and n2
        int n1 = 12;
        int n2 = 13;

        // Compare n1 and n2 and print appropriate message
        if (n1 == n2) {
            System.out.println("Equal"); // Print "Equal" if n1 and n2 are the same
        } else if (n1 < n2) {
            System.out.println("n1 < n2"); // Print "n1 < n2" if n1 is less than n2
        } else {
            System.out.println("n2 < n1"); // Print "n2 < n1" if n2 is less than n1
        }
    }
}
