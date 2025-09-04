package JavaConstructorsInstancevsClassVariablesAccessModifiers.level1.AccessModifiers;

public class EBookSubClass extends BookClass {
     double fileSize;

    EBookSubClass(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    void showEBook() {
        // accessing public ISBN & protected title
        System.out.println("EBook ISBN: " + ISBN + ", Title: " + title + ", Size: " + fileSize + "MB");
    }
    
}
