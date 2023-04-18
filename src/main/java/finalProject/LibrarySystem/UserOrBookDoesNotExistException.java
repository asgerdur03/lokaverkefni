package finalProject.LibrarySystem;

public class UserOrBookDoesNotExistException extends java.lang.Exception {
    private String message;

    public UserOrBookDoesNotExistException(String message) {
        super(message);
    }
}
