import java.util.Scanner;
import java.util.stream.IntStream;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15){
//            System.out.println(i);
//            i++;
//        }
//        int i = 100;
//        do {
//            System.out.println(i);
//            i-=5;
//        }
//        while (i >= -10 );
//    }
//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        }
//        while (i < 1000000);
//        int i = 1;
//        do {
//            System.out.println(i);
//            i++;
//            if ((i % 5) == 0){
//                System.out.println("Fizz");
//            }if ((i % 3) == 0){
//                System.out.println("Buzz");
//            }if (((i % 5) == 0) && ((i % 3) == 0)){
//                System.out.println("FizzBuzz");
//            }
//        }
//        while (i <= 100);

//        System.out.print("Enter an integer:");
        Scanner scanner = new Scanner(System.in);
//
//        int input = scanner.nextInt();
//
//        System.out.println("Here is your table! \n");
//        System.out.println("number | squared | cubed");
//        System.out.println("------ | ------- | -----");
//        for (int i = 1; i <= input; i++) {
//            int squared = i * i;
//            int cubed = i * i * i;
//            System.out.println(i + "\t   | " + squared + "\t\t | " + cubed);
//        }
        String answer;
        do {
            System.out.print("Enter your grade number from 0-100:");

            int input = scanner.nextInt();

            if (input >= 88) {
                System.out.println("You received an A");
            } else if (input >= 80) {
                System.out.println("You received an B");
            } else if (input >= 67) {
                System.out.println("You received an C");
            } else if (input >= 60) {
                System.out.println("You received an D");
            } else {
                System.out.println("You received an F");
            }

            System.out.println("Do you wish to continue? y or n");
            answer = scanner.next();

        } while (answer.equals("y"));
    }
}
