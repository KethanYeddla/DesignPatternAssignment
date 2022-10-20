import java.io.*;

public abstract class Person implements ProductMenu {

	private ProductMenu theProductMenu;

	private Buyer buyer;

	private ProductMenu productMenu;

	public void showMenu() throws IOException {
		File file = new File("./src/UserProduct.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String st;
		System.out.println("Bid items");
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

	public ProductMenu CreateProductMenu() {
		return null;
	}

}
