



# HBV202G Final Project
A project skeleton for implementing the composite pattern and the observer pattern (and some sort of template method pattern) based on tests using JUnit4.

This project is a Maven project, i.e. it uses the standard Maven project structure that your IDE hopefully understands when you `git clone` it. The provided Maven POM includes the JUnit4 dependency.

Both the implementation and the tests are in Java package `is.hi.hbv202g.finalProject`,  but in the usual separate Maven `src` directories:

(breyta þessum þegar ég er búin)
- `src/main/java`:
    - `is.hi.hbv202g.ass9.composite`: Your implementation of the composite pattern has to go there. Choose class, interface, and method names so that they fit the provided test cases.
    - `is.hi.hbv202g.ass9.compositeLeafObservedByComposite`: Your implementation of the composite pattern that is combined with the observable patterns has to go there. Choose class, interface, and method names so that they fit the provided test cases.
    - `is.hi.hbv202g.ass9.compositeLeafObserverTemplateMethod`: Your refactoring of the above patterns inspired by the template method pattern.
- `src/test/java`: (each package contains an `Alltests` class that collects all the test cases for the respective package in one test suite)
    - `is.hi.hbv202g.ass9.composite`: Test cases testing a composite implementation.
    - `is.hi.hbv202g.ass9.compositeLeafObservedByComposite`: Test cases testing an implementation of a composite where the leafs are observed by the composite implementation.
    - `is.hi.hbv202g.ass9.compositeLeafObserverTemplateMethod`: The same test cases for testing the refactoring of the above patterns inspired by the template method pattern.

Maven:
- `mvn run` executes the main method, "finalProject.Main"
- `mvn compile` compiles all implementation classes.
- `mvn test` runs all test cases (i.e. all classes with a name that either starts with `Test` or ends with `Test`, `Tests`, or `TestCase`).

License: [MIT](http://www.opensource.org/licenses/mit-license.php)

Design: [Class Diagram](src/site/markdown/DESIGN.md)