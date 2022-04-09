package com.book.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.book.library.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {
	

}
