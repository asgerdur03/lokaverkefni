package finalProject.LibrarySystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LibrarySystems {
    private List<Lendable> lendables;
    private List<User> users;
    private List<Lending> lendings;


    public LibrarySystems(){
        lendables = new ArrayList<>();
        lendings= new ArrayList<>();
        users= new ArrayList<>();
    }
    public void setDefaultBooks() throws EmptyAuthorListException {
        Author author1 =new Author("Tolkien");
        List<Author> list1 = new ArrayList<Author>();
        list1.add(author1);
        lendables.add(new Book("Hobbit 1", list1));
        lendables.add(new Book("Hobbit 2", list1));
        lendables.add(new Book("Hobbit 3", list1));

        Author auhor2 = new Author("John Doe");
        List<Author> list2 = new ArrayList<Author>();
        list2.add(auhor2);
        lendables.add(new Book("Book vol 1", list2));
        lendables.add(new Book("Book vol 2",list2));

        Author author3 = new Author("God");
        List<Author> list3 = new ArrayList<>();
        list3.add(author3);
        lendables.add(new Book("Bible", list3));


    }

    public Lendable addLendable(String title, List<Author> authorList)throws EmptyAuthorListException{
        if(authorList.isEmpty()){
            throw new EmptyAuthorListException("Author list cannot be empty");
        }
        Lendable lendable = new Book(title, authorList);
        lendables.add(lendable);
        return lendable;
    }


    public User addStudentUser(String name, boolean feePaid) {
        User user = new Student(name, feePaid);
        users.add(user);
        return user;
    }

    public void addFacultyMemberUser(String name, String department) {
        User user = new FacultyMember(name, department);
        users.add(user);
    }

    public Lendable findLendableByTitle(String title) throws UserOrLendableDoesNotExistException{
        for (Lendable lendable : lendables) {
            if (lendable.getTitle().equals(title)) {
                return lendable;
            }
        }
        throw new UserOrLendableDoesNotExistException("Book or book collection does not exist");
    }

    public User findUserByName(String name) throws UserOrLendableDoesNotExistException {
        for (User user : users) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        throw new UserOrLendableDoesNotExistException("User does not exist");
    }

    public Lending borrowLendable(User user, Lendable lendable) {
        Lending lending = new Lending(lendable, user);
        lendings.add(lending);
        return lending;
    }

    public void extendLending(Lendable lendable, LocalDate newDueDate) {
        for(Lending e: lendings){
            if (e.getLendable() == lendable){
                e.setDueDate(newDueDate);
            }
        }
    }

    public void returnLendable(User user, Lendable lendable) {
        for(Lending e : lendings){
            if (e.getLendable() == lendable){
                lendings.remove(e);
                break;
            }
        }
    }

    public List<User> getUsers() {
        return users;
    }
    public List<Lendable> getLendables(){
        return lendables;
    }
    public List<Lending> getLendings(){
        return lendings;
    }
}