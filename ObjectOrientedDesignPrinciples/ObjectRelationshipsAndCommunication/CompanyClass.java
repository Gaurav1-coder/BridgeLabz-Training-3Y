package ObjectOrientedDesignPrinciples.ObjectRelationshipsAndCommunication;

import java.util.ArrayList;
import java.util.List;

public class CompanyClass {
      private String companyName;
    private List<DepartmentClass> departments;

    public CompanyClass(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(DepartmentClass d) {
        departments.add(d);
    }

    public void showCompany() {
        System.out.println("Company: " + companyName);
        for (DepartmentClass d : departments) {
            d.showDepartment();
        }
    }
}
