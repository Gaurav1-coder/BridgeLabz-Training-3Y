import java.util.Scanner;

public class GymManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = new String[50];
        int[] age = new int[50];
        double[] weight = new double[50];
        String[] plan = new String[50];
        int memberCount = 0;

        char more;
        do {
            System.out.println("\n----- Add New Member -----");
            System.out.print("Enter Member Name: ");
            names[memberCount] = sc.nextLine();

            System.out.print("Enter Age: ");
            age[memberCount] = sc.nextInt();

            System.out.print("Enter Weight (kg): ");
            weight[memberCount] = sc.nextDouble();


            System.out.println("Choose Membership Plan:");
            System.out.println("1. Monthly (1000 Rs)");
            System.out.println("2. Quarterly (2500 Rs)");
            System.out.println("3. Yearly (8000 Rs)");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    plan[memberCount] = "Monthly - 1000 Rs";
                    break;
                case 2:
                    plan[memberCount] = "Quarterly - 2500 Rs";
                    break;
                case 3:
                    plan[memberCount] = "Yearly - 8000 Rs";
                    break;
                default:
                    plan[memberCount] = "Monthly - 1000 Rs (default)";
            }

            // Fitness Advice (if-else)
            if (weight[memberCount] < 50) {
                System.out.println("Fitness Advice: Underweight → Focus on strength training + protein diet.");
            } else if (weight[memberCount] >= 50 && weight[memberCount] <= 80) {
                System.out.println("Fitness Advice: Normal → Maintain workout + balanced diet.");
            } else {
                System.out.println("Fitness Advice: Overweight → Focus on cardio + calorie deficit diet.");
            }

            memberCount++;

            System.out.print("\nDo you want to add another member? (y/n): ");
            more = sc.next().charAt(0);
            sc.nextLine(); // consume newline
        } while (more == 'y' || more == 'Y');

        // Final Report
        System.out.println("\n===== Gym Members Report =====");
        for (int i = 0; i < memberCount; i++) {
            System.out.println("Member " + (i + 1) + ": " + names[i] + 
                               " | Age: " + age[i] + 
                               " | Weight: " + weight[i] + " kg" + 
                               " | Plan: " + plan[i]);
        }

        System.out.println("\nTotal Members Registered: " + memberCount);
        System.out.println("💪 Welcome to FitLife Gym! Stay Healthy, Stay Strong!");
        
        sc.close();
    }
}