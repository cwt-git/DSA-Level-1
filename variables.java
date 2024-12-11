// What are variables and operators of Mathematics in java
public class variables {
    public static void main(String[] args) {
        // Format - data_type variable_name = data;
        int x = 15;
        int y = 20;
        int sum = x + y;
        System.out.println(sum);
        System.out.println("sum");
        // Both above line print different answer
        // Gernally we write as
        System.out.println("Sum of x and y is " + sum);

        // Lets do product
        int prd = x * y;
        System.out.println("Product of x and y is " + prd);

        // Division
        int a = x / y; // This will give Quotient
        int b = y / x; // This will give Quotient

        int c = x % y; // This will give Remainder
        int d = y % x; // This will give Remainder

        // in Java -------- No BODMAS ----------------
        System.out.println(a + " " + b + " " + c + " " + d);
    }
}
