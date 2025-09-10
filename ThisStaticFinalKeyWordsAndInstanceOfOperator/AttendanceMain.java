package ThisStaticFinalKeyWordsAndInstanceOfOperator;

public class AttendanceMain {
     public static void main(String[] args) {
        AttendanceClass s1 = new AttendanceClass(1, "Amit", true);
        AttendanceClass s2 = new AttendanceClass(2, "Riya", false);
        AttendanceClass s3 = new AttendanceClass(3, "Karan", true);

        s1.displayAttendance();
        System.out.println();
        s2.displayAttendance();
        System.out.println();
        s3.displayAttendance();

        AttendanceClass.displayTotalStudents();
    }
}
