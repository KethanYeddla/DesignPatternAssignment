import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Facade facade = new Facade();
        System.out.println(".............//** Facade Pattern Implementation **//................");
        //To check whether user has successfully logged in
        if (facade.login()) {
            System.out.println("...................//**Bridge Pattern Implementation**//..................");
            while(true) {
                System.out.println();
                System.out.println("What do you want to do?");
                System.out.println("1. View Products");
                System.out.println("2. View Offerings");
                System.out.println("3. Logout");
                Scanner s = new Scanner(System.in);
                int input = Integer.parseInt(s.next());
                // Loop for showing options
                if (input == 1) {
                    facade.createProductList();
                    facade.viewOffering();
                } else if (input == 2) {
                    facade.createProductList();
                    facade.viewTrading();
                } else if (input == 3) {
                    break;
                }
            }
        }
    }
};