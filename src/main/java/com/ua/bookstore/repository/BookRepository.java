package com.ua.bookstore.repository;

import com.ua.bookstore.domain.Book;

import java.util.List;
import java.util.Optional;

public interface BookRepository {
    List<Book> findAll();
    List<Book> findByGenre(String genre);
    Optional<Book> findById(Long id);
    Book save(Book book);
    boolean deleteById(Long id);
}
