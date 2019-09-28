package com.jaiganesh.simpleSpringBootApp.books;





import org.springframework.web.bind.annotation.RestController;

@RestController
public class Booklist {

	private String bookName;
	private String Author;
	private String Genre;
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public String getGenre() {
		return Genre;
	}
	public void setGenre(String genre) {
		Genre = genre;
	}
	public Booklist() {
	
		
	}
	public Booklist(String bookName, String author, String genre) {
		super();
		this.bookName = bookName;
		Author = author;
		Genre = genre;
	}

}
