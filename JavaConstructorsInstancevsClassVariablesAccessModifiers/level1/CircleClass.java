package JavaConstructorsInstancevsClassVariablesAccessModifiers.level1;

public class CircleClass {
      double r;   // radius

    CircleClass() {
        this(1.0); // chaining this
    }

    CircleClass(double r) {
        this.r = r;
    }

    double area() {
        return Math.PI * r * r;
    }
    
}
