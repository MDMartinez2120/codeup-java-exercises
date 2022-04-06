package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Student matt = new Student("Matt");
        matt.addGrade(100);
        matt.addGrade(90);
        matt.addGrade(90);
        students.put("Matt", matt);
        System.out.println(matt.getGradeAverage());

        Student john = new Student("John");
        john.addGrade(100);
        john.addGrade(70);
        john.addGrade(80);
        students.put("John", john);
        System.out.println(john.getGradeAverage());

        Student nate = new Student("Nate");
        nate.addGrade(100);
        nate.addGrade(80);
        nate.addGrade(80);
        students.put("Nate", nate);
        System.out.println(nate.getGradeAverage());

        Student oscar = new Student("Oscar");
        oscar.addGrade(70);
        oscar.addGrade(70);
        oscar.addGrade(100);
        students.put("Oscar", oscar);
        System.out.println(oscar.getGradeAverage());

        System.out.println("Welcome! \n Here are the GitHub usernames of our students: \n Matt | John | Nate | Oscar \n What student would you like to see more information on? \n ");

        Scanner sc = new Scanner(System.in);


        while (true) {
            String userInput = sc.nextLine().trim();
            if (userInput.equalsIgnoreCase("matt")){
                System.out.println("Name: Matt, \n " + "GitHub Username: " + matt.getName() + " \n " + "Current Average: " + matt.getGradeAverage());
            }else if (userInput.equalsIgnoreCase("john")){
                System.out.println("Name: John, \n " + "GitHub Username: " + john.getName() + " \n " + "Current Average: " + john.getGradeAverage());
            }else if (userInput.equalsIgnoreCase("nate")){
                System.out.println("Name: Nate, \n " + "GitHub Username: " + nate.getName() + " \n " + "Current Average: " + nate.getGradeAverage());
            }else if (userInput.equalsIgnoreCase("oscar")){
                System.out.println("Name: Matt, \n " + "GitHub Username: " + oscar.getName() + " \n " + "Current Average: " + oscar.getGradeAverage());
            }else {
                System.out.println("invalid input dummy");
            }

        }
    }
}
