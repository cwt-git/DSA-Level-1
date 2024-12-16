import java.util.Scanner;

public class reverseNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        while (n!=0) {
            int rem = n%10;
            System.out.println(rem);
            n = n/10;

        }
        sc.close();
    }
}