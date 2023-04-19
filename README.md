



# HBV202G Final Project
A project skeleton for implementing the composite pattern and the observer pattern (and some sort of template method pattern) based on tests using JUnit4.

This project is a Maven project, i.e. it uses the standard Maven project structure that your IDE hopefully understands when you `git clone` it. The provided Maven POM includes the JUnit4 dependency.

Both the implementation and the tests are in Java package `finalProject`,  but in the usual separate Maven `src` directories:

(breyta þessum þegar ég er búin)
- `src/main/java/finalProject`:
    - `LibrarySystem/Author.java` Class to build Authors
    - `LibrarySystem/Book.java` Class to build Books
    - `LibrarySystem/EmptyAuthorListException.java` extends exception if Book has no Authors
    - `LibrarySystem/FacultyMember.java` Extends User, creates Faculty member
    - `LibrarySystem/Lending.java` A class for method to rent out books, and more
    - `LibrarySystem/LibrarySystems.java` Class that uses all the other classes to make a funtioning Library System
    - `LibrarySystem/Student.java` Extends User, creates Student 
    - `LibrarySystem/User.java` Abstract class used by other classes with users.
    - `LibrarySystem/UserOrBookDoesNotExistException.java` Extends exception if Book or User exists
  
  
- `src/test/java`:
    - `finalProject.LibrarySystem`: The package contains an `AllLibrarySystemTests` class that runs all the test cases for the package.

Maven:
- `mvn exec:java` executes the main method, "finalProject.LibrarySystem.Main"
- `mvn compile` compiles all implementation classes.
- `mvn test` runs all test cases (i.e. all classes with a name that either starts with `Test` or ends with `Test`, `Tests`, or `TestCase`).
- `mvn package` Creates a distributable package of the project's compiled code, along with any necessary dependencies and resources, such as JAR or WAR files.
- `mvn site` Generates a website that documents various aspects of the project, such as project reports, dependencies, and code quality metrics.


License: [MIT](LICENCE)

Design: [Class Diagram](src/site/markdown/DESIGN.md)

Patterns: This project uses --- patterns
- `The ---- pattern` + utskýring á hvap það er
.
- hvar patterns voru notuð mep tilvísun/link

# User end documentation
To compile the project execute the following command:
`mvn compile`

To run the project execute the following command:
`mvn exec:java`