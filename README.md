



# HBV202G Final Project
A project skeleton for implementing the composite pattern and the observer pattern (and some sort of template method pattern) based on tests using JUnit4.

This project is a Maven project, i.e. it uses the standard Maven project structure that your IDE hopefully understands when you `git clone` it. The provided Maven POM includes the JUnit4 dependency.

Both the implementation and the tests are in Java package `finalProject`,  but in the usual separate Maven `src` directories:

(breyta þessum þegar ég er búin)
- `src/main/java/finalProject`:
    - `LibrarySystem/Author.java`
    - `LibrarySystem/Book.java`
    - `LibrarySystem/EmptyAuthorListException.java`
    - `LibrarySystem/FacultyMember.java`
    - `LibrarySystem/Lending.java`
    - `LibrarySystem/LibrarySystems.java`
    - `LibrarySystem/Student.java`
    - `LibrarySystem/User.java`
    - `LibrarySystem/UserOrBookDoesNotExistException.java`
  
    - `resources/`
  
- `src/test/java`:
    - `finalProject.LibrarySystem`: The package contains an `Alltests` class that collects all the test cases for the package. Test cases testing a (???) .

Maven:
- `mvn exec:java` executes the main method, "finalProject.Main"
- `mvn compile` compiles all implementation classes.
- `mvn test` runs all test cases (i.e. all classes with a name that either starts with `Test` or ends with `Test`, `Tests`, or `TestCase`).
- `mvn package` Creates a distributable package of the project's compiled code, along with any necessary dependencies and resources, such as JAR or WAR files.
- `mvn site` Generates a website that documents various aspects of the project, such as project reports, dependencies, and code quality metrics.


License: [MIT](http://www.opensource.org/licenses/mit-license.php)

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