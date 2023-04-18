package finalProject.LibrarySystem;

import java.util.ArrayList;
import java.util.List;

public class LibrarySystems {
    private List<Book> books = new ArrayList<Book>();
    private List<User> users= new ArrayList<User>();
    private List<Lending> lendings= new ArrayList<Lending>();

    public void addBookWithTitleAndAuthorList(String title, List<Author> authors) throws EmptyAuthorListException {
        books.add(new Book(title, authors));

    }

    public void addStudentUser(String name, boolean feePaid) {
        users.add(new Student(name, feePaid));

    }

    public void addFacultyMember(String name, String department) {
        users.add(new FacultyMember(name, department));

    }

    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)){
                return book;
            }
        }
        return null;
    }

    public User findUserByName(String name) {
        for (User user : users){
            if (user.getName().equals(name)){
                return user;
            }
        }
        return null;
    }

    public void borrowBook(Book book, User user) throws UserOrBookDoesNotExistException {
        lendings.add(new Lending(book, user));

    }

    public void returnBook(Book book, User user) throws UserOrBookDoesNotExistException {

    }

    public void extendLending(FacultyMember facultyMember, Book book, User user) throws UserOrBookDoesNotExistException {

    }

}

