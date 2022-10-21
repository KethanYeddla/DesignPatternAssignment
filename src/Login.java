import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import javax.swing.*;

public class Login  extends JFrame implements ActionListener {
    int userType;
    public boolean login() throws IOException{
        Scanner s = new Scanner(System.in);
        System.out.println("Select the type of user");
        System.out.println("0 -> Buyer \n1 -> Seller");
        userType = s.nextInt();
        s.nextLine();

        if (userType == 0) {
            File file = new File("./src/BuyerInfo.txt");
            BufferedReader br
                    = new BufferedReader(new FileReader(file));
            String st;
            Map<String, String> users = new HashMap<>();

            while ((st = br.readLine()) != null) {
                String[] usercredsplit = st.split(":");
                users.put(usercredsplit[0], usercredsplit[1]);
            }

            System.out.println("Enter Username");
            String Username = s.nextLine();
            System.out.println("Enter Password");
            String Password = s.nextLine();
            if (users.containsKey(Username) && users.get(Username).equals(Password)) {
                return true;
            } else {
                System.out.print("Invalid Credentials");
                System.exit(1);
                return false;
            }
            }
        else {
            File file = new File("./src/SellerInfo.txt");
            BufferedReader br
                    = new BufferedReader(new FileReader(file));
            String st;
            Map<String, String> users = new HashMap<>();

            while ((st = br.readLine()) != null) {
                String[] usercredsplit = st.split(":");
                users.put(usercredsplit[0], usercredsplit[1]);
            }
            System.out.println("Enter Username:");
            String Username = s.nextLine();
            System.out.println("Enter Password");
            String Password = s.nextLine();
            if (users.containsKey(Username) && users.get(Username).equals(Password)) {
                System.out.println("Logged in");
                return true;
            } else {
                System.out.print("Invalid Credentials");
                System.exit(1);
                return false;
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
