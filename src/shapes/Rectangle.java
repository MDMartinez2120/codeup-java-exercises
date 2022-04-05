package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double setPerimeter(double l, double w) {
        return 0;
    }

    @Override
    public double setArea(double l, double w) {
        return 0;
    }
//    protected int length;
//    protected int width;

//    public Rectangle(int i, int i1) {
//    }

    //    public Rectangle(int length, int width){
//        Rectangle.width = width;
//        Rectangle.length = length;
//    }
//
//    public int getArea(){
//        return length * width;
//    }
//
//    public int getPerimeter(){
//        return 2 * length + 2 * width;
//    }

}
