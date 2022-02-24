package com.galvanize.tmo.paspringstarter.dao;

import java.util.List;
import java.util.UUID;

import com.galvanize.tmo.paspringstarter.model.Book;

public interface BookDao {

	int insertBook(UUID id, Book book);
	
	default int insertBook(Book book) {
		UUID id = UUID.randomUUID();
		return insertBook(id, book);
	}
	
	List<Book> selectAllBooks();
	
	int deleteAllBooks();
}
