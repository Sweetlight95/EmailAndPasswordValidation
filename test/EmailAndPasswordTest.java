import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailAndPasswordTest {
    EmailAndPassword emailAndPassword;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        emailAndPassword = new EmailAndPassword();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }
    @Test
    void testThatEmailCanBeCreated(){
        emailAndPassword.setEmail("Shade@gmail.com");
        assertEquals("Shade@gmail.com", emailAndPassword.getEmail());
    }
    @Test
    void testThatEmailIsValid() {
        InvalidEmailException invalidEmailException = assertThrows(InvalidEmailException.class,
                () -> emailAndPassword.setEmail("Shadegmail.com"));
        System.out.println(invalidEmailException.getMessage());
    }
    @Test
    void testThatEmailMustBeUnique(){
        emailAndPassword.addEmail("mango@gmail.com");
        emailAndPassword.addEmail("orange@gmail.com");
        assertEquals(2, EmailAndPassword.getEmails().size());

        assertThrows(EmailAlreadyTakenException.class, ()-> emailAndPassword.addEmail("mango@gmail.com"));

    }
}