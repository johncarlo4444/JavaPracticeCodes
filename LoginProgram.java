import javax.swing.JOptionPane;

public class LoginProgram {
    public static void main(String[] args) {
        // Predefined username and password
        String validUsername = "Carlo";
        String validPassword = "Ilagan";

        // username
        String username = JOptionPane.showInputDialog("Enter your username:");

        // password
        String password = JOptionPane.showInputDialog("Enter your password:");

        // Check if the entered credentials match the predefined values
        if (username.equals(validUsername) && password.equals(validPassword)) {
            JOptionPane.showMessageDialog(null, "Login successful!", "Login Program", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Invalid username or password.", "Login Program", JOptionPane.ERROR_MESSAGE);
        }
    }
}
