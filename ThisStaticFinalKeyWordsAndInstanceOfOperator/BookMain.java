package  ThisStaticFinalKeyWordsAndInstanceOfOperator;

public class BookMain {
    public static void main(String[] args) {
        BookClass.setLibraryName("Egmore Library");
        BookClass.displayLibraryName();

        BookClass b1 = new BookClass("Effective Java", "Joshua Bloch", "978-0134685991");
        b1.displayBookDetails();
    }
}
