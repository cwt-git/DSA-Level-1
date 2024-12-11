import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the student's marks
        System.out.print("Enter the student's marks: ");
        int marks = scanner.nextInt();

        // Check the range of marks and print the appropriate message
        if (marks > 90) {
            System.out.println("Excellent"); // Marks above 90
        } else if (marks > 80) {
            System.out.println("Good"); // Marks between 81 and 90
        } else if (marks > 70) {
            System.out.println("Fair"); // Marks between 71 and 80
        } else if (marks > 60) {
            System.out.println("Meets Expectations"); // Marks between 61 and 70
        } else {
            System.out.println("Below Par"); // Marks 60 or below
        }

        scanner.close(); // Close the scanner
    }
}
