package mediatheque;


import java.util.LinkedList;
import java.util.List;


public class Mediatheque {
	private final List<Item> items = new LinkedList<>();

	private final CatalogueVisitor catalogueVisitor = new CatalogueVisitor();

	private final BookVisitor bookVisitor  = new BookVisitor();

	private final CDVisitor cdVisitor = new CDVisitor();


	public void addItem(Item i) {
		items.add(i);
	}
	
	public void printCatalog() {
		for (Item i : items)
			i.accept(catalogueVisitor);
	}
	
	public void printOnlyBooks() {
		for (Item i : items)
			i.accept(bookVisitor);
		/*
		//avec instanceof
		for (Item i : items)
			if (i instanceof Book)
				System.out.println(i);
		*/
	}

	public void printOnlyCDs() {
		for (Item i : items)
			i.accept(cdVisitor);
	}

}
