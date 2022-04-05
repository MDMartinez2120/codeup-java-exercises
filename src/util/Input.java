package util;

import java.util.Objects;
import java.util.Scanner;

public class Input {
    private Scanner sc = new Scanner(System.in);

    public Input(){
        this.sc = new Scanner(System.in);
    }

    public String getString(){
        return sc.next();
    }

    public int getInt(int min, int max){
        return sc.nextInt();
    }

    public int getInt(){
        return sc.nextInt();
    }

    double getDouble(double min, double max){
        return sc.nextDouble();
    }

    double getDouble(){
        return sc.nextDouble();
    }

    public Boolean yesNo(){
        Scanner userInput = new Scanner(System.in);
        String answer = userInput.nextLine();
        if (Objects.equals(answer, "yes")){
            return true;
        }else if (Objects.equals(answer, "y")){
            return true;
        }else {
            return false;
        }
    }
}
