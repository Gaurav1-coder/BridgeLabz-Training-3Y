package JavaConstructorsInstancevsClassVariablesAccessModifiers.level1;

public class PersonMain {
      public static void main(String[] args) {
        // Create a person using parameterized constructor
        PersonClass p1 = new PersonClass("Amit", 25);
        p1.show();

        // Create a copy of p1 using copy constructor
        PersonClass p2 = new PersonClass(p1);
        p2.show();

        // Another example
        PersonClass p3 = new PersonClass("Rohit", 30);
        p3.show();

        PersonClass p4 = new PersonClass(p3); // Copying p3
        p4.show();
    }
    
}
