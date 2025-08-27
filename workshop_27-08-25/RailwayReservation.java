import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        int totalSeats = 5;   
        int bookedSeats = 0;
        int waitingList = 0;

        System.out.println("----- Railway Reservation System -----");

        System.out.println("Choose Train:");
        System.out.println("1. Express (Fare: 500)");
        System.out.println("2. Superfast (Fare: 800)");
        System.out.println("3. Rajdhani (Fare: 1200)");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        int fare = 0;
        switch (choice) {
            case 1:
                fare = 500;
                System.out.println("You selected Express Train.");
                break;
            case 2:
                fare = 800;
                System.out.println("You selected Superfast Train.");
                break;
            case 3:
                fare = 1200;
                System.out.println("You selected Rajdhani Train.");
                break;
            default:
                System.out.println("Invalid choice! Default Express Train booked.");
                fare = 500;
        }

        char moreBooking;
        do {
            if (bookedSeats < totalSeats) {
                System.out.print("Enter passenger name: ");
                String name = sc.next();

                bookedSeats++;
                System.out.println("Seat booked for " + name + ". Seat No: " + bookedSeats);
                System.out.println("Fare: " + fare);
            } else {
                System.out.print("Enter passenger name (will go to Waiting List): ");
                String name = sc.next();
                waitingList++;
                System.out.println("No seat available! " + name + " is in Waiting List Position: " + waitingList);
            }

            System.out.print("Do you want to book another ticket? (y/n): ");
            moreBooking = sc.next().charAt(0);

        } while (moreBooking == 'y' || moreBooking == 'Y'); 

        System.out.println("\n----- Booking Summary -----");
        System.out.println("Total Seats: " + totalSeats);
        System.out.println("Booked Seats: " + bookedSeats);
        System.out.println("Waiting List: " + waitingList);
        System.out.println("Thank you for using Railway Reservation System!");

        sc.close();
    }
}