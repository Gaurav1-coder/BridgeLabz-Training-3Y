import java.util.Scanner;

class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base, height, areaInInches, areaInCm;
        System.out.print("Enter the base of the triangle in inches: ");
        base = input.nextDouble();

        System.out.print("Enter the height of the triangle in inches: ");
        height = input.nextDouble();
        areaInInches = 0.5 * base * height;
        areaInCm = areaInInches * 2.54 * 2.54;
        System.out.println("The area of the triangle is " + areaInInches + " square inches " +
                           "and " + areaInCm + " square centimeters.");
        input.close();
    }
}
