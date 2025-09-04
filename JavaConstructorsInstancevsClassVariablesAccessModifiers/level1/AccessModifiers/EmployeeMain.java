package JavaConstructorsInstancevsClassVariablesAccessModifiers.level1.AccessModifiers;

public class EmployeeMain {
     public static void main(String[] args) {
        EmployeeClass e = new EmployeeClass(1, "IT", 50000);
        e.showEmployee();
        e.setSalary(60000);
        System.out.println("Updated Salary: " + e.getSalary());

        ManagerSubClass m = new ManagerSubClass(2, "HR", 70000, "10 members");
        m.showManager();
    }
}
