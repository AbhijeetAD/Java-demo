public class Triangle {

    public static void main(String[] args) {
      
        double side1 = Double.parseDouble(args[0]);
        double side2 = Double.parseDouble(args[1]);
        double side3 = Double.parseDouble(args[2]);

       
        double perimeter = side1 + side2 + side3;
        System.out.printf("Perimeter of the triangle: %.2f%n", perimeter);
    }
}
