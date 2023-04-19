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
    public void start() throws EmptyAuthorListException {

            System.out.println("What would you like to do?");
            System.out.println("1. Faculty Member");
            System.out.println("2. Student");
            System.out.println("3. Administrator");
            System.out.println("4. Exit");

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

            }
            else {
                System.out.println("Idiot");
            }

    }

    private void facultyInterface() {
        List<User> facultyMembers = new ArrayList<>();
        for (User u: librarySystems.getUsers()) {
            if (u instanceof FacultyMember) {
                facultyMembers.add(u);
            }
        }
        while (true) {
            int cnt = 1;
            System.out.println("Select a Faculty Member");
            for (User u: facultyMembers) {
                System.out.println(cnt+". "+u.getName());
                cnt++;
            }
            System.out.println(cnt+". Exit");
            User facultyMember;
            Scanner scanner = new Scanner(System.in);
            System.out.print(": ");
            int input = scanner.nextInt();
            scanner.nextLine();

            if (input >= 1 && input <= facultyMembers.size()) {
                facultyMember = facultyMembers.get(input-1);
                while(true) {
                    System.out.println("What do you want to do?");
                    System.out.println("1. Extend Lending");
                    System.out.println("2. Borrow Lendable");
                    System.out.println("3. Return Lendable");
                    System.out.println("4. Exit");

                    System.out.print(": ");
                    int input1 = scanner.nextInt();
                    scanner.nextLine();

                    if (input1 == 1) {
                        System.out.println("Which lending would you like to extend?");
                        int cnt1 = 0;
                        for (Lending l: librarySystems.getLendings()) {
                            System.out.println(cnt1+". "+l.getUser().getName()+" "+l.getLendable().getTitle()+" "+l.getDueDate().toString());
                            cnt1++;
                        }
                        System.out.print("Input which lending you would like to extend: ");
                        int input2 = scanner.nextInt();
                        scanner.nextLine();
                        if (input2 < librarySystems.getLendings().size() && input2 >= 0) {
                            Lending lending = librarySystems.getLendings().get(input2);
                            librarySystems.extendLending(lending.getLendable(),lending.getDueDate().plusDays(7));
                        }
                        else {
                            System.out.println("Input was out of bounds");
                        }
                        break;
                    }
                    else if (input1 == 2) {
                        System.out.println("Which lendable would you like to borrow?");
                        int cnt1 = 0;
                        for (Lendable l: librarySystems.getLendables()) {
                            System.out.print(cnt1+". "+l.getTitle()+" - ");
                            for (Author a: l.getAuthors()) {
                                System.out.print(a.getName()+" ");
                            }
                            System.out.println();
                            cnt1++;
                        }
                        System.out.print("Input which lendable you would like to borrow: ");
                        int input2 = scanner.nextInt();
                        if (input2 < librarySystems.getLendables().size() && input2 >= 0) {
                            librarySystems.borrowLendable(facultyMember,librarySystems.getLendables().get(input2));
                        }
                        else {
                            System.out.println("Input was out of bounds");
                        }
                        break;
                    }
                    else if (input1 == 3) {
                        System.out.println("Which lendable would you like to return?");
                        List<Lending> lendings = librarySystems.getLendings().stream()
                                .filter(l-> l.getUser() == facultyMember).toList();
                        int cnt1 = 0;
                        for (Lending l: lendings) {
                            System.out.println(cnt1+". "+l.getLendable().getTitle());
                        }
                        System.out.print("Input which lendable you would like to return: ");
                        int input2 = scanner.nextInt();
                        scanner.nextLine();
                        if (input2 < lendings.size() && input2 >= 0) {
                            librarySystems.returnLendable(facultyMember,lendings.get(input2).getLendable());
                        }
                        else {
                            System.out.println("Input was out of bounds");
                        }
                        break;
                    }
                    else if (input1 == 4) {
                        break;
                    }
                    else {
                        System.out.println("Invalid Input");
                    }

                }
            }
            else if (input == cnt) {
                break;
            }
            else {
                System.out.println("Invalid input");
            }
        }
    }

    private void studentInterface() {
        List<User> students = new ArrayList<>();
        for (User u: librarySystems.getUsers()) {
            if (u instanceof Student) {
                students.add(u);
            }
        }
        while (true) {
            int cnt = 1;
            System.out.println("Select a Faculty Member");
            for (User u: students) {
                System.out.println(cnt+". "+u.getName());
                cnt++;
            }
            System.out.println(cnt+". Exit");
            User student;
            Scanner scanner = new Scanner(System.in);
            System.out.print(": ");
            int input = scanner.nextInt();
            scanner.nextLine();

            if (input >= 1 && input <= students.size()) {
                student = students.get(input-1);
                while(true) {
                    System.out.println("What do you want to do?");
                    System.out.println("1. Borrow Lendable");
                    System.out.println("2. Return Lendable");
                    System.out.println("3. Exit");

                    System.out.print(": ");
                    int input1 = scanner.nextInt();
                    scanner.nextLine();

                    if (input1 == 1) {
                        System.out.println("Which lendable would you like to borrow?");
                        int cnt1 = 0;
                        for (Lendable l: librarySystems.getLendables()) {
                            System.out.print(cnt1+". "+l.getTitle()+" - ");
                            for (Author a: l.getAuthors()) {
                                System.out.print(a.getName()+" ");
                            }
                            System.out.println();
                            cnt1++;
                        }
                        System.out.print("Input which lendable you would like to borrow: ");
                        int input2 = scanner.nextInt();
                        if (input2 < librarySystems.getLendables().size() && input2 >= 0) {
                            librarySystems.borrowLendable(student,librarySystems.getLendables().get(input2));
                        }
                        else {
                            System.out.println("Input was out of bounds");
                        }
                        break;
                    }
                    else if (input1 == 2) {
                        System.out.println("Which lendable would you like to return?");
                        List<Lending> lendings = librarySystems.getLendings().stream()
                                .filter(l-> l.getUser() == student).toList();
                        int cnt1 = 0;
                        for (Lending l: lendings) {
                            System.out.println(cnt1+". "+l.getLendable().getTitle());
                        }
                        System.out.print("Input which lendable you would like to return: ");
                        int input2 = scanner.nextInt();
                        scanner.nextLine();
                        if (input2 < lendings.size() && input2 >= 0) {
                            librarySystems.returnLendable(student,lendings.get(input2).getLendable());
                        }
                        else {
                            System.out.println("Input was out of bounds");
                        }
                        break;
                    }
                    else if (input1 == 3) {
                        break;
                    }
                    else {
                        System.out.println("Invalid Input");
                    }

                }
            }
            else if (input == cnt) {
                break;
            }
            else {
                System.out.println("Invalid input");
            }
        }
    }

    private void adminInterface() throws EmptyAuthorListException {
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
                String input1 = scanner.nextLine();
                String input2 = "";
                if (!input1.isEmpty()) {
                    System.out.print("Input department of faculty member: ");
                    input2 = scanner.nextLine();
                }
                else {
                    System.out.println("You have to input a name.");
                    break;
                }

                librarySystems.addFacultyMemberUser(input1,input2);
                System.out.println("Faculty Member Created");
            }
            else if (input == 2) {
                System.out.print("Input name of student: ");
                String input1 = scanner.nextLine();
                String input2 = "";
                if (!input1.isEmpty()) {
                    System.out.print("Input whether student has paid fee (y/n): ");
                    input2 = scanner.nextLine();
                }
                else {
                    System.out.println("You must input a name");
                    break;
                }

                boolean feePaid;
                if (input2.equals("y")) {
                    feePaid = true;
                }
                else if (input2.equals("n")) {
                    feePaid = false;
                }
                else {
                    System.out.println("Invalid input, defaulting to not paid fee...");
                    feePaid = false;
                }

                librarySystems.addStudentUser(input1,feePaid);
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
                            System.out.println("2. Finish book");

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
                    break;
                }
                else {
                    System.out.println("Invalid input");
                }
            }
            else if (input == 4) {
                break;
            }
            else {
                System.out.println("Invalid input");
            }
        }
    }
}
