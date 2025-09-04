package JavaConstructorsInstancevsClassVariablesAccessModifiers.level1.AccessModifiers;

public class EmployeeClass {
     public int employeeID;    // public
    protected String department; // protected
    private double salary;    // private

    EmployeeClass(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // public method to modify salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    void showEmployee() {
        System.out.println("ID: " + employeeID + ", Dept: " + department + ", Salary: " + salary);
    }
}
