package main.handlers;

import lombok.AllArgsConstructor;
import main.entities.Book;
import main.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@AllArgsConstructor
@Transactional
@Service
public class BookHandler {
    @Autowired
    public BookService bookService;

    //insert
    public Book insertBookHandler(Book book)
    {
        bookService.insertBookService(book);
        return book;
    }

    //get All Books
    public List<Book> getAllBooksHandler()
    {
        return (List<Book>) bookService.getAllBooksService();
    }
}
