interface Shape {
    double getArea();
    String getColor();

    default String getDescription() {
        return "This is a shape with area: " + getArea() + " and color: " + getColor();
    }
}


class Rectangle implements Shape {
    private double length;
    private double width;
    private String color;

    public Rectangle(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    public double getArea() {
        return length * width;
    }

    public String getColor() {
        return color;
    }

    public String getDescription() {
        return "This is a rectangle with length: " + length + ", width: " + width + ", area: " + getArea() + ", and color: " + color;
    }
}


class Circle implements Shape {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public String getColor() {
        return color;
    }

    public String getDescription() {
        return "This is a circle with radius: " + radius + ", area: " + getArea() + ", and color: " + color;
    }
}


class Sign {
    private Shape shape;
    private String text;

    public Sign(Shape shape, String text) {
        this.shape = shape;
        this.text = text;
    }

    public void displaySign() {
        System.out.println(shape.getDescription());
        System.out.println("Sign text: " + text);
    }
}


public class Pr23{
    public static void main(String[] args) {

        Shape circle = new Circle(3, "Red");

        Shape rectangle = new Rectangle(4, 6, "Blue");

        Sign circleSign = new Sign(circle, "Welcome to the Circle Zone");
        Sign rectangleSign = new Sign(rectangle, "Rectangle Area");

        circleSign.displaySign();
        System.out.println();
        rectangleSign.displaySign();
    }
}
