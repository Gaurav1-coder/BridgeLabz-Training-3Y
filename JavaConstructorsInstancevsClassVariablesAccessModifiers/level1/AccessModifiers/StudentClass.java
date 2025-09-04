package JavaConstructorsInstancevsClassVariablesAccessModifiers.level1.AccessModifiers;

public class StudentClass {
    public int rollNumber;      // public → accessible anywhere
    protected String name;      // protected → accessible in same package & subclasses
    private double CGPA;        // private → accessible only inside class

    StudentClass(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // public getter
    public double getCGPA() {
        return CGPA;
    }

    // public setter
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    void showDetails() {
        System.out.println("Roll: " + rollNumber + ", Name: " + name + ", CGPA: " + CGPA);
    }
}
