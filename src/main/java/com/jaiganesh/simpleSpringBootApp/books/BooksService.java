package com.jaiganesh.simpleSpringBootApp.books;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BooksService {
	
	@Autowired
	private BookRepository bookRepository;
	
	
	//private List<Booklist> booklist =  new ArrayList <> (Arrays.asList(
		//	new Booklist("Harry Potter","J K Rowling","Magical Book"),
		//	new Booklist("Inheritance", "Christoper Paloni", "Dragon Book"),
		//	new Booklist("Game of Thrones", "R R Martin", "Kingdom Book"),
		//	new Booklist("Julius Ceaser","Shakespeare","Kings and Betrayal")
		//	));
	
	public List<Booklist> getAllBookService() {
		//return booklist;
		//Replacing the old method with CrudRepository calls
		//Creating a Arraylist for books and adding all the List into it with forEach method and add method
		List<Booklist> books = new ArrayList <Booklist>();
		bookRepository.findAll().forEach(books::add);
		return books;
	}
	
	//Returns the details of the book
	public Booklist getbook(String book) {
		//lambda expression to return the select book
		//return booklist.stream().filter(books -> books.getBookName().equals(book)).findFirst().get();
		return bookRepository.findById(book).get();
		
	}

	//Adds the book to existing arraylist
	public void addbook(Booklist book) {
		//booklist.add(book);
		//Adding the Database call here to add the book object
		bookRepository.save(book);
	}

	//Updates the existing entry of book
	public void updatebook(Booklist updatebook, String book) {
		//Booklist toUpdatebook = getbook(book);
		//booklist.set(booklist.indexOf(toUpdatebook), updatebook);
		//Calling the same save method updates the book
		bookRepository.save(updatebook);
	}

	//Deletes the given book
	public void deletebook(String book) {
		//booklist.remove(booklist.indexOf(getbook(book)));
		//Replacing the delete with CrudRepository call
		bookRepository.deleteById(book);
	}

}
