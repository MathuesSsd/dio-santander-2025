package ContaBanco.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(final String messege){
        super(messege);
    }
}
