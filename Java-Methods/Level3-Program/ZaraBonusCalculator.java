import java.util.Random;

public class ZaraBonusCalculator {

    public static int[][] generateSalaryAndService(int size) {
        Random rand = new Random();
        int[][] data = new int[size][2]; 
        for (int i = 0; i < size; i++) {
            data[i][0] = 10000 + rand.nextInt(90000);
            data[i][1] = 1 + rand.nextInt(10);        
        }
        return data;
    }

    public static double[][] calculateNewSalaryAndBonus(int[][] data) {
        double[][] result = new double[data.length][2];
        for (int i = 0; i < data.length; i++) {
            int salary = data[i][0];
            int years = data[i][1];
            double bonus = (years > 5) ? salary * 0.05 : salary * 0.02;
            double newSalary = salary + bonus;
            result[i][0] = newSalary;
            result[i][1] = bonus;
        }
        return result;
    }

    public static void displaySummary(int[][] data, double[][] newData) {
        double sumOldSalary = 0, sumNewSalary = 0, totalBonus = 0;

        System.out.printf("%-5s %-10s %-10s %-10s %-10s %-10s%n", 
                          "ID", "Salary", "Service", "Bonus", "NewSalary", "Status");
        for (int i = 0; i < data.length; i++) {
            int salary = data[i][0];
            int service = data[i][1];
            double bonus = newData[i][1];
            double newSalary = newData[i][0];

            sumOldSalary += salary;
            sumNewSalary += newSalary;
            totalBonus += bonus;

            System.out.printf("%-5d %-10d %-10d %-10.2f %-10.2f %-10s%n",
                              (i + 1), salary, service, bonus, newSalary, 
                              (service > 5 ? "5%" : "2%"));
        }

        System.out.println("---------------------------------------------------------------");
        System.out.printf("Total  %-10.2f %-10s %-10.2f %-10.2f%n",
                          sumOldSalary, "", totalBonus, sumNewSalary);
    }

    public static void main(String[] args) {
        int[][] salaryServiceData = generateSalaryAndService(10);
        double[][] newSalaryBonusData = calculateNewSalaryAndBonus(salaryServiceData);
        displaySummary(salaryServiceData, newSalaryBonusData);
    }
}
