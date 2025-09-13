package ObjectOrientedDesignPrinciples.ObjectRelationshipsAndCommunication.SelfProblems;

import java.util.ArrayList;
import java.util.List;

public class SchoolClass {
     private String name;
    private List<StudentClass> students;

    public SchoolClass(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(StudentClass s) {
        students.add(s);
    }

    public void showSchool() {
        System.out.println("School: " + name + " | Students count: " + students.size());
    }
}
