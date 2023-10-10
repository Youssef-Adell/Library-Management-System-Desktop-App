package library;
import java.util.ArrayList;
import java.util.Scanner;
import GUI.SingIn;
public class Library {
    static Scanner input = new Scanner(System.in);
    public static int menu(){
        int choice;
        
        while(true){
            System.out.println("1) addBook");
            System.out.println("2) removeBook");
            System.out.println("3) borrowBook");
            System.out.println("4) returnBook");
            System.out.println("5) getAllBooks");
            System.out.println("6) getAvialableBooks");
            System.out.println("7) getBorrowedBooks\n");
            System.out.println("8) addStudent");
            System.out.println("9) removeStudent");
            System.out.println("10) getAllStudents");
            System.out.println("11) getStudentsWhoBorrowedBooks\n");
            System.out.println("12) Login");
            System.out.println("13) Signout");
            System.out.println("14) create new accounts");
            System.out.println("15) remove account");
            System.out.println("16) get logged account");
            System.out.println("17) get all accounts");
            System.out.println("Choice: ");

            choice = input.nextInt();
            
            if(choice >= 1 && choice <= 17)
                return choice;
        }
    }
    
    public static void main(String[] args) throws Exception{
        LibraryManagementSystem sys = LibraryManagementSystem.getInstance();         
        SingIn M=new SingIn();
        M.show();
    
        /*while(true){
            try{
                int choice = menu();
                switch(choice){
                //---Books Controller Methods---
                    case 1: //addBook
                        sys.addBook("123", "OOP", "Jack");
                        sys.addBook("456", "DS", "Polo");
                        sys.addBook("789", "Flutter", "angela");
                        sys.addBook("101", "Algo", "Max");
                        break;
                    case 2: //removeBook
                        System.out.println("Enter Book ID to remove: ");
                        sys.removeBook(input.nextInt());                
                        break;
                    case 3: //borrowBook
                        System.out.println("Enter Student ID, Book ID to borrow: ");
                        sys.borrowBook(input.nextInt(), input.nextInt());                
                        break;
                    case 4://return book
                        System.out.println("Enter Student ID, Book ID to return: ");
                        sys.returnBook(input.nextInt(), input.nextInt());                
                        break;
                    case 5: //get all books
                        ArrayList<Book> allBooks = sys.getAllBooks();
                        for(Book book : allBooks)
                            System.out.println(book.toString());
                        break;
                    case 6: //get avilable books
                        ArrayList<Book> avilableBooks = sys.getAvailableBooks();
                        for(Book book : avilableBooks)
                            System.out.println(book.toString());                
                        break;
                    case 7: // get borrowed books
                        ArrayList<Book> borrowedBooks = sys.getBorrowedBooks();
                        for(Book book : borrowedBooks)
                            System.out.println(book.toString());             
                        break; 
                //---Students Controller Methods---
                    case 8: // Add Student
                        sys.addStudent("Youssef", 3, "0111");
                        sys.addStudent("Abdo", 2, "0100");
                        sys.addStudent("Mahmoud", 1, "0122");
                        break; 
                    case 9: // remove Student
                        System.out.println("Enter Student ID to remove: ");
                        sys.removeStudent(input.nextInt());
                        break; 
                    case 10: // get all students
                        ArrayList<Student> allStudents = sys.getAllStudents();
                        for(Student student : allStudents)
                            System.out.println(student.toString());       
                        break; 
                    case 11: // get students who borrowed books
                        ArrayList<Student> studentsWhoBorrowedBooks = sys.getStudentsWhoBorrowedBooks();
                        for(Student student : studentsWhoBorrowedBooks)
                            System.out.println(student.toString());       
                        break; 
                    case 12:
                        sys.login("admin", "admin");
                       break;
                    case 13:
                        sys.signout();
                        break;
                    case 14:
                        sys.createNewAccount("Joo", "adminJoo", "123");
                        sys.createNewAccount("Wahba", "adminWahba", "456");
                        break;
                    case 15:
                        System.out.println("enter account id to remove: ");
                        sys.removeAccount(input.nextInt());
                        break;
                    case 16:
                        System.out.println(sys.getLoggedAccount());
                        break;
                    case 17:
                        System.out.println(sys.getAllAccoutns());
                        break;
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }*/

        
    }

    }