import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import javax.swing.*;
//Using this we are authenticating the login credentials
// Using this we are knowing whether the user is known or not
public class Login  extends JFrame implements ActionListener {
    int userType;
    String userName;
    public boolean login() throws IOException{
        Scanner s = new Scanner(System.in);
        System.out.println("Select the type of user");
        System.out.println("0 -> Buyer \n1 -> Seller");
        userType = s.nextInt();
        s.nextLine();
        // Implementation of Facade Pattern
        // Dividing the UserType based on the input
        // If userType is '0' then user is a Buyer
        //If userType is '1' then user is a seller
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

            //Getting login credentials from the user
            //Bridge pattern is implemented here
            System.out.println("Enter Username");
            String Username = s.nextLine();
            System.out.println("Enter Password");
            String Password = s.nextLine();
            // Verifying the login credentials from the given input
            if (users.containsKey(Username) && users.get(Username).equals(Password)) {
                this.userName = Username;
                return true;
            } else {
                System.out.print("Invalid Credentials");
                System.exit(1);
                return false;
            }
            }
        else {
            File file = new File("./src/SellerInfo.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
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
            // Verifying the login credentials from the given input
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
