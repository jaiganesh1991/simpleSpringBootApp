package com.jaiganesh.simpleSpringBootApp.books;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {

	//This creates a singleton instance of the BooksService class to access the data within
	@Autowired
	private BooksService booksService;
	
	//This creates a mapping of HTTP GET request and gets the list of books from BooksService
	@RequestMapping("/books")
	public List<Booklist> getbooksController() {
		return booksService.getAllBookService();
	}

	//This creates a mapping of HTTP GET request and gets the particular book from BooksService
	@RequestMapping("/books/{book}")
	public Booklist getbookController(@PathVariable String book) {
		
		return booksService.getbook(book);
	}
	
	//This creates a POST request mapping to add Books to the List of Books
	@RequestMapping(method=RequestMethod.POST, value="/books")
	public void addbookController(@RequestBody Booklist book) {
		
		booksService.addbook(book);
	}
	
	//This updates the details of the book
	@RequestMapping(method=RequestMethod.PUT, value="/updatebook/{book}")
	public void updatebookController(@RequestBody Booklist updatebook, @PathVariable String book ) {
		
		booksService.updatebook(updatebook, book);
	}
	
	//This updates the details of the book
		@RequestMapping(method=RequestMethod.DELETE, value="/deletebook/{book}")
		public void deletebookController(@PathVariable String book ) {
			
			booksService.deletebook(book);
		}
}
