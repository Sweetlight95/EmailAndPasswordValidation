import java.util.ArrayList;
import java.util.List;

public class EmailAndPassword {

    private String email;
    private static List<String> emails = new ArrayList<>();

    public void setEmail(String email) {
        if(email.matches("(.+)@(.+).com")) {
            this.email = email;
        }
        else {
            throw  new InvalidEmailException("Email is invalid");
        }
    }

    public String getEmail() {
        return email;
    }
    public void addEmail(String email){
        setEmail(email);
        for(String email1 : this.emails){
            if(email1.equals(email)){
                throw new EmailAlreadyTakenException("This email has been taken");
            }
        }
        emails.add(email);
        System.out.println(emails.toString());
    }

    public static List<String> getEmails() {
        return emails;
    }
}
