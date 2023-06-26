import javax.swing.JOptionPane;

public class Calculator {
    public static void main(String[] args) {
        // Prompt the user to enter two numbers
        String firstNumber = JOptionPane.showInputDialog("Enter the first number:");
        String secondNumber = JOptionPane.showInputDialog("Enter the second number:");

        // Parse the input strings to integers
        int number1 = Integer.parseInt(firstNumber);
        int number2 = Integer.parseInt(secondNumber);

        // Create an array of possible operations
        String[] options = {"Addition", "Subtraction", "Multiplication", "Division"};

        // Display a dialog box to choose an operation
        int choice = JOptionPane.showOptionDialog(null, "Select an operation:", "Simple Calculator",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

        // Perform the selected operation and display the result
        int result = 0;
        String operation = "";

        switch (choice) {
            case 0:
                result = number1 + number2;
                operation = "Addition";
                break;
            case 1:
                result = number1 - number2;
                operation = "Subtraction";
                break;
            case 2:
                result = number1 * number2;
                operation = "Multiplication";
                break;
            case 3:
                result = number1 / number2;
                operation = "Division";
                break;
        }

        JOptionPane.showMessageDialog(null, operation + " result: " + result, "Simple Calculator", JOptionPane.INFORMATION_MESSAGE);
    }
}
