package ThisStaticFinalKeyWordsAndInstanceOfOperator;

public class CarRentalMain {
     public static void main(String[] args) {
        CarRentalClass r1 = new CarRentalClass("R101", "Amit", "Hyundai i20", 5, 1200);
        CarRentalClass r2 = new CarRentalClass("R102", "Raj", "Honda City", 3, 2000);

        r1.displayRentalDetails();
        System.out.println();
        r2.displayRentalDetails();

        CarRentalClass.displayTotalRentals();
    }
}
