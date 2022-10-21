import java.awt.print.PrinterGraphics;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Facade facade = new Facade();
        System.out.println(".............//** Facade Pattern Implementation **//................");
        if (facade.login()) {
            System.out.println("...................//**Bridge Pattern Implementation**//..................");
            do {
                System.out.println();
                System.out.println("What do you want to do?");
                System.out.println("1. View Products");
                System.out.println("2. View Offerings");
                System.out.println("3. Logout");

                Scanner s = new Scanner(System.in);
                int input = Integer.parseInt(s.next());

                if (input == 1) {
                    facade.createProductList();
                    facade.viewOffering();
                } else if (input == 2) {
                    facade.createProductList();
                    facade.viewTrading();
                } else {
                    break;
                }
            }
            while (true);
            facade.createProductList();
            facade.viewOffering();
        }
    }
}