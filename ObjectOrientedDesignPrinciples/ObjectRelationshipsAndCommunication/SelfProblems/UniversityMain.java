package ObjectOrientedDesignPrinciples.ObjectRelationshipsAndCommunication.SelfProblems;

public class UniversityMain {
     public static void main(String[] args) {
        UniversityClass uni = new UniversityClass("Delhi University");

        DepartmentClass d1 = new DepartmentClass("Computer Science");
        DepartmentClass d2 = new DepartmentClass("Physics");

        FacultyClass f1 = new FacultyClass("Dr. Sharma");
        FacultyClass f2 = new FacultyClass("Prof. Gupta");

        uni.addDepartment(d1);
        uni.addDepartment(d2);

        uni.addFaculty(f1);
        uni.addFaculty(f2);

        uni.showUniversity();

        // Deleting University -> Departments removed (composition)
        uni = null;
        System.out.println("University deleted, departments removed.");
    }
}
