import java.util.Scanner;

class Calculator {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Choose an operation:");
        System.out.println("+. Add");
        System.out.println("-. Subtract");
        System.out.println("*. Multiply");
        System.out.println("/. Divide");
        System.out.print("Enter your choice (+,-,/,*): ");
        int choice = scanner.next().charAt(0);
         int result=0;
        switch (choice) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: "+ result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: "+ result);
                break;
            case '/':
                 result = num1 / num2;
                System.out.println("Result: "+ result);
                break;
            default:
                System.out.println("Invalid choice. Please select a number between 1 and 4.");
                break;
        }

   
        
    }
}
