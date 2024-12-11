

import java.util.Scanner;

public class GCD_LCM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();

        int on1 = n1;
        int on2 = n2;
        while (n1 % n2 != 0) {
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }
        int GCD = n2;
        int LCM = (on1 * on2) / GCD;

        System.out.println("GCD = " + GCD);
        System.out.println("LCM = " + LCM);
        sc.close();
    }
}
