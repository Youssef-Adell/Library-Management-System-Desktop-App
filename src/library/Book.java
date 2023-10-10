package library;
import java.io.Serializable;
import java.util.Date;
public class Book implements Serializable{
    private int id;
    private String ISBN;
    private String title;
    private String author;
    private final Date addedDate;
    private boolean isBorrowed;
    
    public Book(){
        addedDate = new Date();
        isBorrowed = false;
    }
    public Book(int _id, String _ISBN, String _title, String _author){
        id = _id;
        ISBN = _ISBN;
        title = _title;
        author = _author;
        addedDate = new Date();
        isBorrowed = false;
    }

    public String getStatus(){
        String status = isBorrowed == true? "Borrowed" : "Available";
        return status;
    }

    public int getId() {
        return id;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getAddedDate() {
        return addedDate.toString();
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setIsBorrowed(boolean _isBorrowed) {
        isBorrowed = _isBorrowed;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", ISBN=" + ISBN + ", title=" + title + ", author=" + author + ", addedDate=" + addedDate + ", Status=" + getStatus() + '}';
    }
    

}
