import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReminderVisitor extends NodeVisitor {

	private Reminder m_Reminder;

	private ClassProductList classProductList;

	public void visitProduct(Product product) {

	}

	public void visitTrading(Trading trading, String loggedInUser) throws IOException {
		File file = new File("./src/UserProduct.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line;
		while ((line = br.readLine()) != null) {
			String[] split = line.split(":");
			if (split[0].equals(loggedInUser)) {
				System.out.println(split[1]);
			}
		}

	}

	public void visitFacade(Facade facade) {

	}

}
