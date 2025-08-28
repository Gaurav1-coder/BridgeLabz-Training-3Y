import java.util.Scanner;
public class KmToMilesConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double km;
        double kmPerMile = 1.6;
        System.out.print("Enter the distance in kilometers: ");
        km = input.nextDouble();
        double miles = km / kmPerMile;
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
        input.close();
    }
}
