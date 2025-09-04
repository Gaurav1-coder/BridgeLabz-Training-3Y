package JavaConstructorsInstancevsClassVariablesAccessModifiers.level1.AccessModifiers;

public class PostGraduateStudentSubClass extends StudentClass {
    String specialization;

    PostGraduateStudentSubClass(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    void showPGDetails() {
        // accessing public rollNumber & protected name
        System.out.println("PG Student: " + rollNumber + ", Name: " + name + ", Specialization: " + specialization);
    }
    
}
