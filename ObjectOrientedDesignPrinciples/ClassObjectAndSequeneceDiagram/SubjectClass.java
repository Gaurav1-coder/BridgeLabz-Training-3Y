package ObjectOrientedDesignPrinciples.ClassObjectAndSequeneceDiagram;

public class SubjectClass {
     private String subjectName;
    private int marks;

    public SubjectClass(String subjectName, int marks) {
        this.subjectName = subjectName;
        this.marks = marks;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public int getMarks() {
        return marks;
    }
}
