import java.util.Scanner;

public class StudentScoreCard {

    public static int[][] generateScores(int n) {
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = (int)(Math.random() * 41) + 60; // random 60–100
            }
        }
        return scores;
    }

    public static double[][] calculateResults(int[][] scores) {
        int n = scores.length;
        double[][] results = new double[n][3]; 
        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double perc = (total / 300.0) * 100;
            results[i][0] = total;
            results[i][1] = Math.round(avg * 100.0) / 100.0;
            results[i][2] = Math.round(perc * 100.0) / 100.0;
        }
        return results;
    }

    public static String[] calculateGrades(double[][] results) {
        String[] grades = new String[results.length];
        for (int i = 0; i < results.length; i++) {
            double perc = results[i][2];
            if (perc >= 80) grades[i] = "A";
            else if (perc >= 70 & perc <= 79) grades[i] = "B";
            else if (perc >= 60 & perc <= 69) grades[i] = "C";
            else if (perc >= 50 & perc <= 59) grades[i] = "D";
            else if (perc >= 40 & perc <= 49) grades[i] = "E";
            else grades[i] = "R";
        }
        return grades;
    }

    public static void displayScoreCard(int[][] scores, double[][] results, String[] grades) {
        System.out.println("\nScorecard:");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
        System.out.println("-------------------------------------------------------------------------");
        for (int i = 0; i < scores.length; i++) {
            System.out.println((i+1) + "\t" +
                scores[i][0] + "\t" +
                scores[i][1] + "\t\t" +
                scores[i][2] + "\t" +
                (int)results[i][0] + "\t" +
                results[i][1] + "\t" +
                results[i][2] + "\t\t" +
                grades[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] scores = generateScores(n);
        double[][] results = calculateResults(scores);
        String[] grades = calculateGrades(results);

        displayScoreCard(scores, results, grades);

        sc.close();
    }
}
