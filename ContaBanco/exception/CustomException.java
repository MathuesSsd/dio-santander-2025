package ContaBanco.exception;

public class CustomException extends RuntimeException {
    
    public CustomException(final String messege, final Throwable cause){
        super(messege, cause);
    }

}
