package nl.siegmann.epublib.viewer;
import nl.siegmann.epublib.domain.Book;

public class SuperViewer extends Viewer {

	public SuperViewer(Book book) {
		super(book);
		// TODO Auto-generated constructor stub
	}

	String ourproperty;

	public static void main(String[] args) {
		SuperViewer viewer = new SuperViewer(new Book());

	}

}
