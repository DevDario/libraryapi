package ao.com.academy.libraryapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import ao.com.academy.libraryapi.domain.Book;
import ao.com.academy.libraryapi.exceptions.BookNotFoundException;
import ao.com.academy.libraryapi.repositories.BookRepository;

@Service
public class BookService {
    

    @Autowired
    BookRepository bookRepository;

    // Gets all books from DB
    public List<Book> getBooks(){
        return bookRepository.findAll();
    }

    // Find a book by id
    public Book getBookById(Long bookId) throws BookNotFoundException{
        return bookRepository.findById(bookId).orElseThrow(() -> new BookNotFoundException(bookId));
    }

    // Stores a new book
    public ResponseEntity<?> createBook(Book book){
        bookRepository.save(book);

        return ResponseEntity.ok().build();
    }

    // Delete a book
    public ResponseEntity<?> deleteBook(Long bookId) throws BookNotFoundException{

        Book book = bookRepository.findById(bookId).orElseThrow(() -> new BookNotFoundException(bookId));

        bookRepository.delete(book);

        return ResponseEntity.ok().build();
    }

    // Update a book
    public Book updateBook(Long bookId, Book bookDetails) throws BookNotFoundException{
        Book book = bookRepository.findById(bookId).orElseThrow(() -> new BookNotFoundException(bookId));

        book.setName(bookDetails.getName());
        book.setAuthor(bookDetails.getAuthor());
        book.setReleaseDate(bookDetails.getReleaseDate());

        Book updatedBook = bookRepository.save(book);

        return updatedBook;
    }
}
