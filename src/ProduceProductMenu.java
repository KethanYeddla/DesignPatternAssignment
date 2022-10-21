public class ProduceProductMenu implements ProductMenu {
	//Using this class we are implementing the show menu function
	//Here we show the menu when user selects option for produce
	public void showMenu(Facade facade)  {
		System.out.println("//** Implementation of Iterator **//");
		System.out.println("Produce Menu");
		int num = 1;
		ProductIterator iterator = facade.theProductList.getProdulctIterator();
		while (iterator.hasNext()) {
			Product p = (Product) iterator.next();
			if (p.category.equals("produce")) {
				System.out.println(num + " : " + p.name);
				num++;
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
