package JavaConstructorsInstancevsClassVariablesAccessModifiers.level1.InstanceVsClassVariablesAndMethods;

public class CourseMain {
    public static void main(String[] args) {
        CourseClass c1 = new CourseClass("Java", 6, 15000);
        CourseClass c2 = new CourseClass("Python", 4, 12000);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        CourseClass.updateInstituteName("Tech Academy"); // update class variable

        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
    
}
