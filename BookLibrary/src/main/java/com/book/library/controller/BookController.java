package com.book.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.book.library.entity.Book;
import com.book.library.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@GetMapping("/books")
	public List<Book> getAllBook(){
		return bookService.getAllBook();
	}
	
	@PostMapping("/saveBook")
	public String saveBook(@RequestBody Book book) {
		return bookService.saveBook(book);
	}
	
	@PutMapping("/updateBook/{id}/{name}")
	public String updateBookById(@PathVariable int id,@PathVariable String name) {
		return bookService.updateBookById(name, id);
	}
	
	@PostMapping("/saveBooks")
	public String saveBooks(@RequestBody List<Book> books) {
		return bookService.saveBooks(books);
	}
	
	@DeleteMapping("/deleteBook/{id}")
	public String deleteBookById(@PathVariable int id) {
		return bookService.deleteBookById(id);
	}

}
