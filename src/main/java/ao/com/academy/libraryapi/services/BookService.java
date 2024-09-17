package ao.com.academy.libraryapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ao.com.academy.libraryapi.bookdto.BookDTO;
import ao.com.academy.libraryapi.exceptions.BookNotFoundException;
import ao.com.academy.libraryapi.repositories.BookRepository;

public class BookService {
    

    @Autowired
    BookRepository bookRepository;

    public List<BookDTO> getBooks() throws BookNotFoundException{
        return bookRepository.findAll();
    }

    public BookDTO getBookById(Long bookId) throws BookNotFoundException{
        return bookRepository.findById(bookId).orElseThrow(() -> new BookNotFoundException(bookId));
    }
}
