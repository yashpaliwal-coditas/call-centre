package evaluation0903;

public class UserDoesNotExistException extends Exception{
    UserDoesNotExistException(){
        System.out.println("You have entered wrong mobile number");
    }
}
