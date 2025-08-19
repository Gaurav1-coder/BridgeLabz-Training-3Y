public class KilometerToMileConversion {
    public static void main(String[] args) {
        double distanceKm = 10.8;      
        double kmToMileFactor = 1.6;
        double distanceMiles = distanceKm * kmToMileFactor;
        System.out.println("The distance " + distanceKm + " km in miles is " + distanceMiles);
    }
}
