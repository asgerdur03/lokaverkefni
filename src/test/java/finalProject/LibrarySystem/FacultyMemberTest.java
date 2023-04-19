package finalProject.LibrarySystem;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FacultyMemberTest {
    private String name = "NAME_OF_FACULTY_MEMBER";
    private String department = "DEPARTMENT";
    private FacultyMember facultyMember;

    @Before
    public void setUp(){
        facultyMember = new FacultyMember(name, department);
    }

    @Test
    public void TestFacultyMemberName(){
        assertEquals(name, facultyMember.getName());
    }
    @Test
    public void TestFacultyMemberDepartment(){
        assertEquals(department, facultyMember.getDepartment());
    }
}


