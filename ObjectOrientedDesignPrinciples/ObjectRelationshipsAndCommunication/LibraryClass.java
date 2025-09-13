package ObjectOrientedDesignPrinciples.ObjectRelationshipsAndCommunication;

import java.util.ArrayList;
import java.util.List;



public class LibraryClass {
    private String name;
    private List<BookClass> books;

    public LibraryClass(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(BookClass b) {
        books.add(b);
    }

    public void showLibrary() {
        System.out.println("Library: " + name);
        for (BookClass b : books) {
            b.showDetails();
        }
    }
}

    

