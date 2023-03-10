import java.util.ArrayList;
import java.util.List;

public class LibrarySystems {
    List<Book> books;
    List<User> users;
    List<Lending> lendings;

    public void addBookWithTitleAndAuthorList(String title, List<Author> authors) throws EmptyAuthorListException {
        if (authors.size() == 0) {
            throw new EmptyAuthorListException("Author list is empty");
        }

    }

    public void addStudentUser(String name, boolean feePaid) {

    }

    public void addFacultyMember(String name, String department) {

    }

    public Book findBookByTitle(String title) {
        return null;
    }

    public User findUserByName(String name) {
        return null;
    }

    public void borrowBook(Book book, User user) throws UserOrBookDoesNotExistException {

    }

    public void returnBook(Book book, User user) throws UserOrBookDoesNotExistException {

    }

    public void extendLending(FacultyMember facultyMember, Book book, User user) throws UserOrBookDoesNotExistException {

    }

    public LibrarySystems() {
        books = new ArrayList<Book>();
        users = new ArrayList<User>();
        lendings = new ArrayList<Lending>();
    }
}

