package util;

import java.util.Scanner;

public class Input {
    private Scanner input = new Scanner(System.in);

    String getString(){
        return input.nextLine();
    }

    public boolean yesNo(){
        System.out.println("Yes or No?");
        String userInput = input.nextLine();
        if (userInput.equals( "y")|| userInput.equals("Y") || userInput.equals("yes") || userInput.equals("Yes")) {
            return true;
        }
        return false;
    }
    public int getInt(int min, int max){
        System.out.println("Enter a number between" + min + "and" + max + "int");
        int userInt = Integer.parseInt(getString());
        if (userInt > min || userInt < max){
            return getInt(min, max);
        }
        return userInt;
    }
    public int getInt(){
        String userInput = getString();
        try {
            return Integer.parseInt(userInput);
        }catch (NumberFormatException nfe){
            System.out.println(nfe);
        }
        return getInt();
//        int userInt = input.nextInt();
//        return userInt;
//        return Integer.valueOf(getString());
    }

    public double getDouble(double min, double max){
        System.out.println("Enter a number between" + min + "and" + max + "double");
        int userDouble = Integer.parseInt(getString());
        if (userDouble > min || userDouble < max){
            return getDouble(min, max);
        }
        return userDouble;
    }

    public double getDouble(){
        try {
            double userInput = input.nextDouble();
            return userInput;
        }catch (Exception exception){
            input.nextLine();
            return getDouble();
        }
//        double userDouble = input.nextDouble();
//        return userDouble;
    }

    public double getDouble(String enter_radius) {
        return getDouble();
    }
}