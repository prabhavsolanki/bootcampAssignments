package assignment2.Ans13;

// Q13. Create a custom exception that do not have any stack trace.

// User defined exception
public class UserNotFoundException extends Exception {

    private String message;

    public UserNotFoundException(String message){
        this.message = message;
    }

    @Override
    public String toString(){
        return message;
    }
}
