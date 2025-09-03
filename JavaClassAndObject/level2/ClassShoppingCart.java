package JavaClassAndObject.level2;

class ClassShoppingCart {
    String item;
    double price;
    int qty;

    ClassShoppingCart(String item, double price, int qty) {
        this.item = item;
        this.price = price;
        this.qty = qty;
    }

    void add(int addQty) {
        qty += addQty;
    }

    void remove(int remQty) {
        if (remQty <= qty) qty -= remQty;
    }

    double getTotal() {
        return price * qty;
    }

    void display() {
        System.out.println("Item: " + item);
        System.out.println("Price: " + price);
        System.out.println("Qty: " + qty);
        System.out.println("Total: " + getTotal());
    }
}
