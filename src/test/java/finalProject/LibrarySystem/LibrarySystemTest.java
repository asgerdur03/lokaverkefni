package finalProject.LibrarySystem;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

public class LibrarySystemTest {
    private Student student;
    private String nameofstudent = "NAME_OF_STUDENT";
    private boolean feePaid;
    private FacultyMember facultyMember;
    private String nameoffacultymember = "NAME_OF_FACULTYMEMBER";
    private String nameofdepartment = "DEPARTMENT";
    private Author author;
    private String nameofauthor = "NAME_OF_AUTHOR";
    private List<Author> authors;
    private Lending lending;
    private Book book;
    private String nameofbook = "NAME_OF_BOOK";

    private LibrarySystems librarySystems;
    @Before
    public void setUp(){
        librarySystems = new LibrarySystems();
    }
    @Test
    public void testAddStudentUser(){
        librarySystems.addStudentUser(nameofstudent, feePaid);
        assertTrue(librarySystems.getUsers().size() == 1);
    }
    @Test
    public void testAddFacultyMember(){
        librarySystems.addFacultyMemberUser(nameoffacultymember, nameofdepartment);
        assertTrue(librarySystems.getUsers().size() == 1);
    }
    @Test
    public void testFindLendable() throws EmptyAuthorListException, UserOrLendableDoesNotExistException {
        author = new Author(nameofauthor);
        authors = new ArrayList<>();
        authors.add(author);
        librarySystems.addLendable(nameofbook, authors);
        assertTrue(librarySystems.getLendables().contains(librarySystems.findLendableByTitle(nameofbook)));
    }
    @Test
    public void testFindUserByName() throws UserOrLendableDoesNotExistException {
        librarySystems.addStudentUser(nameofstudent, feePaid);
        assertTrue(librarySystems.getUsers().contains(librarySystems.findUserByName(nameofstudent)));
    }
    @Test
    public void testAddLendable() throws EmptyAuthorListException {
        author = new Author(nameofauthor);
        authors = new ArrayList<>();
        authors.add(author);
        Lendable lendable = librarySystems.addLendable(nameofbook, authors);
        assertTrue(librarySystems.getLendables().contains(lendable));
    }
    @Test
    public void testBorrowLendable() throws EmptyAuthorListException, UserOrLendableDoesNotExistException {
        author = new Author(nameofauthor);
        authors = new ArrayList<>();
        authors.add(author);
        librarySystems.addStudentUser(nameofstudent, feePaid);
        Lendable lendable = librarySystems.addLendable(nameofbook, authors);
        lending = librarySystems.borrowLendable(librarySystems.findUserByName(nameofstudent), lendable);
        assertTrue(librarySystems.getLendings().contains(lending));
    }
    @Test
    public void testReturnLendable() throws EmptyAuthorListException, UserOrLendableDoesNotExistException {
        author = new Author(nameofauthor);
        authors = new ArrayList<>();
        authors.add(author);
        librarySystems.addStudentUser(nameofstudent, feePaid);
        Lendable lendable = librarySystems.addLendable(nameofbook, authors);
        lending = librarySystems.borrowLendable(librarySystems.findUserByName(nameofstudent), lendable);
        librarySystems.returnLendable(librarySystems.findUserByName(nameofstudent), lendable);
        assertFalse(librarySystems.getLendings().contains(lending));
    }
    @Test
    public void testExtendLending() throws EmptyAuthorListException, UserOrLendableDoesNotExistException {
        author = new Author(nameofauthor);
        authors = new ArrayList<>();
        authors.add(author);
        librarySystems.addStudentUser(nameofstudent, feePaid);
        Lendable lendable = librarySystems.addLendable(nameofbook, authors);
        lending = librarySystems.borrowLendable(librarySystems.findUserByName(nameofstudent), lendable);
        lending.setDueDate(LocalDate.ofEpochDay(2007-3-12));
        librarySystems.extendLending(lendable,LocalDate.ofEpochDay(2027-3-12) );
        assertNotEquals(lending.getDueDate(), LocalDate.ofEpochDay(2007 - 3 - 12));
    }
    @Test
    public void testGetUsers(){
        User user = librarySystems.addStudentUser(nameofstudent, feePaid);
        assertTrue(librarySystems.getUsers().contains(user));
    }
    @Test
    public void testGetLendables() throws EmptyAuthorListException {
        author = new Author(nameofauthor);
        authors = new ArrayList<>();
        authors.add(author);
        librarySystems.addStudentUser(nameofstudent, feePaid);
        Lendable lendable = librarySystems.addLendable(nameofbook, authors);
        assertTrue(librarySystems.getLendables().contains(lendable));
    }
    @Test
    public void testGetLendings() throws EmptyAuthorListException {
        author = new Author(nameofauthor);
        authors = new ArrayList<>();
        authors.add(author);
        User user = librarySystems.addStudentUser(nameofstudent, feePaid);
        Lendable lendable = librarySystems.addLendable(nameofbook, authors);
        lending = librarySystems.borrowLendable(user, lendable);
        assertTrue(librarySystems.getLendings().contains(lending));
    }


}

