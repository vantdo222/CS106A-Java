/*
 * The Library Record class keeps track of the following
 * information for a library book: the title, the author, the
 * library of congress catalog number, the publisher, the year
 * of publication, whether the book is circulating or
 * noncirculating. All of this information is entirely private
 * to the class. Clients can obtain this information only by
 * using the various methods defined in the class.
 */

public class LibraryRecord {
	
	/**
	 * Creates a new Library Record object with specified
	 * title, author, catalog number, publisher, year of 
	 * publication, and whether it is circulating
	 * @param title The Record's title as a String
	 * @param author The Record's author as a String
	 * @param number The Record's catalog number as an Integer
	 * @param publisher The Record's publisher as a String
	 * @param year The Record's year of publication as an Integer
	 * @param circulating Whehther the book is circulating
	 */
	public LibraryRecord(String title, String author, int number, String publisher, int year, boolean circulating) {
		bookTitle = title;
		bookAuthor = author;
		bookNumber = number;
		bookPublisher = publisher;
		yearOfPublication = year;
		bookCirculate = circulating;
	}
	
	/**
	 * Creates a new Library Record object with specified
	 * title, author, catalog number, publisher, year of 
	 * publication and initializes the book to be circulating
	 * @param title The Record's title as a String
	 * @param author The Record's author as a String
	 * @param number The Record's catalog number as an Integer
	 * @param publisher The Record's publisher as a String
	 * @param year The Record's year of publication as an Integer
	 */
	public LibraryRecord(String title, String author, int number, String publisher, int year) {
		bookTitle = title;
		bookAuthor = author;
		bookNumber = number;
		bookPublisher = publisher;
		yearOfPublication = year;
		setCirculation(true);
	}
	
	/**
	 * Gets the title of this record
	 * @return The title of this record
	 */
	public String getTitle() {
		return bookTitle;
	}
	
	/**
	 * Gets the author name of this record
	 * @return The author name of this record
	 */
	public String getAuthor() {
		return bookAuthor;
	}
	
	/**
	 * Gets the catalog number of this record
	 * @return The catalog number of this record
	 */
	public int getNumber() {
		return bookNumber;
	}
	
	/**
	 * Gets the publisher of this record
	 * @return the publisher of this record
	 */
	public String getPublisher() {
		return bookPublisher;
	}
	
	/**
	 * Gets the year of publication of this record
	 * @return The year of publication of this record
	 */
	public int getYear() {
		return yearOfPublication;
	}
	
	/**
	 * Return whether the record is circulating
	 * @return Whether the record is circulating
	 */
	public boolean isCirculating() {
		return bookCirculate;
	}
	
	/**
	 * Sets whether the book is circulating
	 * @param flag The value true or false indicating circulation status
	 */
	public void setCirculation(boolean flag) {
		bookCirculate = flag;
	}
	
	/**
	 * Creates a string representation of this record
	 * @return The string used to display this record
	 */
	public String toString() {
		return bookTitle + " (" + bookNumber + ")" + " was written by " + bookAuthor
				+ " and was published by " + bookPublisher + " in " + yearOfPublication;
	}
	
	// Private instance variables
	
	private String bookTitle;        // The book's title
	private String bookAuthor;       // The book's author
	private int bookNumber;          // The boook's catalog number
	private String bookPublisher;    // The book's publisher
	private int yearOfPublication;   // The book's year of publication
	private boolean bookCirculate;       // Whether the book is circulating 

}
