
import java.util.Scanner;

public class primeTilln {
    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        sc.close();

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is Prime");
            } else {
                System.out.println(i + " is Not Prime");
            }
        }
    }

}
