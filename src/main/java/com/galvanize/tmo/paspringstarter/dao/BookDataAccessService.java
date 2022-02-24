package com.galvanize.tmo.paspringstarter.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.galvanize.tmo.paspringstarter.model.Book;

@Repository("fakeDao")
public class BookDataAccessService implements BookDao{

	private static List<Book> DB = new ArrayList<>();
	
	@Override
	public int insertBook(UUID id, Book book) {
		DB.add(new Book(id, book.getAuthor(), book.getTitle(), book.getYearPublished()));
		return 1;
	}

	@Override
	public List<Book> selectAllBooks() {
		return DB;
	}

	@Override
	public int deleteAllBooks() {
		DB.clear();
		return 1;
	}

}
