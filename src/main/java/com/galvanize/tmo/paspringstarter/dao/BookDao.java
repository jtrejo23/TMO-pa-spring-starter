package com.galvanize.tmo.paspringstarter.dao;

import java.util.List;
import java.util.UUID;

import com.galvanize.tmo.paspringstarter.model.Book;

public interface BookDao {

	Book insertBook(int id, Book book);
	
	default Book insertBook(Book book) {
        UUID idOne = UUID.randomUUID();
        String str=""+idOne;        
        int id=str.hashCode();
		return insertBook(id,book);
	}
	
	List<Book> selectAllBooks();
	
	int deleteAllBooks();
}
