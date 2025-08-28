import java.util.Scanner;

class FeetToYardsMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double feet, yards, miles;
        System.out.print("Enter distance in feet: ");
        feet = input.nextDouble();
        yards = feet / 3;
        miles = yards / 1760;
        System.out.println("The distance of " + feet + " feet is " + yards +
                           " yards and " + miles + " miles.");
        input.close();
    }
}
