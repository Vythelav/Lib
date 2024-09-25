package org.example.library;


import org.example.book.Book;
import org.example.book.BookRepos;

import java.util.List;

public class Library {
    private BookRepos repository;

    public Library(BookRepos repository) {
        this.repository = repository;
    }

    public void addBook(Book book) {
        repository.addBook(book);
    }

    public void removeBook(String isbn) {
        repository.removeBook(isbn);
    }

    public Book findBook(String isbn) {
        return repository.getBook(isbn);
    }

    public List<Book> listAllBooks() {
        return repository.getAllBooks();
    }
}