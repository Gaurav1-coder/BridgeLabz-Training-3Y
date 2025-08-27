import java.util.Scanner;

public class CricketAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Team Name: ");
        String team = sc.nextLine();

        System.out.print("How many batsmen played? ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] names = new String[n];
        int[] runs = new int[n];
        int total = 0;
        int highest = 0;
        int bestPlayerIndex = 0;

        // Input names and runs
        System.out.println("Enter name and runs of each batsman:");
        for (int i = 0; i < n; i++) {
            System.out.print("Batsman " + (i + 1) + " Name: ");
            names[i] = sc.nextLine();

            System.out.print("Runs scored by " + names[i] + ": ");
            runs[i] = sc.nextInt();
            sc.nextLine(); // consume newline

            total = total + runs[i];

            if (runs[i] > highest) {
                highest = runs[i];
                bestPlayerIndex = i;
            }
        }

        // Scorecard
        System.out.println("\n--- Scorecard ---");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i] + " scored: " + runs[i]);
        }

        System.out.println("\nTeam: " + team);
        System.out.println("Total Runs: " + total);
        System.out.println("Highest Scorer: " + names[bestPlayerIndex] + " with " + highest + " runs");

        // Simple performance check
        if (total < 100) {
            System.out.println("Performance: Poor");
        } else if (total < 200) {
            System.out.println("Performance: Average");
        } else {
            System.out.println("Performance: Good");
        }

        sc.close();
    }
}