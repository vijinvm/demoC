package com.example.demoC;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String title;
	
	@ManyToOne
	@JoinColumn(name="author_id")
	private Author author;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setBooks(Author author) {
		this.author=author;
	}

}
