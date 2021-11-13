public class InvalidEmailException extends RuntimeException{
    public InvalidEmailException(String email_is_invalid) {
        super(email_is_invalid);
    }
}
