package inheritanceassigment;

public class LibraryBook {
	
	protected int bookId;
	protected String title;
	protected String author;
	
	public LibraryBook() {
		
	}
	
	public LibraryBook(int bookId, String title, String author) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
	}
	
	void displayLibraryBookDetails() {
		System.out.println("Book Id: "+bookId);
		System.out.println("Book Title: "+title);
		System.out.println("Author: "+author);
	}
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	

}
