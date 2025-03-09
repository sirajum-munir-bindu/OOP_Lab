import java.util.Scanner;

public class Mian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        User u = new User("Bindu" , "bindu@gmeil.com");

        System.out.println("Username: " + u.getUsername());
        System.out.println("Email: " + u.getEmail());
    }
}
