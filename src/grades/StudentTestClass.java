package grades;

public class StudentTestClass {
    public static void main(String[] args) {
        Student student1 = new Student("Bob");
        System.out.println(student1.getName());
        student1.addGrade(60);
        student1.addGrade(100);
        System.out.println(student1.getGrades());
        System.out.println(student1.getGradeAverage());
    }
}
