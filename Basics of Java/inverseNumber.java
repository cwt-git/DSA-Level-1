public class inverseNumber {
    public static void main(String[] args) {
        int i = 1; // Position starts from 1
        int ans = 0; // This will store the inverse number
        int n = 426135; // The original number

        while (n != 0) { // Loop until all digits are processed
            int rem = n % 10; // Get the last digit
            int add = i * (int)Math.pow(10, rem - 1); // Calculate the value to add to the inverse
            ans = ans + add; // Add to the result
            n = n / 10; // Remove the last digit from n
            i++; // Move to the next position
        }

        System.out.println(ans); // Print the inverse number
    }
}
