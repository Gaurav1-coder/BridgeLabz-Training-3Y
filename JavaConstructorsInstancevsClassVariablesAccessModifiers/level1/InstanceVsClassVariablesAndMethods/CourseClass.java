package JavaConstructorsInstancevsClassVariablesAccessModifiers.level1.InstanceVsClassVariablesAndMethods;

public class CourseClass {
     String courseName;
    int duration;
    double fee;
    static String instituteName = "Default Institute";

    CourseClass(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    void displayCourseDetails() {
        System.out.println("Course: " + courseName + 
                           ", Duration: " + duration + " months" + 
                           ", Fee: " + fee + 
                           ", Institute: " + instituteName);
    }

    static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    
}
