package ThisStaticFinalKeyWordsAndInstanceOfOperator;

public class AttendanceClass {
    private static String institutionName = "ABC College";
    private static int totalStudents = 0;

    private final int studentID;
    private String studentName;
    private boolean isPresent;

    public AttendanceClass(int studentID, String studentName, boolean isPresent) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.isPresent = isPresent;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students in System: " + totalStudents);
    }

    public void markAttendance(boolean present) {
        this.isPresent = present;
    }

    public void displayAttendance() {
        if (this instanceof AttendanceClass) {
            System.out.println("Institution: " + institutionName);
            System.out.println("Student ID: " + studentID);
            System.out.println("Student Name: " + studentName);
            System.out.println("Attendance: " + (isPresent ? "Present" : "Absent"));
        }
    }
}
