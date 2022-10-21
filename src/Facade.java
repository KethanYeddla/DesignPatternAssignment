import java.io.IOException;
import java.util.Scanner;

public class Facade {

	private int UserType;

	private Product theSelectedProduct;

	private int nProductCategory;

	public ClassProductList theProductList;

	private Person thePerson;

	public Facade() {
		this.theProductList = new ClassProductList();
	}

	public boolean login() throws IOException {
		Login credentials = new Login();
		if (credentials.userType == 1) thePerson = new Seller();
		else thePerson = new Buyer();
		return credentials.login();
	}

	public void addTrading() {

	}

	public void viewTrading() {

	}

	public void decideBidding() {

	}

	public void discussBidding() {

	}

	public void submitBidding() {

	}

	public void remind() {

	}

	public void createUser(UserInfoItem userinfoitem) {

	}

	public void AttachProductToUser() {

	}

	public Product SelectProduct() {

		return null;
	}

	public void productOperation() {

	}
	public void viewOffering() throws IOException {
		ProductMenu allProds  = thePerson.CreateProductMenu();
		allProds.showMenu(this);
	}
	void createProductList() throws IOException {
		System.out.println("\n //**Factory Pattern Implementation/**//");
		this.theProductList = new ClassProductList();
		this.theProductList.loadFromFile();
	}


}
