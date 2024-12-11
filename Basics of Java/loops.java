public class loops {
    public static void main(String[] args) {
        // For loop: Prints "hello" followed by the current value of i, 15 times
        int n = 15;
        for (int i = 0; i < n; i++) {
            System.out.println("hello" + i); // Prints "hello" and the value of i
        }
        System.out.println("I am out of for loop"); // Indicates the end of the for loop

        // While loop: Prints numbers from 1 to 9
        int i = 1;
        while (i <= 9) {
            System.out.println(i); // Prints the current value of i
            i++; // Increments i by 1
        }
        System.out.println("I am out of while loop"); // Indicates the end of the while loop
    }
}
