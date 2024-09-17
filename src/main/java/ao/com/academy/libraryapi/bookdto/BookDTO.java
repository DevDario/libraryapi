package ao.com.academy.libraryapi.bookdto;

import jakarta.persistence.Entity;
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
    private String bookName;
    private String bookAuthor;
    private String releaseDate;
}
