package shiti;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;
    private int age;
    private Map<String,Integer>grades;
    private Student(String name,int age){
        this.name=name;
        this.age=age;
        this.grades=new HashMap<>();
    }
    public double aadGrade(String subject,int score) {
        grades.put(subject, score);
        return score;
    }
    public double calculateAverageGrade(){
        if(grades.isEmpty()){
            return 0.0;
        }
        int totalScore=0;
        for (int score:grades.values()){
            totalScore+=score;
        }
        return (double)totalScore/grades.size();
    }
    public String toString(){
        return "Name:"+name+",Age:"+age+",Average Grade:"+calculateAverageGrade();
    }

    public static void main(String[] args) {
        Student student=new Student("张三",18);
        student.aadGrade("数学",90);
        student.aadGrade("英语",85);
        System.out.println(student);
    }
}
