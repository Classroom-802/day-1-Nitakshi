class AreaCalculator {
    // Calculate area of a circle
    double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Calculate area of a rectangle
    double calculateArea(double length, double width) {
        return length * width;
    }

    // Calculate area of a triangle
    double calculateArea(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        AreaCalculator ac = new AreaCalculator();

        System.out.println("Area of Circle: " + ac.calculateArea(5.0));
        System.out.println("Area of Rectangle: " + ac.calculateArea(5.0, 3.0));
        System.out.println("Area of Triangle: " + ac.calculateArea(5.0, 4.0, true));
    }
}
