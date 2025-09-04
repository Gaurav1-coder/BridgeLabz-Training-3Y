package JavaConstructorsInstancevsClassVariablesAccessModifiers.level1;

public class LibraryBookClass {
     String t;   // title
    String a;   // author
    double p;   // price
    boolean av; // available

    LibraryBookClass(String t, String a, double p, boolean av) {
        this.t = t;
        this.a = a;
        this.p = p;
        this.av = av;
    }

    boolean borrow() {
        if (av) {
            av = false;
            System.out.println("Book borrowed: " + t);
            return true;
        } else {
            System.out.println("Book not available: " + t);
            return false;
        }
    }
}
