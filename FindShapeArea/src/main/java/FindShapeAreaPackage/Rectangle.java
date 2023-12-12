package FindShapeAreaPackage;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width, String blogName) {
        super(blogName);
        this.length = length;
        this.width = width;
    }

    @Override
    public void findArea() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}