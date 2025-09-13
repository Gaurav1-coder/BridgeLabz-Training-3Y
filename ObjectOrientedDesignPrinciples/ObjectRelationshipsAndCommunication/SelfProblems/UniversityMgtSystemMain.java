package ObjectOrientedDesignPrinciples.ObjectRelationshipsAndCommunication.SelfProblems;

public class UniversityMgtSystemMain {
     public static void main(String[] args) {
        StudentUMSClass s1 = new StudentUMSClass("Amit");
        StudentUMSClass s2 = new StudentUMSClass("Riya");

        ProfessorClass p1 = new ProfessorClass("Dr. Sharma");

        CourseUMSClass c1 = new CourseUMSClass("Data Structures");
        c1.assignProfessor(p1);

        s1.enrollCourse(c1);
        s2.enrollCourse(c1);

        c1.showCourse();
    }
}
