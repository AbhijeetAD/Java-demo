package ThirdDay;
import java.util.Scanner;

public class Attendance {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of classes held: ");
        int classesHeld = scanner.nextInt();
        
        System.out.print("Enter the number of classes attended: ");
        int classesAttended = scanner.nextInt();
        
        double attendancePercentage = (double) classesAttended / classesHeld * 100;
        
        
        System.out.printf("Percentage of classes attended: %.2f%%\n", attendancePercentage);

        if (attendancePercentage < 75) {
            System.out.print("Do you have a medical cause? (Y/N): ");
            char medicalCause = scanner.next().charAt(0);

            if (medicalCause == 'Y' || medicalCause == 'y') {
                System.out.println("You are allowed to sit in the exam due to medical cause.");
            } else {
                System.out.println("You are not allowed to sit in the exam due to insufficient attendance.");
            }
        } else {
            System.out.println("You are allowed to sit in the exam.");
        }

      
    }
}

