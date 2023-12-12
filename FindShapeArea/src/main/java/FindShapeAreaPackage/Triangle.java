package FindShapeAreaPackage;

public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height, String blogName) {
        super(blogName);
        this.base = base;
        this.height = height;
    }

    @Override
    public void findArea() {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }
}