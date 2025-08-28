import java.util.Scanner;

class HeightConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double heightCm;
        double totalInches;
        int heightFeet;
        double heightInches;
        double cmPerInch = 2.54;
        int inchesPerFoot = 12;
        System.out.print("Enter your height in centimeters: ");
        heightCm = input.nextDouble();
        totalInches = heightCm / cmPerInch;
        heightFeet = (int) (totalInches / inchesPerFoot);
        heightInches = totalInches % inchesPerFoot;
        System.out.println("Your Height in cm is " + heightCm +
                           " while in feet is " + heightFeet +
                           " and inches is " + heightInches);
        input.close();
    }
}
