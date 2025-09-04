package JavaConstructorsInstancevsClassVariablesAccessModifiers.level1.AccessModifiers;

public class ManagerSubClass extends EmployeeClass {
     String teamSize;

    ManagerSubClass(int employeeID, String department, double salary, String teamSize) {
        super(employeeID, department, salary);
        this.teamSize = teamSize;
    }

    void showManager() {
        // accessing public employeeID & protected department
        System.out.println("Manager ID: " + employeeID + ", Dept: " + department + ", Team Size: " + teamSize);
    }
    
}
