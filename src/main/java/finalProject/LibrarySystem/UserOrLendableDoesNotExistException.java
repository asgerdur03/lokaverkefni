package finalProject.LibrarySystem;

public class UserOrLendableDoesNotExistException extends java.lang.Exception {
    private String message;

    public UserOrLendableDoesNotExistException(String message) {
        super(message);
    }
}
