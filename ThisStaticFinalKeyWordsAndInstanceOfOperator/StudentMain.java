package  ThisStaticFinalKeyWordsAndInstanceOfOperator;

public class StudentMain {
    public static void main(String[] args) {
        StudentClass.setUniversityName("Global University");
        StudentClass s1 = new StudentClass("Hemashree", 101, 'A');
        StudentClass s2 = new StudentClass("Sharmila", 102, 'B');

        StudentClass.displayTotalStudents();
        s1.displayStudentDetails();
        s2.displayStudentDetails();

        s2.updateGrade('A');
        s2.displayStudentDetails();
    }
}
