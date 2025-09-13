package ObjectOrientedDesignPrinciples.ObjectRelationshipsAndCommunication;

public class BookClass {
    private String title;
    private String author;

    public BookClass(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void showDetails() {
        System.out.println("Book: " + title + " | Author: " + author);
    }
    
}
