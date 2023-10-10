package library;

import java.io.Serializable;

public class LibrarianAccount implements Serializable{
    private int id;
    private String name;
    private String username;
    private String password;

    public LibrarianAccount(){
        
    }
    public LibrarianAccount(int _id, String _name, String _username, String _password) {
        id = _id;
        name = _name;
        username = _username;
        password = _password;
    }

    public boolean equals(String _username, String _password){
        return (username.equals(_username) && password.equals(_password));
    }
    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "LibrarianAccount{" + "id=" + id + ", name=" + name + ", username=" + username + ", password=" + password + '}';
    }

}