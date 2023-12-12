package BooksAndAuthors;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public BookService bookService() {
        return new BookService();
    }

    @Bean
    public BookController bookController(BookService bookService) {
        return new BookController(bookService);
    }
}
