

public class Product {

	private Trading trading;

	private ClassProductList classProductList;
	public String category;
	public String name;

	public Product(String s, String s1, ClassProductList classProductList) {
		this.category = s;
		this.name = s1;
		this.classProductList = classProductList;
	}
}
