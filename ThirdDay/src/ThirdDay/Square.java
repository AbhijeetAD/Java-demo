package ThirdDay;

import java.util.Scanner;



public class Square {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for length and breadth
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        // Check if the length and breadth are equal
        if (length == breadth) {
            System.out.println("The rectangle is a square.");
        } else {
            System.out.println("The rectangle is not a square.");
        }

       
    }
}

