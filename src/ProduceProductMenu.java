import java.io.*;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class ProduceProductMenu implements ProductMenu {

	public void showMenu() throws IOException {
			File file = new File("./src/ProductInfo.txt");
			BufferedReader br
					= new BufferedReader(new FileReader(file));
			String st;
			System.out.println("Produce Menu");
			while ((st = br.readLine()) != null) {
				String[] usercredsplit = st.split(":");
				if (usercredsplit[0].equals("Produce")) {
					System.out.println(usercredsplit[1]);
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
