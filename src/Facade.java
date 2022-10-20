import java.io.IOException;
import java.util.Scanner;

public class Facade {

	private int UserType;

	private Product theSelectedProduct;

	private int nProductCategory;

	private ClassProductList theProductList;

	private Person thePerson;

	public boolean login() throws IOException {
		Login credentials = new Login();
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

	public void createProductList() {


	}

	public void AttachProductToUser() {

	}

	public Product SelectProduct() {

		return null;
	}

	public void productOperation() {

	}
	public void viewOffering() throws IOException {
		System.out.println("Select Product Category");
		System.out.println("0: Meat \n1: Produce");
		Scanner s = new Scanner(System.in);
		nProductCategory = s.nextInt();
		if(nProductCategory == 0){
			new MeatProductMenu().showMenu();
		}
		else if(nProductCategory==1) {
			new ProduceProductMenu().showMenu();
		}
		else {
			System.out.println("Incorrect input");
		}


	}
}
