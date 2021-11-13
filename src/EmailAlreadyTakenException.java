public class EmailAlreadyTakenException extends RuntimeException{
    public EmailAlreadyTakenException(String this_email_has_been_taken) {
        super(this_email_has_been_taken);
    }
}
