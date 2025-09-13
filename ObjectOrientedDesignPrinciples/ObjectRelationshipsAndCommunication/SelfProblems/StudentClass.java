package ObjectOrientedDesignPrinciples.ObjectRelationshipsAndCommunication.SelfProblems;

import java.util.ArrayList;
import java.util.List;

public class StudentClass {
     private String name;
    private List<CourseClass> courses;

    public StudentClass(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enroll(CourseClass c) {
        courses.add(c);
        c.addStudent(this);
    }

    public void showCourses() {
        System.out.println(name + " is enrolled in:");
        for (CourseClass c : courses) {
            System.out.println(" - " + c.getCourseName());
        }
    }
}
