package org.example.book;

import java.util.List;

public interface BookRepos {
    void addBook(Book book);
    void removeBook(String isbn);
    Book getBook(String isbn);
    List<Book> getAllBooks();
}
