package ao.com.academy.libraryapi.bookdto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
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
public class BookDTO {
    
    @Id
    @GeneratedValue
    @Column(name="id")
    private Long bookId;

    @Column(name="bookName")
    private String bookName;

    @Column(name="bookAuthor")
    private String bookAuthor;

    @Column(name="releaseDate")
    private String releaseDate;
}
