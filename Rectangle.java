import java.util.Scanner;
public class RectangleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        RectangleArea areaCalculator = new RectangleArea(length, breadth);
        RectanglePerimeter perimeterCalculator = new RectanglePerimeter(length, breadth);

        double area = areaCalculator.calculateArea();
        double perimeter = perimeterCalculator.calculatePerimeter();

        System.out.printf("Area of the rectangle: %.2f%n", area);
        System.out.printf("Perimeter of the rectangle: %.2f%n", perimeter);

       
    }
}

class RectangleArea {
    private double length;
    private double breadth;

    public RectangleArea(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea() {
        return length * breadth;
    }
}
class RectanglePerimeter {
    private double length;
    private double breadth;

    public RectanglePerimeter(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }
}
