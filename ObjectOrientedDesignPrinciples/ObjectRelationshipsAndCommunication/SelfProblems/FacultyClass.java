package ObjectOrientedDesignPrinciples.ObjectRelationshipsAndCommunication.SelfProblems;

public class FacultyClass {
     private String name;

    public FacultyClass(String name) {
        this.name = name;
    }

    public void showFaculty() {
        System.out.println("Faculty: " + name);
    }
}
