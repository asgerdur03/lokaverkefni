



# HBV202G Final Project
A project skeleton for implementing the composite pattern and the observer pattern (and some sort of template method pattern) based on tests using JUnit4.

This project is a Maven project, i.e. it uses the standard Maven project structure that your IDE hopefully understands when you `git clone` it. The provided Maven POM includes the JUnit4 dependency.

Both the implementation and the tests are in Java package `finalProject`,  but in the usual separate Maven `src` directories:

(breyta þessum þegar ég er búin)
- `src/main/java`:
    - `finalProject.LibrarySystem`: Your implementation of the composite pattern has to go there. Choose class, interface, and method names so that they fit the provided test cases.
    - `finalProject.resources`
- `src/test/java`:
    - `finalProject.LibrarySystem`: The package contains an `Alltests` class that collects all the test cases for the package. Test cases testing a (???) .

Maven:
- `mvn run` executes the main method, "finalProject.Main"
- `mvn compile` compiles all implementation classes.
- `mvn test` runs all test cases (i.e. all classes with a name that either starts with `Test` or ends with `Test`, `Tests`, or `TestCase`).
- `mvn package`
- `mvn site`


License: [MIT](http://www.opensource.org/licenses/mit-license.php)

Design: [Class Diagram](src/site/markdown/DESIGN.md)