package main.java.org.exercice2;

public class MathTeacher implements Teacher {
    public void teach(Student student) {
        System.out.println("Math teacher is teaching student with ID: " + student.getStudentId());
    }
}