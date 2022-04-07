package util;

public class InputTest {
    public static void main(String[] args) {
//        Input input = new Input();
//        input.yesNo();
        try{
            Input getInt = new Input();
            System.out.println(getInt.getInt(1,20));
        }catch (NumberFormatException nfe){
            System.out.println("no way jose!" + nfe);
        }
    }
}