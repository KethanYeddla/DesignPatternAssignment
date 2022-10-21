import java.io.*;
import java.util.ListIterator;

public class MeatProductMenu implements ProductMenu {
//Using this class we are implementing the show menu function
//Here we show the menu when user selectst option for meat
    public void showMenu(Facade facade) {
        System.out.println("//** Implementation of Iterator **//");
        System.out.println("Meat Menu");
        int num = 1;
        ProductIterator iterator = facade.theProductList.getProdulctIterator();
        while (iterator.hasNext()) {
            Product p = (Product) iterator.next();
            if (p.category.equals("Meat")) {
                System.out.println(num + " : " + p.name);
                num++;
            }
        }
    }


    public void showAddButton() {

    }

    public void showViewButton() {

    }

    public void showRadioButton() {

    }

    public void showLabels() {

    }

    public void showComBoxes() {

    }

}
