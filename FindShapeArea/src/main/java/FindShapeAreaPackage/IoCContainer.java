package FindShapeAreaPackage;

public class IoCContainer {
    public static Shape getCircle() {
        return new Circle(5.0, "MyCircleBlog");
    }

    public static Shape getRectangle() {
        return new Rectangle(4.0, 6.0, "MyRectangleBlog");
    }

    public static Shape getTriangle() {
        return new Triangle(3.0, 8.0, "MyTriangleBlog");
    }

}
