import java.io.*;

public abstract class Person {

	private ProductMenu theProductMenu;

	private Buyer buyer;

	private ProductMenu productMenu;

	abstract void showMenu();

	public void showAddButton() {

	}

	public void showViewButton() {

	}

	public void showRadioButton() {

	}

	public void showLabels() {

	}

	abstract ProductMenu CreateProductMenu() ;

}
