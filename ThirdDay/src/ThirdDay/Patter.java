package ThirdDay;




public class Patter {
    public static void main(String[] args) {
        int rows = 4;

        
        for (int i = 1; i <= rows; i++) {
            // Inner loop to print stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line after printing all stars in the current row
            System.out.println();
        }
    }
}
