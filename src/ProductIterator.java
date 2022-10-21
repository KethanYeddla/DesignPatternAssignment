import java.util.ListIterator;

public class ProductIterator implements ListIterator{
	private final ClassProductList classProductList;
	private int index;
	private String item;

	public ProductIterator(ClassProductList plist) {
		classProductList = plist;
		index = 0;
	}

	public boolean hasNext() {
		boolean hasElement = false;
		if (this.index < classProductList.size()){
			return true;
		}
		return false;
	}

	@Override
	public Object next() {
		if (this.hasNext()){
			Product p = (Product) classProductList.get(index);
			index = index+1;
			return p;
		}
		return null;
	}

	@Override
	public boolean hasPrevious() {
		return false;
	}

	@Override
	public Object previous() {
		return null;
	}

	@Override
	public int nextIndex() {
		return 0;
	}

	@Override
	public int previousIndex() {
		return 0;
	}

	@Override
	public void remove() {

	}

	@Override
	public void set(Object o) {

	}

	@Override
	public void add(Object o) {

	}

	public Product Next() {
		return null;
	}

	public void MoveToHead() {

	}

	public void Remove() {

	}

}
