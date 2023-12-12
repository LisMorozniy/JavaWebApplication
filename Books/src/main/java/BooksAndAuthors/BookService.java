package BooksAndAuthors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BookService {
    private List<Book> books = new ArrayList<>();

    // Method to add a book
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to get all books
    public List<Book> getAllBooks() {
        return books;
    }

    // Method to get books by author
    public List<Book> getBooksByAuthor(String authorName) {
        return books.stream()
                .filter(book -> book.getAuthor().getName().equals(authorName))
                .collect(Collectors.toList());
    }
}
