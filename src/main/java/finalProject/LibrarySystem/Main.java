package finalProject.LibrarySystem;

public class Main {
    /*
    adds books to database, and makes new objects, Student, Book(, Faculty member and User(student or faultyMember)

     */
    public static void main(String[] args) throws EmptyAuthorListException {
        UserInterface ui = new UserInterface();
        ui.start();
    }
}
