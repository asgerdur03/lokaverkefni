package finalProject.LibrarySystem;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ AuthorTests.class, BookTests.class, FacultyMemberTest.class,
        BookCollectionTests.class, LendingTest.class, LibrarySystemTest.class, StudentTest.class})
public class AllLibrarySystemsTests {
}
