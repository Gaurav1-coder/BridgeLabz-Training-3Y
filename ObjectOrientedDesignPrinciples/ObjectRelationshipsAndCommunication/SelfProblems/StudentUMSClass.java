package ObjectOrientedDesignPrinciples.ObjectRelationshipsAndCommunication.SelfProblems;

public class StudentUMSClass {
   private String name;

    public StudentUMSClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void enrollCourse(CourseUMSClass c) {
        c.enroll(this);
        System.out.println(name + " enrolled in " + c.getName()); 
    }
}
