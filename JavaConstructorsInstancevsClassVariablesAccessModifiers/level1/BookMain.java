package JavaConstructorsInstancevsClassVariablesAccessModifiers.level1;

public class BookMain {
     public static void main(String[] args) {
        // Using default constructor
        BookClass b1 = new BookClass();
        b1.show();

        // Using parameterized constructor
        BookClass b2 = new BookClass("Java Programming", "James Gosling", 499.99);
        b2.show();

        BookClass b3 = new BookClass("Clean Code", "Robert C. Martin", 799.50);
        b3.show();
    }
}
