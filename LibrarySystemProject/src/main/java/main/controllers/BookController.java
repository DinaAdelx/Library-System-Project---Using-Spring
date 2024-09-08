package main.controllers;

import main.entities.Book;
import main.handlers.BookHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/Book")
public class BookController {

    @Autowired
    public BookHandler bookHandler;
    @GetMapping(value = "/hi")
    public String hello()
    {
        return "Hello User !";
    }

    @PostMapping
    public Book insertBook (Book book)
    {
        bookHandler.insertBookHandler(book);
        return book;
    }
    @GetMapping
    public List<Book> getAllBooks()
    {
        return (List<Book>) bookHandler.getAllBooksHandler();
    }
}
