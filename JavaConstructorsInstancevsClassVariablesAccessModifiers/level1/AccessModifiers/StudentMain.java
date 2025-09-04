package JavaConstructorsInstancevsClassVariablesAccessModifiers.level1.AccessModifiers;

public class StudentMain {
    public static void main(String[] args) {
        StudentClass s = new StudentClass(101, "Ravi", 8.5);
        s.showDetails();
        s.setCGPA(9.0);
        System.out.println("Updated CGPA: " + s.getCGPA());

        PostGraduateStudentSubClass pg = new PostGraduateStudentSubClass(102, "Amit", 9.2, "AI");
        pg.showPGDetails();
    }
    
}
