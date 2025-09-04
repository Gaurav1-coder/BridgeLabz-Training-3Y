package JavaConstructorsInstancevsClassVariablesAccessModifiers.level1;

public class PersonClass {
     String n;   // name
    int a;      // age

    PersonClass(String n, int a) { // Parameterized constructor
        this.n = n;
        this.a = a;
    }

    PersonClass(PersonClass p) { // make Copy constructor
        this.n = p.n;
        this.a = p.a;
    }

    void show() {
        System.out.println("Person: " + n + ", Age: " + a);
    }
    
}
