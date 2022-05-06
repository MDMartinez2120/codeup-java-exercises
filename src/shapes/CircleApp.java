package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        boolean increment = true;

        do {
            double radius = input.getDouble("enter radius");

            Circle circle = new Circle(radius);

            increment = input.yesNo();

        }while (increment);

    }
}
