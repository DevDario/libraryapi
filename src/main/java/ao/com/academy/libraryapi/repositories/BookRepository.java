package ao.com.academy.libraryapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ao.com.academy.libraryapi.bookdto.BookDTO;

public interface BookRepository extends JpaRepository<BookDTO, Long> {
    
}
