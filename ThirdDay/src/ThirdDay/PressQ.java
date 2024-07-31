package ThirdDay;

import java.util.Scanner;

public class PressQ{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int product = 1;
        int count = 0;

        while (true) {
            System.out.print("Enter an integer (or press 'q' to quit): ");
            String input = scanner.nextLine();
            
            if (input.equalsIgnoreCase("q")) {
                break;
            }

                int number = Integer.parseInt(input);
                
                sum += number;
                product *= number;
                count++;
            } 
            System.out.println("Invalid input. Please enter an integer or 'q' to quit.");
            


        if (count > 0) {
            double average = (double) sum / count;
            System.out.printf("Average of the entered numbers: %.2f\n", average);
            System.out.println("Product of the entered numbers: " + product);
        } else {
            System.out.println("No numbers were entered.");
        }
System.out.println("Addition of number:"+sum);
        }
}
