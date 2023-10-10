package library;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class StudentsController implements Serializable {
    private HashMap<Integer, Student> idsStudentsMap;
    private int idGenerator;
    
    
    private boolean isStudentExist(int _studentID){
        return (idsStudentsMap.containsKey(_studentID));
    }

    StudentsController(){
        idsStudentsMap = new HashMap<>();
        idGenerator = 0;
    }
    
    public void addStudent(String _name, int _year, String _phone){
        Student newStudent = new Student(++idGenerator, _name, _year, _phone);
        
        idsStudentsMap.put(idGenerator, newStudent);
    }
    
    public boolean removeStudent(int _studentID){
        //return false if the student not exist
        if(!isStudentExist(_studentID) || idsStudentsMap.get(_studentID).hasBorrowedBooks())
            return false;
        
        idsStudentsMap.remove(_studentID);
        return true;
    }
   
    public boolean makeStudentBorrowBook(int _studentID, int _bookID){
        if(!isStudentExist(_studentID))
            return false;
        
        idsStudentsMap.get(_studentID).borrowBook(_bookID);
        return true;
    }
    
    public boolean makeStudentReturnBook(int _studentID, int _bookID){
        if(!isStudentExist(_studentID))
            return false;
        
        //return true if the process Succeed and return false if the user diddnt borrow this book before
        boolean isDone = idsStudentsMap.get(_studentID).returnBook(_bookID);
        return isDone;
    }

    public ArrayList<Student> getAllStudents(){
        ArrayList<Student> allStudents = new ArrayList<>(idsStudentsMap.values());
        return allStudents;
    }
    
    public ArrayList<Student>  getStudentsWhoBorrowedBooks(){
        ArrayList<Student> studentsWhoBorrowedBooks = new ArrayList<>();

        for(Student student : idsStudentsMap.values()){
            if(student.hasBorrowedBooks())
                studentsWhoBorrowedBooks.add(student);
        }

        return studentsWhoBorrowedBooks;
    }
}
