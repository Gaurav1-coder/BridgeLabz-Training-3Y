package ObjectOrientedDesignPrinciples.ClassObjectAndSequeneceDiagram;

public class BillGeneratorClass {
      public double generateBill(CustomerClass customer) {
        double total = 0;
        for (ProductClass p : customer.getPurchasedProducts()) {
            total += p.getSubtotal();
        }
        return total;
    }
}
