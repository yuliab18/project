package geomerty;
public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(6,5,1);
        double circleArea = Circle.calculateCircleArea(circle.radius);
        System.out.println("Площа кола: " + circleArea);
        circle.printCircleInfo();


            Rectangle rectangle = new Rectangle(10, 6, "Blue");
        double rectangleArea = Rectangle.calculateRectangleArea(rectangle.length, rectangle.width);
        System.out.println("Площа прямокутника: " + rectangleArea);
        rectangle.printRectangleInfo();

        Triangle  triangle = new Triangle(5, 7, 8);
        triangle.isEquilateral = false;
        double triangleArea = Triangle.calculateTriangleArea(triangle.side1, triangle.side2, triangle.side3);
        System.out.println("Площа трикутника: " + triangleArea);
        triangle.printTriangleInfo();

        }
    }
