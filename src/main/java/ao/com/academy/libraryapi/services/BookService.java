package ao.com.academy.libraryapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import ao.com.academy.libraryapi.bookdto.BookDTO;
import ao.com.academy.libraryapi.exceptions.BookNotFoundException;
import ao.com.academy.libraryapi.repositories.BookRepository;

@Service
public class BookService {
    

    @Autowired
    BookRepository bookRepository;

    public List<BookDTO> getBooks(){
        return bookRepository.findAll();
    }

    public BookDTO getBookById(Long bookId) throws BookNotFoundException{
        return bookRepository.findById(bookId).orElseThrow(() -> new BookNotFoundException(bookId));
    }

    public ResponseEntity<?> createBook(BookDTO book){
        bookRepository.save(book);

        return ResponseEntity.ok().build();
    }
}
