package shapes;

public class ShapesTest {
    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(5, 4);
//        System.out.println(box1.getArea());
//        System.out.println(box1.getPerimeter());
//
//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());
        Measurable s1 = new Rectangle(10, 20);
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getArea());

        Measurable s2 = new Square(10);
        System.out.println(s2.getPerimeter());
        System.out.println(s2.getArea());
    }
}
