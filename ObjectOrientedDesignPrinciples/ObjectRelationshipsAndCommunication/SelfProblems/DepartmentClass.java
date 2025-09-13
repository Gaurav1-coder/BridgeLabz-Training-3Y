package ObjectOrientedDesignPrinciples.ObjectRelationshipsAndCommunication.SelfProblems;

public class DepartmentClass {
     private String deptName;

    public DepartmentClass(String deptName) {
        this.deptName = deptName;
    }

    public void showDepartment() {
        System.out.println("Department: " + deptName);
    }
    
    
}
