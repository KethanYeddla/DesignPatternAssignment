import java.io.IOException;

public abstract interface ProductMenu {

	public void showMenu(Facade facade);

	public abstract void showAddButton();

	public abstract void showViewButton();

	public abstract void showRadioButton();

	public abstract void showLabels();

	public abstract void showComBoxes();

}
