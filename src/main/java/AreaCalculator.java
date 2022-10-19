import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the shape of the area for fencing (Square, Circle, Rectangle): ");
        String shapeOfTheArea = scanner.next();
        switch (shapeOfTheArea){
            case "Square" :
                System.out.print("Enter the side of the square: ");
                double sideOfTheSquare = scanner.nextDouble();
                System.out.println("Area of the Square: " + sideOfTheSquare * sideOfTheSquare );
            break;
            case "Circle" :
                System.out.print("Enter the radius of the Circle: ");
                double radiusOfTheCircle = scanner.nextDouble();
                System.out.println("Area of the Circle: " + 3.14 * radiusOfTheCircle * radiusOfTheCircle );
                break;
            case "Rectangle" :
                System.out.print("Enter the length of the Rectangle: ");
                double lengthOfTheRectangle = scanner.nextDouble();
                System.out.print("Enter the width of the Rectangle: ");
                double widthOfTheRectangle = scanner.nextDouble();
                System.out.println("Area of the Rectangle: " + lengthOfTheRectangle * widthOfTheRectangle );
                break;
            default:
                System.out.println("Invalid Shape");
        }
    }
}
