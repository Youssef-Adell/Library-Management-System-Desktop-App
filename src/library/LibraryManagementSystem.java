package library;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class LibraryManagementSystem {
    private BooksController booksController;
    private StudentsController studentsController;    
    private LibrarianAccountsController librarianAccountsController; 
    private final String booksDatabaseFile = "Books.bin";
    private final String studentsDatabaseFile = "Students.bin";
    private final String accountsDatabaseFile = "LibrarianAccounts.bin";
    private static LibraryManagementSystem instance;
    
    //---Database Methods---
    private void updateBooksDatabase(){
        try {
            // create output stream
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(booksDatabaseFile));
            // save studentsController object in the file
            os.writeObject(booksController);
            // close the output stream
            os.close();
            
        }catch (Exception e) {
            System.out.println("Failed to update Students Database\n");
        }
        
    }    
    private void updateStudentsDatabase(){
        try {
            // create output stream
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(studentsDatabaseFile));
            // save studentsController object in the file
            os.writeObject(studentsController);
            // close the output stream
            os.close();
            
        }catch (Exception e) {
            System.out.println("Failed to update Students Database\n");
        }
        
    }
    private void updateAccountsDatabase(){
        try {
            // create output stream
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(accountsDatabaseFile));
            // save studentsController object in the file
            os.writeObject(librarianAccountsController);
            // close the output stream
            os.close();
            
        }catch (Exception e) {
            System.out.println("Failed to update Accoutns Database\n");
        }
        
    }
    private void loadBooksDatabase(){
        try {
            // create output stream
            ObjectInputStream is = new ObjectInputStream(new FileInputStream(booksDatabaseFile));
            // save booksController object in the file
            booksController = (BooksController) is.readObject();
            // close the output stream
            is.close();
            
        } catch (Exception e) {
            System.out.println("Faild to load Books Database\n");
        }
        
    }
    private void loadStudentsDatabase(){
        try {
            // create output stream
            ObjectInputStream is = new ObjectInputStream(new FileInputStream(studentsDatabaseFile));
            // save studentsController object in the file
            studentsController = (StudentsController) is.readObject();
            // close the output stream
            is.close();
            
        } catch (Exception e) {
            System.out.println("Faild to load Students Database\n");
        }
        
    }
    private void loadAccountsDatabase(){
        try {
            // create output stream
            ObjectInputStream is = new ObjectInputStream(new FileInputStream(accountsDatabaseFile));
            // save studentsController object in the file
            librarianAccountsController = (LibrarianAccountsController) is.readObject();
            // close the output stream
            is.close();
            
        } catch (Exception e) {
            System.out.println("Faild to load Accounts Database\n");
        }
        
    }    
    private void isLogged() throws Exception{
        boolean isLogged = librarianAccountsController.isLogged();
        
        if(!isLogged)
            throw new Exception("You have to login first");
    }
    
    private LibraryManagementSystem(){
        booksController = new BooksController();
        studentsController = new StudentsController();
        librarianAccountsController = new LibrarianAccountsController();
        
        loadBooksDatabase();
        loadStudentsDatabase();
        loadAccountsDatabase();
    }
    public static LibraryManagementSystem getInstance(){
        if(instance == null)
            instance = new LibraryManagementSystem();
        
        return instance;
    }
    
    //---Books Controller Methods---
    public void addBook(String _ISBN, String _title, String _author) throws Exception{
        isLogged();
        booksController.addBook(_ISBN, _title, _author);
        updateBooksDatabase();
    }
    
    public void removeBook(int _bookID) throws Exception{
        isLogged();
        boolean isDone = booksController.removeBook(_bookID);
        if(!isDone)
            throw new Exception("There is no Book with this ID or it may be borrowed by someone so it cant be deleted");
        
        updateBooksDatabase();
    }

    public void borrowBook(int _studentID, int _bookID) throws Exception{
        isLogged();
        boolean isDone = booksController.borrowBook(_bookID);
        if(!isDone)
            throw new Exception("There is no Book with this ID or it may be not available to be borrowed");
          
        isDone = studentsController.makeStudentBorrowBook(_studentID, _bookID);
        if(!isDone)
            throw new Exception("There is no Student with this ID");
        
        updateBooksDatabase();
        updateStudentsDatabase();
    }   
    
    public void returnBook(int _studentID, int _bookID) throws Exception{
        isLogged();
        boolean isDone = booksController.returnBook(_bookID);
        if(!isDone)
            throw new Exception("There is no Book with this ID or it may be not borrowed to be returned");
          
        isDone = studentsController.makeStudentReturnBook(_studentID, _bookID);
        if(!isDone)
            throw new Exception("There is no Student with this ID or he may did not borrow this book");
        
        updateBooksDatabase();
        updateStudentsDatabase();
    }

    public ArrayList<Book> getAllBooks() throws Exception{
        isLogged();
        return booksController.getAllBooks();
    }
    
    public ArrayList<Book>  getAvailableBooks() throws Exception{
        isLogged();
        return booksController.getAvailableBooks();
    }
    
    public ArrayList<Book>  getBorrowedBooks() throws Exception{
        isLogged();
        return booksController.getBorrowedBooks();
    }

    
    //---Students Controller Methods---
    public void addStudent(String _name, int _year, String _phone) throws Exception{
        isLogged();
        studentsController.addStudent(_name, _year, _phone);
        updateStudentsDatabase();
    }
    
    public void removeStudent(int _studentID) throws Exception{
        isLogged();
        boolean isDone = studentsController.removeStudent(_studentID);
        if(!isDone)
            throw new Exception("There is no Student with this ID or he may has borrowed books so he cannot be deleted");
        
        updateStudentsDatabase();
    }
    
    public ArrayList<Student> getAllStudents() throws Exception{
        isLogged();
        return studentsController.getAllStudents();
    }

    public ArrayList<Student>  getStudentsWhoBorrowedBooks() throws Exception{
        isLogged();
        return studentsController.getStudentsWhoBorrowedBooks();
    }


    //---Accounts Controller Methods---
    public void login(String _username, String _password) throws Exception{
        boolean isDone = librarianAccountsController.doLogin(_username, _password);
        
        if(!isDone)
            throw new Exception("Invalid username or password");
    }
    
    public void signout() throws Exception{
        isLogged();
        librarianAccountsController.doSignout();
    }
    
    public void createNewAccount(String _name, String _username, String _password) throws Exception{
        isLogged();
        boolean isDone = librarianAccountsController.createAccount(_name, _username, _password);
        
        if(!isDone)
            throw new Exception("This username is taken by another user");
        
        updateAccountsDatabase();
    }
    
    public void removeAccount(int _accountID) throws Exception{
        isLogged();
        boolean isDone = librarianAccountsController.removeAccount(_accountID);
        
        if(!isDone)
            throw new Exception("There is no account with this ID");
        
        updateAccountsDatabase();
    }
    
    public LibrarianAccount getLoggedAccount() throws Exception{
        isLogged();
        return librarianAccountsController.getLoggedAccount();
    }
    
    public ArrayList<LibrarianAccount> getAllAccoutns() throws Exception{
        isLogged();
        return librarianAccountsController.getAllAccoutns();
    }

}
