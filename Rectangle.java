public class Rectangle {
    private double width;
    private double height;
    public Rectangle () {
        super();
    }

    public Rectangle (double width,double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String toString() {
        return "Rectangle[" + this.width + "," + this.height + "]";
    }
}
