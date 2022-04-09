package com.book.library.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.book.library.entity.Book;
import com.book.library.repository.BookRepository;



@Service
public class BookService {
	
	@Autowired
	BookRepository bookrepository;
	
	public List<Book> getAllBook(){
	return  bookrepository.findAll();
		
	}
	
	public String saveBook(Book book) {
		bookrepository.save(book);
		return "Book saved successfully";
	}
	
	public String saveBooks(List<Book> books) {
		bookrepository.saveAll(books);
		return "Books saved successfully";
	}
	
	
	public String deleteBookById( int id) {
		
		bookrepository.deleteById(id);
		return id+" -Book deleted";
		
	}
	public String updateBookById(String name,int id) {
		Book book =new Book();
		book = bookrepository.getById(id);
		book.setName(name);
		bookrepository.save(book);
		return id+" - Updated successfully";
	}
	

}
