package finalProject.LibrarySystem;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTest {
    private String name = "John";
    private boolean feePaid = true;
    private Student student;

    @Before
    public void setUp(){
        student = new Student(name, feePaid);
    }

    @Test
    public void TestStudentName(){
        assertEquals(name, student.getName());
    }
    @Test
    public void TestStudentFeePaid(){
        assertEquals(feePaid, student.isFeePaid());
    }

}

