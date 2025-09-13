package ObjectOrientedDesignPrinciples.ObjectRelationshipsAndCommunication.SelfProblems;

import java.util.ArrayList;
import java.util.List;

public class CourseUMSClass {
     private String name;
    private ProfessorClass professor;  // 🔹 link professor
    private List<StudentUMSClass> students;

    public CourseUMSClass(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // 🔹 assign a professor to this course
    public void assignProfessor(ProfessorClass p) {
        this.professor = p;
    }

    public void enroll(StudentUMSClass s) {
        students.add(s);
    }

    public void showStudents() {
        System.out.println("Students in " + name + ":");
        for (StudentUMSClass s : students) {
            System.out.println(" - " + s.getName());
        }
    }

    // 🔹 show course info (professor + students)
    public void showCourse() {
        System.out.println("Course: " + name);
        if (professor != null) {
            System.out.println("Professor: " + professor.getName());
        } else {
            System.out.println("Professor: None assigned");
        }
        showStudents();
    }
}
