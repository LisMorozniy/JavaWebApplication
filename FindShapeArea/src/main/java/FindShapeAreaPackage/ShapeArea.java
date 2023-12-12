package FindShapeAreaPackage;

public class ShapeArea {
    public static void main(String[] args) {
        // Parameterized constructor and IoC
        Shape circle = IoCContainer.getCircle();
        Shape rectangle = IoCContainer.getRectangle();
        Shape triangle = IoCContainer.getTriangle();

        // Setter Injection
        circle.setBlogName("NewCircleBlog");
        rectangle.setBlogName("NewRectangleBlog");
        triangle.setBlogName("NewTriangleBlog");

        // Call the appropriate findArea() method
        circle.findArea();
        rectangle.findArea();
        triangle.findArea();
    }
}
