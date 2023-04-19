package finalProject.LibrarySystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private LibrarySystems librarySystems;


    public UserInterface() throws EmptyAuthorListException {
        librarySystems = new LibrarySystems();
        librarySystems.setDefaultBooks();
    }
    public void start() throws EmptyAuthorListException{

            System.out.println("Who are you? \n 1. Faculty Member \n 2. Student \n 3. Administrator \n 4. Exit");

            Scanner scanner = new Scanner(System.in);
            System.out.print(": ");
            int input = scanner.nextInt();
            scanner.nextLine();

            if (input == 1) {
                facultyInterface();
            }
            else if (input == 2) {
                studentInterface();
            }
            else if (input == 3) {
                adminInterface();
            }
            else if (input == 4) {
                System.out.println("Exiting library");
            }
            else {
                System.out.println("Idiot");
            }

    }

    private void facultyInterface() throws EmptyAuthorListException {
        List<User> facultyMembers = new ArrayList<>();
        for (User u: librarySystems.getUsers()) {
            if (u instanceof FacultyMember) {
                facultyMembers.add(u);
            }
        }
        System.out.println("You chose faculty member");
        start();

    }

    private void studentInterface() throws EmptyAuthorListException {
        List<User> students = new ArrayList<>();
        for (User u: librarySystems.getUsers()) {
            if (u instanceof Student) {
                students.add(u);
            }
        }
        System.out.println("You chose student");
        start();
    }

    private void adminInterface() throws EmptyAuthorListException {
        System.out.println("You chose admin");
        while (true) {
            System.out.println("What would you like to do?");
            System.out.println("1. Add Faculty Member");
            System.out.println("2. Add Student");
            System.out.println("3. Add Lendable");
            System.out.println("4. Exit");

            Scanner scanner = new Scanner(System.in);
            System.out.print(": ");
            int input = scanner.nextInt();
            scanner.nextLine();


            if (input == 1) {
                System.out.print("Input name of faculty member: ");
                String nameF = scanner.nextLine();
                String department = "";
                if (!nameF.isEmpty()) {
                    System.out.print("Input department of faculty member: ");
                    department = scanner.nextLine();
                }
                else {
                    System.out.println("You have to input a name.");
                    break;
                }

                librarySystems.addFacultyMemberUser(nameF,department);
                System.out.println("Faculty Member Created");
            }
            else if (input == 2) {
                System.out.print("Input name of student: ");
                String nameS = scanner.nextLine();
                String feepaid = "";
                if (!nameS.isEmpty()) {
                    System.out.print("Input whether student has paid fee (y/n): ");
                    feepaid = scanner.nextLine();
                }
                else {
                    System.out.println("You must input a name");
                    break;
                }

                boolean feePaid;
                if (feepaid.equals("y")) {
                    feePaid = true;
                }
                else {
                    feePaid = false;
                }

                librarySystems.addStudentUser(nameS,feePaid);
                System.out.println("Student created");
            }
            else if (input == 3) {
                System.out.println("What would you like to do?");
                System.out.println("1. Add Book");
                System.out.println("2. Add Book Collection");
                System.out.println("3. Exit");

                System.out.print(": ");
                int input1 = scanner.nextInt();
                scanner.nextLine();

                if (input1 == 1) {
                    System.out.print("Input book title: ");
                    String input2 = scanner.nextLine();
                    if (!input2.isEmpty()) {
                        List<Author> authorList = new ArrayList<>();
                        while (true) {
                            System.out.println("1. Add Author");
                            System.out.println("2. Finish");

                            System.out.print(": ");
                            int input3 = scanner.nextInt();
                            scanner.nextLine();
                            if (input3 == 1) {
                                System.out.print("Input author name: ");
                                String input4 = scanner.nextLine();
                                authorList.add(new Author(input4));
                            }
                            else if (input3 == 2) {
                                break;
                            }
                            else {
                                System.out.println("Invalid input");
                            }
                        }
                        if (!authorList.isEmpty()) {
                            librarySystems.addLendable(input2,authorList);
                        }
                        else {
                            System.out.println("Author list cannot be empty");
                        }
                    }
                }
                else if (input1 == 2) {
                    break;
                }
                else if (input1 == 3) {
                    start();
                }
                else {
                    System.out.println("Invalid input");
                }
            }
            else if (input == 4) {
                start();
            }
            else {
                System.out.println("Invalid input");
            }
        }
    }
}
