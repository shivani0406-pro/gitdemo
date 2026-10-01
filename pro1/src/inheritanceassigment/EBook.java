package inheritanceassigment;

public class EBook extends LibraryBook{

	protected double fileSize;
	protected String format;
	
	public EBook() {
		
	}
	
	public EBook(double fileSize, String format) {
		super();
		this.fileSize = fileSize;
		this.format = format;
	}
	
	public EBook(int bookId, String title, String author,double fileSize, String format) {
		super(bookId,title,author);
		this.fileSize = fileSize;
		this.format = format;
	}
	
	void displayEbookDetails() {
		displayLibraryBookDetails();
		System.out.println("File Size: "+fileSize);
		System.out.println("Format: "+format);
	}

	public double getFileSize() {
		return fileSize;
	}

	public void setFileSize(double fileSize) {
		this.fileSize = fileSize;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}
	
	
	
	
}
