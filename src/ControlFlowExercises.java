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
        int i = 1;
        do {
            System.out.println(i);
            i++;
            if ((i % 5) == 0){
                System.out.println("Fizz");
            }if ((i % 3) == 0){
                System.out.println("Buzz");
            }if (((i % 5) == 0) && ((i % 3) == 0)){
                System.out.println("FizzBuzz");
            }
        }
        while (i <= 100);
    }
}
