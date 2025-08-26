import java.util.Scanner;

public class RockPaperScissors {

    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3);
        if (choice == 0) return "rock";
        else if (choice == 1) return "paper";
        else return "scissors";
    }

    public static String findWinner(String user, String comp) {
        if (user.equals(comp)) return "draw";

        if (user.equals("rock") && comp.equals("scissors")) return "user";
        else if (user.equals("scissors") && comp.equals("paper")) return "user";
        else if (user.equals("paper") && comp.equals("rock")) return "user";
        else return "computer";
    }

    public static String[][] calculateStats(int userWins, int compWins, int draws, int totalGames) {
        String[][] stats = new String[3][2];
        stats[0][0] = "User Wins";
        stats[0][1] = userWins + " (" + (userWins * 100 / totalGames) + "%)";
        stats[1][0] = "Computer Wins";
        stats[1][1] = compWins + " (" + (compWins * 100 / totalGames) + "%)";
        stats[2][0] = "Draws";
        stats[2][1] = draws + " (" + (draws * 100 / totalGames) + "%)";
        return stats;
    }

    public static void displayResults(String[][] results, String[][] stats) {
        System.out.println("\nGame Results:");
        System.out.println("Game\tUser Choice\tComputer Choice\tWinner");
        System.out.println("------------------------------------------------");
        for (int i = 0; i < results.length; i++) {
            System.out.println((i + 1) + "\t" + results[i][0] + "\t\t" + results[i][1] + "\t\t" + results[i][2]);
        }

        System.out.println("\nFinal Stats:");
        System.out.println("Category\tCount (Percentage)");
        System.out.println("---------------------------------");
        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" + stats[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[][] results = new String[n][3];
        int userWins = 0, compWins = 0, draws = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter your choice (rock/paper/scissors): ");
            String userChoice = sc.nextLine().toLowerCase();

            String compChoice = getComputerChoice();
            String winner = findWinner(userChoice, compChoice);

            if (winner.equals("user")) userWins++;
            else if (winner.equals("computer")) compWins++;
            else draws++;

            results[i][0] = userChoice;
            results[i][1] = compChoice;
            results[i][2] = winner;
        }

        String[][] stats = calculateStats(userWins, compWins, draws, n);
        displayResults(results, stats);

        sc.close();
    }
}
