package com.galvanize.tmo.paspringstarter.api;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.galvanize.tmo.paspringstarter.model.Book;
import com.galvanize.tmo.paspringstarter.service.BookService;

@RequestMapping("//api/books")
@RestController
public class BookController {

	private final BookService bookService;

	@Autowired
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public List<Book> addBook(@RequestBody Book book) {
		bookService.addBook(book);
		return bookService.getAllBooks();
	}
	
	@GetMapping
	public List<Book> getAllBooks(){
		
		List<Book> books = bookService.getAllBooks();

		Collections.sort(books, new Comparator<Book>(){

			@Override
			public int compare(Book b1, Book b2) {
				return b1.getTitle().compareTo(b2.getTitle());
			}
		});
		return books;
	}
	
	@DeleteMapping
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteAllBooks() {
		bookService.deleteAllBooks();
	}
	
}
