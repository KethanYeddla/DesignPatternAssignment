import java.util.Scanner;

public class Buyer extends Person {

    @Override
    void showMenu() {

    }

    @Override
    // Using this method we segregate the products into two categories
    // that is meat and produce
    ProductMenu CreateProductMenu() {
        while (true) {
            System.out.println("Select the type  of the product");
            Scanner s = new Scanner(System.in);
            String productType = s.nextLine();
            if (productType.equals("meat")) {
                return new MeatProductMenu();
            } else if (productType.equals("produce")) {
                return new ProduceProductMenu();
            } else {
                System.out.println("Invalid Product Type");
            }
        }
    }
}
