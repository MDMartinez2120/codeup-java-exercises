package util;

import java.util.Scanner;

public class Input {
    private Scanner sc = new Scanner(System.in);

    public Input(){
        this.sc = new Scanner(System.in);
    }

    public String getString(){
        return sc.next();
    }

    public Boolean yesNo(){
        return sc.nextBoolean();
    }
}
