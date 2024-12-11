import java.util.Scanner;

public class input {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String name = sc.nextLine();

        System.out.println("Dear, " + name + ". Hear is your age " + n);
    }
}