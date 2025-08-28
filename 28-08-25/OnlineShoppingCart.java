import java.util.*;

public class OnlineShoppingCart {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char more = 'y';

    while(more=='y') {
      int total=0, n;

      do {
        System.out.print("No. of products: ");
        n = sc.nextInt();
      } while(n<1);

      for(int i=1;i<=n;i++) {
        System.out.print("Enter product name: ");
        String name = sc.next();
        System.out.print("Enter price of " + name + ": ");
        int price = sc.nextInt();
        total += price;
      }

      if(total>5000) total -= total/10;

      System.out.println("Bill = " + total);

      System.out.print("Next customer? (y/n): ");
      more = sc.next().charAt(0);
    }

    System.out.println("Thanks for Shopping!");
  }
}