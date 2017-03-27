package learn.tdd;

/**
 * Created by mb00549 on 3/24/2017.
 */
public class Customer {
    private String email;
    private boolean wantEmail = false;
    public boolean prefersEmails() {
        return wantEmail;
    }

    public Object getEmail() {
        return "manishbaghel@gmail.com";
    }

    public void wantsEmail(boolean b) {
        wantEmail = b;
    }
}
