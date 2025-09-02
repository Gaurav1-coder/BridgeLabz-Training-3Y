import java.util.Scanner;

public class CollinearPoints {

    public static boolean checkCollinearSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        double slopeAB = (double)(y2 - y1) / (x2 - x1);
        double slopeBC = (double)(y3 - y2) / (x3 - x2);
        double slopeAC = (double)(y3 - y1) / (x3 - x1);
        return slopeAB == slopeBC && slopeBC == slopeAC;
    }

    public static boolean checkCollinearArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1 y1: ");
        int x1 = sc.nextInt(), y1 = sc.nextInt();
        System.out.print("Enter x2 y2: ");
        int x2 = sc.nextInt(), y2 = sc.nextInt();
        System.out.print("Enter x3 y3: ");
        int x3 = sc.nextInt(), y3 = sc.nextInt();

        boolean slopeResult = checkCollinearSlope(x1, y1, x2, y2, x3, y3);
        boolean areaResult = checkCollinearArea(x1, y1, x2, y2, x3, y3);

        System.out.println("Using slope formula: " + (slopeResult ? "Collinear" : "Not Collinear"));
        System.out.println("Using area formula: " + (areaResult ? "Collinear" : "Not Collinear"));

        sc.close();
    }
}

