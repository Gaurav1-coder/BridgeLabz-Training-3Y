package ObjectOrientedDesignPrinciples.ObjectRelationshipsAndCommunication.SelfProblems;

public class SchoolMain {
      public static void main(String[] args) {
        SchoolClass school = new SchoolClass("Greenwood High");

        StudentClass s1 = new StudentClass("Amit");
        StudentClass s2 = new StudentClass("Riya");

        CourseClass c1 = new CourseClass("Mathematics");
        CourseClass c2 = new CourseClass("Physics");

        s1.enroll(c1);
        s1.enroll(c2);
        s2.enroll(c1);

        school.addStudent(s1);
        school.addStudent(s2);

        school.showSchool();
        s1.showCourses();
        c1.showEnrolledStudents();
    }
}
