package com.galvanize.tmo.paspringstarter.dao;

import java.util.List;
import java.util.UUID;

import com.galvanize.tmo.paspringstarter.model.Book;

public interface BookDao {

	int insertBook(int id, Book book);
	
	default Book insertBook(Book book) {
		//int id = UUID.randomUUID();
        UUID idOne = UUID.randomUUID();
        String str=""+idOne;        
        int id=str.hashCode();
		if(insertBook(id, book) == 1) {
			book.setId(id);
		}
		return book;
//		System.out.println("ID: " + id);		
//		System.out.println(insertBook(id,book));
//		return insertBook(id, book);
		
	}
	
	List<Book> selectAllBooks();
	
	int deleteAllBooks();
}
