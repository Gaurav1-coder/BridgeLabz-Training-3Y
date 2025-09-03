package JavaClassAndObject.level2;

class ClassMovieTicket {
    String movie;
    int seatNo;
    double price;

    void book(String movie, int seatNo, double price) {
        this.movie = movie;
        this.seatNo = seatNo;
        this.price = price;
        System.out.println("Ticket Booked!");
    }

    void display() {
        System.out.println("Movie: " + movie);
        System.out.println("Seat: " + seatNo);
        System.out.println("Price: " + price);
    }
}
