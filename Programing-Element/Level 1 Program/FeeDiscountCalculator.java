import java.util.Scanner;
class FeeDiscountCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fee;
        double discountPercent;
        double discount;
        System.out.print("Enter the Student Fee (in INR): ");
        fee = input.nextDouble();
        System.out.print("Enter the University Discount Percentage: ");
        discountPercent = input.nextDouble();
        discount = (discountPercent / 100) * fee;
        System.out.println("The Student Fee is INR " + fee +
                           "\nThe University Discount Percentage is " + discountPercent + "%" +
                           "\nThe Discount Amount is INR " + discount);
        input.close();
    }
}
