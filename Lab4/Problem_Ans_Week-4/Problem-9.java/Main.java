public class Main {
    public static void main(String[] args) {
        User user = new User("JohnDoe", "john.doe@example.com");
        System.out.println("Username: " + user.getUsername());
        System.out.println("Email: " + user.getEmail());
    }
}
