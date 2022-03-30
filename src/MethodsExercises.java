import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
//        addNums(3, 3);
//        subNums(10, 5);
//        mulNums(8,4);
//        divNums(20, 5);
//        multiLoop(4,3);
//        count(5);
//        getInteger(1, 10);
//        numFact();
        diceRoll();

    }
//    public static void addNums(int num1, int num2){
//        int i = num1 + num2;
//        System.out.println(i);
//    }
//
//    public static void subNums(int num1, int num2){
//        int i = num1 - num2;
//        System.out.println(i);
//    }
//
//    public static void mulNums(int num1, int num2){
//        int i = num1 * num2;
//        System.out.println(i);
//    }
//
//    public static void divNums(int num1, int num2){
//        int i = num1 / num2;
//        System.out.println(i);
//    }
//
//    public static void multiLoop(int n1, int n2){
//        int result = 0;
//        for (int i = 0; i < n1; i++){
//            result += n2;
//        }
//        System.out.println(result);
//    }
//    public static void count(int n) {
//        if (n == 100) {
//            System.out.println("All done!");
//            return;
//        }
//        System.out.println(n);
//        count(n + 1);
//    }

//    public static int getInteger(int min, int max) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = input.nextInt();
//
//        if (userInput < min || userInput > 10) {
//            System.out.println("sorry try again");
//            return getInteger(min, max);
//        } else {
//            return userInput;
//        }
//    }

//    public static void numFact() {
//        int n, c, fact = 1;
//        System.out.print("Enter a number between 1 and 10: ");
//        Scanner input = new Scanner(System.in);
//
//        int userInput = input.nextInt();
//
//        if (userInput < 0) {
//            System.out.println("number should be more than 0.");
//
//        } else {
//            for (c = 1; c <= userInput; c++)
//                fact = fact * c;
//
//            System.out.println("Factorial of " + userInput + " is = " + fact);
//        }
//    }

    public static void diceRoll(){
        System.out.print("Enter the number on the side of: ");
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
        int userDie = (int)(Math.random()* userInput) + 1;
        int userDie2 = (int)(Math.random()* userInput) + 1;
        System.out.println("Your first dice roll lands you " + userDie);
        System.out.println("Your second dice roll lands you " + userDie2);
    }

};








