package ObjectOrientedDesignPrinciples.ClassObjectAndSequeneceDiagram;

public class SchoolMain {
    public static void main(String[] args) {
      StudentClass student = new StudentClass("S1", "John");
        student.addSubject(new SubjectClass("Maths", 90));
        student.addSubject(new SubjectClass("Science", 85));

        GradeCalcClass calc = new GradeCalcClass();
        String grade = calc.calculateGrade(student);

        System.out.println(student.getName() + "'s Grade: " + grade);
    }
}
