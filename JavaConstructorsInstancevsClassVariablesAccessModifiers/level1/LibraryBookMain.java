package JavaConstructorsInstancevsClassVariablesAccessModifiers.level1;

public class LibraryBookMain {
    public static void main(String[] args) {
        // Create books
        LibraryBookClass b1 = new LibraryBookClass("Java Basics", "James Gosling", 499.0, true);
        LibraryBookClass b2 = new LibraryBookClass("Clean Code", "Robert C. Martin", 799.0, true);

        // Try borrowing books
        b1.borrow(); // should succeed
        b1.borrow(); // should fail (already borrowed)

        b2.borrow(); // should succeed
    }
}
