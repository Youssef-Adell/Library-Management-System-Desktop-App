package library;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class BooksController implements Serializable{
    private HashMap<Integer, Book> idsBooksMap;
    private int idGenerator;
    
    
    private boolean isBookExist(int _bookID){
        return (idsBooksMap.containsKey(_bookID));
    }

    BooksController(){
        idsBooksMap = new HashMap<>();
        idGenerator = 0;
    }
    
    public void addBook(String _ISBN, String _title, String _author){
        Book newBook = new Book(++idGenerator, _ISBN, _title, _author);
        
        idsBooksMap.put(idGenerator, newBook);
    }
    
    public boolean removeBook(int _bookID){
        //return false if the book not exist or it is borrowed
        if(!isBookExist(_bookID) || idsBooksMap.get(_bookID).isBorrowed())
            return false;
        
        idsBooksMap.remove(_bookID);
        return true;
    }
  
    public boolean borrowBook(int _bookID){
        //return false if the book not exist or it is unavilable
        if(!isBookExist(_bookID) || idsBooksMap.get(_bookID).isBorrowed())
            return false;
        
        idsBooksMap.get(_bookID).setIsBorrowed(true);
        return true;
    }    
    
    public boolean returnBook(int _bookID){
        //return false if the book not exist nor it is borrowed
        if(!isBookExist(_bookID) || !idsBooksMap.get(_bookID).isBorrowed())
            return false;
        
        idsBooksMap.get(_bookID).setIsBorrowed(false);
        return true;
    }    
    
    public ArrayList<Book> getAllBooks(){
        ArrayList<Book> allBooks = new ArrayList<>(idsBooksMap.values());
        return allBooks;
    }
    
    public ArrayList<Book>  getAvailableBooks(){
        ArrayList<Book> avialableBooks = new ArrayList<>();

        for(Book book : idsBooksMap.values()){
            if(!book.isBorrowed())
                avialableBooks.add(book);
        }

        return avialableBooks;
    }
    
    public ArrayList<Book>  getBorrowedBooks(){
        ArrayList<Book> borrowedBooks = new ArrayList<>();

        for(Book book : idsBooksMap.values()){
            if(book.isBorrowed())
                borrowedBooks.add(book);        
        }
        
        return borrowedBooks;
    }
    
}
