

import java.util.Scanner;

public class countDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int digits = 0;

        while (number != 0) {
            number /= 10;
            digits++;
        }
        System.out.println("The number of digits is: " + digits);
        sc.close();
    }
}
