import java.io.*;
import java.util.ArrayList;

public class ClassProductList extends ArrayList {

	private ReminderVisitor reminderVisitor;

	private Product[] product;

	private ProductIterator productIterator;

	public ClassProductList(){
		this.productIterator = new ProductIterator(this);
	}

	public void accept(NodeVisitor visitor) {

	}

	public ProductIterator getProductIterator() {
		return productIterator;
	}

	public void loadFromFile() throws IOException {
		File file = new File("./src/ProductInfo.txt");
		BufferedReader br
				= new BufferedReader(new FileReader(file));
		String st;
		System.out.println("Produce Menu");
		while ((st = br.readLine()) != null) {
			String[] usercredsplit = st.split(":");
			this.add(new Product(usercredsplit[0], usercredsplit[1], this));
		}
	}
	}
