package main.services;

import main.entities.Book;
import main.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class BookService {
    @Autowired
    public BookRepository bookRepository;

    //insert Data
    public Book insertBookService(Book book)
    {
        bookRepository.save(book);
        return book;
    }

    //Get all Books
    public List<Book> getAllBooksService ()
    {
        return (List<Book>) bookRepository.findAll();
    }

}
