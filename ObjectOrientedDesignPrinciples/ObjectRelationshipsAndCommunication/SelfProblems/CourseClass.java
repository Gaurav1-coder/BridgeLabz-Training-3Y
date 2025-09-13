package ObjectOrientedDesignPrinciples.ObjectRelationshipsAndCommunication.SelfProblems;

import java.util.ArrayList;
import java.util.List;

public class CourseClass {
     private String courseName;
    private List<StudentClass> enrolledStudents;

    public CourseClass(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(StudentClass s) {
        enrolledStudents.add(s);
    }

    public void showEnrolledStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (StudentClass s : enrolledStudents) {
            System.out.println(" - " + s.getName());
        }
    }
}
