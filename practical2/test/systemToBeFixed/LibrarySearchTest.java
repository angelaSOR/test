/**
 * 
 */
package systemToBeFixed;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author angela
 *
 */
class LibrarySearchTest {
	// test data
	Book book1, book2, book3;
	ArrayList<Book> testList;
	int ratingValid1, ratingValid2, ratingValid3;
	String ISBNValid1, authorValid1, titleValid1, ISBNValid2, authorValid2, titleValid2, ISBNValid3, authorValid3, titleValid3; 
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		ISBNValid1 = "ISBNB1AAAA";
		ISBNValid2 = "ISBNB2AAAA";
		ISBNValid3 = "ISBNB3AAAA";
		
		authorValid1 = "authorValid1";
		authorValid2 = "authorValid2";
		authorValid3 = "authorValid3";
		
		titleValid1 = "titleValid1";
		titleValid2 = "titleValid2";
		titleValid3 = "titleValid3";
		
		ratingValid1 = 5;
		ratingValid2 = 4;
		ratingValid3 = 3;
		
		book1 = new Book(ISBNValid1, authorValid1, titleValid1, ratingValid1);
		book2 = new Book(ISBNValid2, authorValid2, titleValid2, ratingValid2);
		book3 = new Book(ISBNValid3, authorValid3, titleValid3, ratingValid3);
		
		testList = new ArrayList<Book>();
		testList.add(book1);
		testList.add(book2);
		testList.add(book3);
		
	}

	@Test
	void searchByTitleTest() {
		ArrayList<Book> testSearch = LibrarySearch.searchByTitle(testList, titleValid1);
		if (testSearch.contains(book1)) {
			assertTrue(true);
		}else {
			assertTrue(false);
		}
	}
	
	@Test
	void searchByAuthorTest() {
		ArrayList<Book> testSearch = LibrarySearch.searchByAuthor(testList, authorValid1);
		if (testSearch.contains(book1)) {
			assertTrue(true);
		}else assertTrue(false);
	}
	
	@Test
	void searchByRatingTest() {
		ArrayList<Book> testSearch = LibrarySearch.searchByRating(testList, ratingValid1);
		if (testSearch.contains(book1)) {
			assertTrue(true);
		}else assertTrue(false);
	}
	
	@Test
	void searchByISBN() {
		ArrayList<Book> testSearch = LibrarySearch.searchByISBN(testList, ISBNValid1);
		if (testSearch.contains(book1)) {
			assertTrue(true);
		}else assertTrue(false);
	}

}
