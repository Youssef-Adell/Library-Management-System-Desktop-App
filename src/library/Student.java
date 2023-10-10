package library;
import java.io.Serializable;
import java.util.ArrayList;

public class Student implements Serializable{
    private int id;
    private String name;
    private int year;
    private String phone;
    private ArrayList<Integer> borrowedBooksIds;
    
    Student(){
        borrowedBooksIds = new ArrayList<>();
    }
    
    Student(int _id, String _name, int _year, String _phone){
        id = _id;
        name = _name;
        year = _year;
        phone = _phone;
        borrowedBooksIds = new ArrayList<>();
    }
    
    public void borrowBook(int _bookID){
        borrowedBooksIds.add(_bookID);
    }
    
    public boolean returnBook(int _bookID){
        // return false if this student didnt borrow this book
        if(!borrowedBooksIds.contains(_bookID))
            return false;
        
        borrowedBooksIds.remove((Integer)_bookID);
        return true;
    }

    public boolean hasBorrowedBooks(){
        return (borrowedBooksIds.size() >= 1);
    }

    public int getUnvId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return year;
    }

    public String getPhone() {
        return phone;
    }

    public ArrayList<Integer> getBorrowedBooksIds() {
        return borrowedBooksIds;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", year=" + year + ", phone=" + phone + ", borrowedBooksIds=" + borrowedBooksIds + '}';
    }
    
}
