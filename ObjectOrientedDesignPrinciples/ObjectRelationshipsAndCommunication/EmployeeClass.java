package ObjectOrientedDesignPrinciples.ObjectRelationshipsAndCommunication;

public class EmployeeClass {
     private String name;

    public EmployeeClass(String name) {
        this.name = name;
    }

    public void showEmployee() {
        System.out.println("Employee: " + name);
    }
}
