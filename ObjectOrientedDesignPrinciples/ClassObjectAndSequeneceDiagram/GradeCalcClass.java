package ObjectOrientedDesignPrinciples.ClassObjectAndSequeneceDiagram;

public class GradeCalcClass {
     public String calculateGrade(StudentClass student) {
        int total = 0;
        for (SubjectClass s : student.getSubjects()) {
            total += s.getMarks();
        }
        double average = (double) total / student.getSubjects().size();

        if (average >= 90) return "A";
        else if (average >= 75) return "B";
        else if (average >= 50) return "C";
        else return "D";
    }
}
