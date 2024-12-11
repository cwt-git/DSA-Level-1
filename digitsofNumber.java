
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class digitsofNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        sc.close();

        ArrayList<Integer> digits = new ArrayList<>();

        while (number != 0) {
            int digit = number % 10;
            digits.add(digit);
            number = number / 10;
        }

        Collections.reverse(digits);

        for (int digit : digits) {
            System.out.println(digit);
        }
    }
}
