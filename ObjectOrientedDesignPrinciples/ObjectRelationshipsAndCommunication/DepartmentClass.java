package ObjectOrientedDesignPrinciples.ObjectRelationshipsAndCommunication;

import java.util.ArrayList;
import java.util.List;

public class DepartmentClass {
     private String deptName;
    private List<EmployeeClass> employees;

    public DepartmentClass(String deptName) {
        this.deptName = deptName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(EmployeeClass e) {
        employees.add(e);
    }

    public void showDepartment() {
        System.out.println("Department: " + deptName);
        for (EmployeeClass e : employees) {
            e.showEmployee();
        }
    }    
}
