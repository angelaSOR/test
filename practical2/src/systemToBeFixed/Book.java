package systemToBeFixed;

/**
 * Book class - represents a book in the system
 * 
 * @author amcgowan
 */
public class Book {

	/**
	 * The book's ISBN
	 */
	private String ISBN;

	/**
	 * The autor of the book
	 */
	private String author;

	/**
	 * The title of the book
	 */
	private String title;

	/**
	 * ADDITIONAL FIELD rating of the book - Valid values 1 to 5
	 */
	private int rating;
	//constant
	private final int ISBN_LOW =10;
	private final int ISBN_HIGH =13;
	
	
	//constructor
	
	/**
	 * Default constructor
	 */
	public Book() {

	}
	
	/**
	 * constructor with arguments
	 * @param ISBN
	 * @param author
	 * @param title
	 * @param rating
	 */
	public Book(String ISBN, String author, String title, int rating) {
		try {
			this.setTitle(title);
			this.setAuthor(author);
			this.setRating(rating);
			this.setISBN(ISBN);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
// getters & setters
	/**
	 * gets the rating
	 * 
	 * @return
	 */
	public int getRating() {
		return rating;
	}

	/**
	 * sets the rating - Valid values 1 to 5
	 * 
	 * @param rating
	 * @throws Exception 
	 */
	public void setRating(int rating) throws Exception {
		if (rating <1 || rating >5) {
			throw new Exception("invalid number");
		}else {
			this.rating = rating;
		}
	}

	/**
	 * Gets the ISBN number
	 * 
	 * @return
	 */
	public String getISBN() {
		return ISBN;
	}

	/**
	 * Sets the ISBN number - valid numbers: 10 or 13
	 * 
	 * @param iSBN 10 or 13 chars
	 * @throws Exception
	 */
	public void setISBN(String iSBN) throws Exception {
		if (iSBN.length() == ISBN_HIGH || iSBN.length() == ISBN_LOW) {
			this.ISBN = iSBN;
		} else {
			throw new Exception("invalid ISBN");
		}

	}

	/**
	 * Get the book's author
	 * 
	 * @return
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * Sets the book's author
	 * 
	 * @param author
	 * @throws Exception 
	 */
	public void setAuthor(String author) throws Exception {
		if (author.length()<1) {
			throw new Exception("invalid author");
			
		} else {
			this.author = author;
		}
		

	}

	/**
	 * Gets the book's title
	 * 
	 * @return
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the books title - At least 1 character
	 * 
	 * @param title
	 */
	public void setTitle(String title) throws Exception {
		if (title.length() < 1) {
			throw new Exception("invalid title");
		} else {
			this.title = title;
		}
		

	}

	

}
