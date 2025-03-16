public class User {
    private final String username;
    private final String email;

    // Constructor to initialize the fields
    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    // Getter methods to access the fields
    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }
}
