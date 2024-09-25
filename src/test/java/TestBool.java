import org.example.book.Book;
import org.example.book.InMemoryBook;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestBool {
    private InMemoryBook repository;

    @BeforeEach
    void setUp() {
        repository = new InMemoryBook();
    }

    @Test
    void addBook() {
        Book book = new Book("Test", "Test Author", "123", 2013);
        repository.addBook(book);
        assertEquals(1, repository.getAllBooks().size());
    }

    @Test
    void removeBook() {
        Book book = new Book("Test", "Test Author", "123", 2013);
        repository.addBook(book);
        repository.removeBook("123");
        assertEquals(0, repository.getAllBooks().size());
    }

    @Test
    void getBook() {
        Book book = new Book("Test", "Test Author", "123", 2013);
        repository.addBook(book);
        Book foundBook = repository.getBook("123");
        assertNotNull(foundBook);
        assertEquals("Test", foundBook.getTitle());
    }
}
