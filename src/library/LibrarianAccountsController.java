package library;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class LibrarianAccountsController implements Serializable{
    private HashMap<Integer, LibrarianAccount> idsAccountsMap;
    private int idGenerator;
    private boolean isLogged;
    private LibrarianAccount loggedAccount;
    
    
    private boolean isAccountExist(int _accountID){
        return (idsAccountsMap.containsKey(_accountID));
    }
    private boolean isUsernameTaken(String _username){
        for(LibrarianAccount account : idsAccountsMap.values()){
            if(account.getUsername() == _username)
                return true;
        }
        
        return false;
    }
    
    LibrarianAccountsController(){
        idsAccountsMap = new HashMap<>();
        idGenerator = 0;
        if(idsAccountsMap.isEmpty())
            createAccount("Youssef Adel", "admin", "admin");
    }
    
    public boolean doLogin(String _username, String _password){
        for(LibrarianAccount account : idsAccountsMap.values()){
            if(account.equals(_username, _password)){
                loggedAccount = account;
                isLogged = true;
                return isLogged;
            }
        }
        
        return false;
    }
    
    public void doSignout(){
        loggedAccount = null;
        isLogged = false;
    }
    
    public boolean isLogged(){
        return isLogged;
    }
    
    public boolean createAccount(String _name, String _username, String _password){
        //return false if the username is taken by another account
        if(isUsernameTaken(_username))
            return false;
                
        LibrarianAccount newAccount = new LibrarianAccount(++idGenerator, _name, _username, _password);
        
        idsAccountsMap.put(idGenerator, newAccount);
        return true;
    }
    
    public boolean removeAccount(int _accountID){
        //return false if the account not exist or it is logged in now
        if(!isAccountExist(_accountID))
            return false;
        
        //signout if the logged account the one which would be deleted
        if(loggedAccount.getId() == _accountID){
            doSignout();
        }
        
        idsAccountsMap.remove(_accountID);
        return true;
    }
    
    public LibrarianAccount getLoggedAccount(){
        return loggedAccount;
    }
    
    public ArrayList<LibrarianAccount> getAllAccoutns(){
        ArrayList<LibrarianAccount> allAccounts = new ArrayList<>(idsAccountsMap.values());
        return allAccounts;
    }

}
