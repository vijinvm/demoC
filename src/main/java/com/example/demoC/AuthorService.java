package com.example.demoC;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {
	@Autowired
	private AuthorRepository a;
	
	public List<Author>g1(){
		return a.findAll();
	}
	public Optional<Author>g2(int id){
		return a.findById(id);
	}
	public Author g3(int id, Author author) {
		return a.save(author);
	}
	public void g4(int id) {
		a.deleteById(id);
	}
	public Page<Author>g5(int page,int size,String sortBy ){
		Sort s=Sort.by(sortBy);
	Pageable pageable=PageRequest.of(page, size,sortBy);
		}
	}
}
	
	 