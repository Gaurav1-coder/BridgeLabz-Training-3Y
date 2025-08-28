import java.util.Scanner;

class SFeeDiscountCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fee;
        double discountPercent;
        double discountAmount;
        double finalFee;
        System.out.print("Enter the Student Fee (in INR): ");
        fee = input.nextDouble();
        System.out.print("Enter the University Discount Percentage: ");
        discountPercent = input.nextDouble();
        discountAmount = (discountPercent / 100) * fee;
        finalFee = fee - discountAmount;
        System.out.println("The discount amount is INR " + discountAmount +
                           " and final discounted fee is INR " + finalFee);

        input.close();
    }
}
