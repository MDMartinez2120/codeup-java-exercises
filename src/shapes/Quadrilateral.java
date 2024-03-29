package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected  double width;

    @Override
    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public abstract double setPerimeter(double l, double w);
    public abstract double setArea(double l, double w);
}
