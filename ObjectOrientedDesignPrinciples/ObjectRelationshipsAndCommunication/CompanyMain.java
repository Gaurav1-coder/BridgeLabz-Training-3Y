package ObjectOrientedDesignPrinciples.ObjectRelationshipsAndCommunication;

public class CompanyMain {
     public static void main(String[] args) {
        CompanyClass comp = new CompanyClass("TechCorp");

        DepartmentClass dev = new DepartmentClass("Development");
        DepartmentClass hr = new DepartmentClass("HR");

        dev.addEmployee(new EmployeeClass("John"));
        dev.addEmployee(new EmployeeClass("Alice"));
        hr.addEmployee(new EmployeeClass("Bob"));

        comp.addDepartment(dev);
        comp.addDepartment(hr);

        comp.showCompany();
    }
}
