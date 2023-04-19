package finalProject.LibrarySystem;

import java.util.ArrayList;
import java.util.List;

public class Book implements Lendable{
    private String title;
    private List<Author> authors = new ArrayList<Author>();

    public Book(String title, List<Author> authors) throws EmptyAuthorListException {
        super();
        this.title = title;
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Author> getAuthors(){
        return authors;
    }

    public void setAuthors(List<Author> authors) throws EmptyAuthorListException {
        this.authors = authors;
    }

    public void addAuthor(Author author) {
        this.authors.add(author);
    }
}


