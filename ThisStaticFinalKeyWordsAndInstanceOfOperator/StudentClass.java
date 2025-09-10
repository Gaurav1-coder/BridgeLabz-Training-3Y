package  ThisStaticFinalKeyWordsAndInstanceOfOperator;

public class StudentClass {
     private static String universityName;
    private static int totalStudents = 0;

    private final int rollNumber;
    private String name;
    private char grade;

    public StudentClass(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public static void setUniversityName(String name) {
        universityName = name;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    public void displayStudentDetails() {
        if (this instanceof StudentClass) {
            System.out.println("University Name: " + universityName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
        }
    }

    public void updateGrade(char newGrade) {
        this.grade = newGrade;
        System.out.println("Grade updated to: " + newGrade);
    }
}
