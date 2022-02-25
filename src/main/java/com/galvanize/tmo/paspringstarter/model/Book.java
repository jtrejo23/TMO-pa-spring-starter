package com.galvanize.tmo.paspringstarter.model;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Book {

	private  UUID id;
	private final String author;
	private final String title;
	private final int yearPublished;

	public Book(@JsonProperty("id")UUID id,
			@JsonProperty("author")String author,
			@JsonProperty("title")String title,
			@JsonProperty("yearPublished")int yearPublished) {
		this.id = id;
		this.author = author;
		this.title = title;
		this.yearPublished = yearPublished;
	}

	public UUID getId() {
		return id;
	}
	
	public void setId(UUID id) {
		this.id = id;
		
	}

	public String getAuthor() {
		return author;
	}

	public String getTitle() {
		return title;
	}

	public int getYearPublished() {
		return yearPublished;
	}


	
}
