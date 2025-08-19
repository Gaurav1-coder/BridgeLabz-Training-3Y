import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks for Physics: ");
        int physics = sc.nextInt();
        System.out.print("Enter marks for Chemistry: ");
        int chemistry = sc.nextInt();
        System.out.print("Enter marks for Maths: ");
        int maths = sc.nextInt();

        double total = physics + chemistry + maths;
        double percentage = total / 3;

        System.out.println("Average Marks: " + percentage);

        if (percentage >= 90) {
            System.out.println("Grade: A");
            System.out.println("Remarks: Excellent");
        } else if (percentage >= 80) {
            System.out.println("Grade: B");
            System.out.println("Remarks: Very Good");
        } else if (percentage >= 70) {
            System.out.println("Grade: C");
            System.out.println("Remarks: Good");
        } else if (percentage >= 60) {
            System.out.println("Grade: D");
            System.out.println("Remarks: Average");
        } else if (percentage >= 50) {
            System.out.println("Grade: E");
            System.out.println("Remarks: Pass");
        } else {
            System.out.println("Grade: R");
            System.out.println("Remarks: Fail");
        }
    }
}
