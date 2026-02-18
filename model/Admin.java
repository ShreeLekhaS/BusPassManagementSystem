package model;

public class Admin {
    private String email = "admin@gmail.com";
    private String password = "admin123";

    public boolean login(String email, String password) {
        return this.email.equals(email) && this.password.equals(password);
    }
}
