package ObjectOrientedDesignPrinciples.ClassObjectAndSequeneceDiagram;

import java.util.ArrayList;
import java.util.List;

public class StudentClass {
     private String studentId;
    private String name;
    private List<SubjectClass> subjects;

    public StudentClass(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.subjects = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addSubject(SubjectClass subject) {
        subjects.add(subject);
    }

    public List<SubjectClass> getSubjects() {
        return subjects;
    }
}
