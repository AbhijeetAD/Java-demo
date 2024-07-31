package ThirdDay;
import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        int sum = 0;
        int count = 10; 

        
        for (int i = 0; i < count; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            int number = scanner.nextInt();
            sum= sum+number; 
        }
        System.out.println("Addition is:"+sum);
       
        double average = (double) sum / count;

        
        System.out.printf("The average value is: %.2f\n", average);

       
    }
}
