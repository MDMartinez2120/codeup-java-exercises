package shapes;

public class Rectangle {
    protected static int length;
    protected static int width;

    public Rectangle(int length, int width){
        Rectangle.width = width;
        Rectangle.length = length;
    }

    public int getArea(){
        return length * width;
    }

    public int getPerimeter(){
        return 2 * length + 2 * width;
    }

}
