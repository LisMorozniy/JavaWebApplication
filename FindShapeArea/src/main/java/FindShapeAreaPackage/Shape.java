package FindShapeAreaPackage;

public abstract class Shape {
    protected String blogName;

    // Parameterized constructor
    public Shape(String blogName) {
        this.blogName = blogName;
    }
    public Shape() {
        this.blogName = null;
    }

    public abstract void findArea();
    public void setBlogName(String blogName) {
        this.blogName = blogName;
    }
}
