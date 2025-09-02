import java.util.Scanner;

public class UnitConverter3 {

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double f = sc.nextDouble();
        System.out.println(f + " °F = " + convertFahrenheitToCelsius(f) + " °C");

        System.out.print("Enter temperature in Celsius: ");
        double c = sc.nextDouble();
        System.out.println(c + " °C = " + convertCelsiusToFahrenheit(c) + " °F");

        System.out.print("Enter weight in Pounds: ");
        double pounds = sc.nextDouble();
        System.out.println(pounds + " pounds = " + convertPoundsToKilograms(pounds) + " kg");

        System.out.print("Enter weight in Kilograms: ");
        double kg = sc.nextDouble();
        System.out.println(kg + " kg = " + convertKilogramsToPounds(kg) + " pounds");

        System.out.print("Enter volume in Gallons: ");
        double gallons = sc.nextDouble();
        System.out.println(gallons + " gallons = " + convertGallonsToLiters(gallons) + " liters");

        System.out.print("Enter volume in Liters: ");
        double liters = sc.nextDouble();
        System.out.println(liters + " liters = " + convertLitersToGallons(liters) + " gallons");

        sc.close();
    }
}
