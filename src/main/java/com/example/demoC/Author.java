package com.example.demoC;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class Author {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	
	@OneToMany(mappedBy="author",cascade=CascadeType.ALL)
	private List<Book>books;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBooks(List<Book>books) {
		this.books=books;
	}

}
