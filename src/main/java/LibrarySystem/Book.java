package LibrarySystem;

import java.util.List;

public class Book {
    private String title;
    private List<Author> authors;

    public Book(String title, List<Author> authors) throws EmptyAuthorListException {
        this.title = title;
        this.authors = authors;
        if (this.authors.isEmpty()) {
            throw new EmptyAuthorListException("LibrarySystem.Author list is empty");
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Author> getAuthors() throws EmptyAuthorListException {
        if (this.authors.isEmpty()) {
            throw new EmptyAuthorListException("LibrarySystem.Author list is empty");
        }
        return authors;
    }

    public void setAuthors(List<Author> authors) throws EmptyAuthorListException {
        if (this.authors.isEmpty()) {
            throw new EmptyAuthorListException("LibrarySystem.Author list is empty");
        }
        this.authors = authors;
    }

    public void addAuthor(Author author) {
        this.authors.add(author);
    }
}


