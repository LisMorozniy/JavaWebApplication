package FindShapeAreaPackage;

public class Circle extends Shape {
    private double radius;

    // Parameterized constructor with blogName
    public Circle(double radius, String blogName) {
        super(blogName);
        this.radius = radius;
    }

    @Override
    public void findArea() {
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Area of Circle (" + blogName + "): " + area);
    }
}
