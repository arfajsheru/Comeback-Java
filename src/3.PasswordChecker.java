import java.util.Scanner;

class PasswordChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password;
        int attempts = 0;

        while (attempts < 3) { // Maximum 3 attempts allowed
            System.out.print("Enter your password: ");
            password = input.next();

            if (isValidPassword(password)) {
                System.out.println("Thanks for entering a valid password!");
                return;
            } else {
                attempts++;
                System.out.println("Invalid password! " + (3 - attempts) + " attempts left.");
            }
        }
        System.out.println("Too many failed attempts. Account locked.");
    }

    public static boolean isValidPassword(String password) {
        if (password.length() < 8) {
            System.out.println("Password must be at least 8 characters long.");
            return false;
        }
        if (!password.matches(".*[A-Z].*")) { // Check for uppercase
            System.out.println("Password must contain at least one uppercase letter.");
            return false;
        }
        if (!password.matches(".*[a-z].*")) { // Check for lowercase
            System.out.println("Password must contain at least one lowercase letter.");
            return false;
        }
        if (!password.matches(".*\\d.*")) { // Check for digit
            System.out.println("Password must contain at least one digit.");
            return false;
        }
        if (!password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) { // Check for special character
            System.out.println("Password must contain at least one special character.");
            return false;
        }
        return true;
    }
}
