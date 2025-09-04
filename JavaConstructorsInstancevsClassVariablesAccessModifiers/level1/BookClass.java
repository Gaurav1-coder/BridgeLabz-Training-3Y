package JavaConstructorsInstancevsClassVariablesAccessModifiers.level1;

public class BookClass {
    String t;   // title 
    String a;   // author
    double p;   // price

    BookClass() { // Default constructor
        this.t = "Unknown";
        this.a = "Anonymous";
        this.p = 0.0;
    }

    BookClass(String t, String a, double p) { // Parameterized constructor formed
        this.t = t;
        this.a = a;
        this.p = p;
    }

    void show() {
        System.out.println("Book: " + t + ", Author: " + a + ", Price: " + p);
    }
}
