package JavaClassAndObject.level1;

class ClassItem {
    int code;
    String name;
    double price;

    ClassItem(int code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    double getTotal(int qty) {
        return price * qty;
    }

    void display() {
        System.out.println("Code: " + code);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}

