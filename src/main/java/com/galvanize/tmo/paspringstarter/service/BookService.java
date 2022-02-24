package com.galvanize.tmo.paspringstarter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.galvanize.tmo.paspringstarter.dao.BookDao;
import com.galvanize.tmo.paspringstarter.model.Book;

@Service
public class BookService {
	
	private final BookDao bookDao;
	
	@Autowired
	public BookService(@Qualifier("fakeDao") BookDao bookDao) {
		this.bookDao = bookDao;
	}
	
	public int addBook(Book book) {
		return bookDao.insertBook(book);
	}

	public List<Book> getAllBooks() {
		return bookDao.selectAllBooks();
	}
	
	public int deleteAllBooks() {
		return bookDao.deleteAllBooks();
	}
	
}
