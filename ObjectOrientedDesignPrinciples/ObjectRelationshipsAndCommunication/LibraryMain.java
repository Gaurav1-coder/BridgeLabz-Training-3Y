package ObjectOrientedDesignPrinciples.ObjectRelationshipsAndCommunication;

public class LibraryMain {
     public static void main(String[] args) {
        BookClass b1 = new BookClass("Java Basics", "James Gosling");
        BookClass b2 = new BookClass("Effective Java", "Joshua Bloch");

        LibraryClass lib1 = new LibraryClass("City Library");
        LibraryClass lib2 = new LibraryClass("Town Library");

        lib1.addBook(b1);
        lib1.addBook(b2);
        lib2.addBook(b2); // same book added to another library

        lib1.showLibrary();
        lib2.showLibrary();
    }
}
