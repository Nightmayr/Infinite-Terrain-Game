import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class LibraryTest {
	
	Book book1;
	Library library;
	GovDocs doc1;
	Maps map1;
	
	@Test @Ignore
	public void fail() {
		fail();
	}
	
	@Before
	public void setup() {
		library = new Library();
		book1 = new Book("Umayr Saghir", 100, 1993, true, "Sci-Fi", false, "Penguin");
//		doc1 = new GovDocs();
//		map1 = new Maps();
		
	}
	
	@Test
	public void test1() {
		library.addItem(book1);
		assertEquals(1, library.listSize(book1));
		
	}
	
	
	
}
