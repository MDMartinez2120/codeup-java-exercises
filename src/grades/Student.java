package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private String name;
    private  ArrayList<Integer> grades = new ArrayList<>();

    public String getName(){
        return name;
    }

    public ArrayList<Integer> getGrades(){return grades;}

    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage(){
        double gradeTotal = 0;
        for ( Integer grade : grades){
            gradeTotal += grade;
        }
        return gradeTotal / this.grades.size();
    }

    public Student(String name){
        this.name = name;
    }

}
