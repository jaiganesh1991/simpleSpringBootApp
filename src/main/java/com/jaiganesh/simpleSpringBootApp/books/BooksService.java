package com.jaiganesh.simpleSpringBootApp.books;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class BooksService {
	
	private List<Booklist> booklist =  new ArrayList <> (Arrays.asList(
			new Booklist("Harry Potter","J K Rowling","Magical Book"),
			new Booklist("Inheritance", "Christoper Paloni", "Dragon Book"),
			new Booklist("Game of Thrones", "R R Martin", "Kingdom Book"),
			new Booklist("Julius Ceaser","Shakespeare","Kings and Betrayal")
			));
	
	public List<Booklist> getAllBookService() {
		return booklist;
	}
	
	//Returns the details of the book
	public Booklist getbook(String book) {
		//lambda expression to return the select book
		return booklist.stream().filter(books -> books.getBookName().equals(book)).findFirst().get();
		
		
	}

	//Adds the book to existing arraylist
	public void addbook(Booklist book) {
		booklist.add(book);
		
	}

	//Updates the existing entry of book
	public void updatebook(Booklist updatebook, String book) {
		Booklist toUpdatebook = getbook(book);
		booklist.set(booklist.indexOf(toUpdatebook), updatebook);
		
	}

	//Deletes the given book
	public void deletebook(String book) {
		booklist.remove(booklist.indexOf(getbook(book)));
		
	}

}
