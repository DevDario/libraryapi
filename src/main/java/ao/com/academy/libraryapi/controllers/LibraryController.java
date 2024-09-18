package ao.com.academy.libraryapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ao.com.academy.libraryapi.domain.Book;
import ao.com.academy.libraryapi.exceptions.BookNotFoundException;
import ao.com.academy.libraryapi.services.BookService;


@RestController
@RequestMapping
public class LibraryController {
    
    @Autowired
    BookService bookService;

    // Get all books
    @GetMapping("/library/books")
    public List<Book> getAllBooks(){
        return bookService.getBooks();
    }

    // Find book by Id
    @GetMapping("/library/books/{id}")
    public Book getBookById(@PathVariable(name="id") Long bookId) throws BookNotFoundException{
        return bookService.getBookById(bookId);
    }

    // Create Book
    @PostMapping("/library/books/new")
    public ResponseEntity<?> createBook(@RequestBody Book book){
        return bookService.createBook(book);
    }

}
