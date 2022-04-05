package shapes;

public class Square extends Quadrilateral implements Measurable {
    public Square(int side) {
        super(side, side);
    }

    public double getArea(){
        int side = (int) length;
        return side * side;
    }

    @Override
    public double setPerimeter(double l, double w) {
        return 0;
    }

    @Override
    public double setArea(double l, double w) {
        return 0;
    }

    public double getPerimeter(){
        int side = (int) length;
        return 4 * side;
    }
}
