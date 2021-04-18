/**
 * 
 */
package systemToBeFixed;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author angela
 *
 */
class BookTest {
	// test data
	Book book;
	int ratingValid, ratingException;
	String ISBNValid, ISBNException, authorValid, authorException, titleValid, titleException;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		book = new Book();
		ISBNValid = "ISBNB1AAAA";
		ISBNException = "ISBN";
		authorValid = "Dusty";
		authorException = null;
		titleValid = "Dusty Land";
		titleException = null;
		ratingValid = 5;
		ratingException = 6;
	}

// test constructor with args
	////////////////////////////////////////////////////////////////////////////////////////

	/**
	 * Test constructor with valid args
	 */
	@Test
	void constructorArgTest() {
		Book bookConstructor = new Book(ISBNValid, authorValid, titleValid, ratingValid);
		assertEquals(ISBNValid, bookConstructor.getISBN());
		assertEquals(authorValid, bookConstructor.getAuthor());
		assertEquals(titleValid, bookConstructor.getTitle());
		assertEquals(ratingValid, bookConstructor.getRating());
		
	}
	
	/**
	 * Test constructor with invalid args
	 */
	@Test
	void constructorArgInvalidTest() {
		assertThrows(Exception.class, () -> {
			Book b = new Book(ISBNException, authorValid, titleValid, ratingValid);
		});
		assertThrows(Exception.class, () -> {
			Book b = new Book(ISBNValid, authorException, titleValid, ratingValid);
		});
		assertThrows(Exception.class, () -> {
			Book b = new Book(ISBNValid, authorValid, titleException, ratingValid);
		});
		assertThrows(Exception.class, () -> {
			Book b = new Book(ISBNValid, authorValid, titleValid, ratingException);
		});
		
		
		
	}
	
	
// rating
	@Test
	void getSetRating() {
		
		try {
			book.setRating(ratingValid);
			assertEquals(ratingValid, book.getRating());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	@Test
	void SetRatingException() {
		Exception exception = assertThrows(Exception.class, ()->{
			book.setRating(ratingException);
		});
		assertEquals("invalid number", exception.getMessage());
	}
	
//ISBN
	@Test
	void getSetISBN() {
		try {
			book.setISBN(ISBNValid);
			assertEquals(ISBNValid, book.getISBN());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	void SetISBNException() {
		
		Exception exception = assertThrows(Exception.class, ()->{
			book.setISBN(ISBNException);
		});
		assertEquals("invalid ISBN", exception.getMessage());
		
	}
	
//author
	@Test
	void getSetAuthor() {
		try {
			book.setAuthor(authorValid);
			assertEquals(authorValid, book.getAuthor());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	void SetAuthorException() {
		Exception exception = assertThrows(Exception.class, ()->{
			book.setAuthor(authorException);
		});
		//assertEquals("invalid author", exception.getMessage());
	}
	
//title
	
	@Test
	void getSetTitle() {
		try {
			book.setTitle(titleValid);
			assertEquals(titleValid, book.getTitle());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	void SetTitleException() {
		Exception exception = assertThrows(Exception.class, ()->{
			book.setTitle(titleException);
		});
		assertEquals("invalid title", exception.getMessage());
	}
}















