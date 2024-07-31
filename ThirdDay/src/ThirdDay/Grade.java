package ThirdDay;
import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for marks
        System.out.print("Enter the marks: ");
        double marks = scanner.nextDouble();

        // Determine the grade based on the marks
        String grade;
        if (marks < 25) {
            grade = "F";
        } else if (marks >= 25 && marks < 45) {
            grade = "E";
        } else if (marks >= 45 && marks < 50) {
            grade = "D";
        } else if (marks >= 50 && marks < 60) {
            grade = "C";
        } else if (marks >= 60 && marks < 80) {
            grade = "B";
        } else if (marks >= 80) {
            grade = "A";
        } else {
            grade = "Invalid marks";
        }

        // Print the grade
        System.out.println("The grade is: " + grade);

        // Close the scanner
        scanner.close();
    }
}
