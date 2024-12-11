public class conditions {
    public static void main(String[] args) {
        int x = 12;
        if (x % 2 == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        System.out.println("This will print always");

        // new Section
        int n1 = 12;
        int n2 = 13;

        if (n1 == n2) {
            System.out.println("Equal");
        } else if (n1 < n2) {
            System.out.println("n1<n2");
        } else {
            System.out.println("n2<n1");
        }
    }
}
