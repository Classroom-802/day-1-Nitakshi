class Shape {
    double calculateArea(double side) {
        return side * side; // Square
    }
}

class Rectangle extends Shape {
    double calculateArea(double length, double width) {
        return length * width;
    }
}

class Triangle extends Shape {
    double calculateArea(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }
}

public class ShapeArea {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        
        System.out.println("Area of Square: " + rectangle.calculateArea(4.0));
        System.out.println("Area of Rectangle: " + rectangle.calculateArea(4.0, 5.0));
        System.out.println("Area of Triangle: " + triangle.calculateArea(4.0, 5.0, true));
    }
}
