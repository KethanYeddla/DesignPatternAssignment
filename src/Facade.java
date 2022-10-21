import java.io.IOException;
import java.util.Scanner;

public class Facade {

	private String loggedInUser;

	private int UserType;

	private Product theSelectedProduct;

	private int nProductCategory;

	public ClassProductList theProductList;

	private Person thePerson;

	public Facade() {
		this.theProductList = new ClassProductList();
	}
	//implemented the Bridge pattern here
	// This function returns true on successful login of the user
	public boolean login() throws IOException {
		boolean is_success;
		Login credentials = new Login();
		if (credentials.userType == 1) thePerson = new Seller();
		else thePerson = new Buyer();
		is_success=credentials.login();
		loggedInUser = credentials.userName;
		return is_success;
	}

	public void addTrading() {

	}
	// Visitor pattern is implemented here
	// THis functin is used to return the products which can be traded
	public void viewTrading() {
		System.out.println(".................//** Visitor Pattern Implementation **//.........................");
		Trading t = new Trading(this);

		ReminderVisitor rv = new ReminderVisitor();
		try {
			rv.visitTrading(t, loggedInUser);
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
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
	//Factory pattern is implemented here
	//It is used to load the Products
	void createProductList() throws IOException {
		System.out.println("\n .................//**Factory Pattern Implementation/**//................\n");
		this.theProductList = new ClassProductList();
		this.theProductList.loadFromFile();
	}


}
