package  ThisStaticFinalKeyWordsAndInstanceOfOperator;

public class EmployeeMain {
 public static void main(String[] args) {
        EmployeeClass.setCompanyName("Tech Solutions Inc.");
        EmployeeClass e1 = new EmployeeClass("Thamarai", 101, "Software Engineer");
        EmployeeClass e2 = new EmployeeClass("Rohan", 102, "Manager");

        EmployeeClass.displayTotalEmployees();
        e1.displayEmployeeDetails();
        e2.displayEmployeeDetails();
    }



    
}
