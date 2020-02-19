package assignment2.Ans13;

// Q13. Create a custom exception that do not have any stack trace.

// Testing the UserNotFoundException
public class CustomException {

    public static void main(String[] args){
        CustomException exp = new CustomException();
        try{
            exp.getUser();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    String getUser() throws UserNotFoundException{
        throw new UserNotFoundException("user not found");
    }
}
