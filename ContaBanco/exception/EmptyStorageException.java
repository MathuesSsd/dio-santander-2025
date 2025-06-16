package ContaBanco.exception;

public class EmptyStorageException extends RuntimeException {
    public EmptyStorageException(final String messege){
        super(messege);
    }
}
