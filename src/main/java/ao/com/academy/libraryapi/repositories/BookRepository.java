package ao.com.academy.libraryapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ao.com.academy.libraryapi.domain.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
    
}
