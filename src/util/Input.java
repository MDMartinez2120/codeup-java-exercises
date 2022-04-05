package util;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Input {
    private static Scanner sc = new Scanner(System.in);

    public Input(){
        this.sc = new Scanner(System.in);
    }

    public String getString(){
        return sc.next();
    }

    public int getInt(int min, int max){
        System.out.println("Enter a number.");
        Random random = new Random();
        int randomNumber = random.nextInt(max + 1 - min) + min;
        return sc.nextInt();
    }

    public int getInt(){
        return sc.nextInt();
    }

    static double getDouble(double min, double max){
        System.out.println("Enter a number.");
        Random random = new Random();
        int randomDecimal = (int) (random.nextInt((int) (max + 1 - min)) + min);
        return sc.nextDouble();
    }

//    double getDouble(){
//        return sc.nextDouble();
//    }

    public Boolean yesNo(){
        Scanner userInput = new Scanner(System.in);
        String answer = userInput.nextLine();
        if (Objects.equals(answer, "yes")){
            return true;
        }else return Objects.equals(answer, "y");
    }
    static class InputTest {

    }
}
