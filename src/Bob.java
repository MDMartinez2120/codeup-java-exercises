import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("ask me a question.");

//        String input = scanner.next();
//        if (input.endsWith("?")){
//            System.out.println("sure");
//        }
//        System.out.println("Yell at me.");
//        String input = scanner.nextLine();
//        if (input.endsWith("!")){
//            System.out.println("Whoa, chill out!");
//        }
//        System.out.println("Don't say a word.");
//        String input = scanner.nextLine();
//        if (input.isBlank()){
//            System.out.print("Fine. Be that way!");
//        }
        System.out.println("Tell me what you think.");
        String input = scanner.next();
        if (input.contains("")){
            System.out.println("Whatever!");
        }
    }
}
