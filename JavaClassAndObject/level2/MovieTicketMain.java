package JavaClassAndObject.level2;

import java.util.Scanner;

public class MovieTicketMain {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ClassMovieTicket t1 = new ClassMovieTicket();
        System.out.print("Enter Movie Name: ");
        String movie = sc.nextLine();
        System.out.print("Enter Seat No: ");
        int seat = sc.nextInt();
        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        t1.book(movie, seat, price);
        t1.display();

        sc.close();
    }
}
