package ObjectOrientedDesignPrinciples.ObjectRelationshipsAndCommunication.SelfProblems;

import java.util.ArrayList;
import java.util.List;

public class UniversityClass {
      private String name;
    private List<DepartmentClass> departments;
    private List<FacultyClass> faculties;

    public UniversityClass(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    public void addDepartment(DepartmentClass d) {
        departments.add(d);
    }

    public void addFaculty(FacultyClass f) {
        faculties.add(f);
    }

    public void showUniversity() {
        System.out.println("University: " + name);
        System.out.println("Departments:");
        for (DepartmentClass d : departments) {
            d.showDepartment();
        }
        System.out.println("Faculties:");
        for (FacultyClass f : faculties) {
            f.showFaculty();
        }
    }
}
