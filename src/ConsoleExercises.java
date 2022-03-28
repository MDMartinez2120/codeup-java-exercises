import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.format("the value of pi is approximately $%,.2f%n", pi);
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter your favorite number");
//        int userNumber = scanner.nextInt();
//        System.out.println(userNumber);
//        scanner.nextLine();
//        System.out.print("Enter 3 Words.");
//        String userWords = scanner.nextLine();
//        System.out.println(userWords);
//        System.out.print("Enter a sentence.");
//        String userSentence = scanner.nextLine();
//        System.out.println(userSentence);

        System.out.print("Enter a length.");
        int userLength = scanner.nextInt();
        System.out.print("Enter a Width.");
        int userWidth = scanner.nextInt();
        System.out.println("The total area for the classroom is: " + userLength + userWidth * 2);
    }
}
