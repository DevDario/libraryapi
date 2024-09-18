package ao.com.academy.libraryapi.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="books")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Book {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Long bookId;

    @Column(name="name")
    private String bookName;

    @Column(name="author")
    private String bookAuthor;

    @Column(name="releaseDate")
    private String releaseDate;
}
