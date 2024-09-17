package ao.com.academy.libraryapi.exceptions;

public class BookNotFoundException extends Exception {
    public BookNotFoundException(Long bookId){
        super(String.format("The book with the ID: %s doesn't exists !", bookId));
    }
}
