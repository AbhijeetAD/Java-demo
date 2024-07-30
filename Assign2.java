class Calculator {

    public static int add(int a, int b) {
        return a + b;
    }
    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
public class Assign2 {
    
    public static void main(String[] args) {
 
        int num1 = 10;
        int num2 = 5;
        
       
        int sum = Calculator.add(num1, num2);
        System.out.println("Sum: " + sum);
        
        
        int sub = Calculator.subtract(num1, num2);
        System.out.println("Sub " + sub);
        
        
        int mul = Calculator.multiply(num1, num2);
        System.out.println("Multiplivstion: " + mul);
        
        
       
            int div = Calculator.divide(num1, num2);
            System.out.println("Dividion: " + div);
        
        
}

}

