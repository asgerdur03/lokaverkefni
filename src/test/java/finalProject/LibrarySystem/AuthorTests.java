package finalProject.LibrarySystem;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AuthorTests {
    private Author author;

    public static final String nameOfAuthor = "NAME_OF_AUTHOR";

    @Before
    public void setup(){
        author = new Author(nameOfAuthor);
    }
    @Test
    public void getNameOfAuthor(){
        assertEquals("NAME_OF_AUTHOR", author.getName());
    }

}


