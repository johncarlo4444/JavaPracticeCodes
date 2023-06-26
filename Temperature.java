import javax.swing.JOptionPane;

public class Temperature {
    public static void main(String[] args) {
        // Prompt the user to enter a temperature in Celsius
        String input = JOptionPane.showInputDialog("Enter a temperature in Celsius:");

        // Parse the input string to a double
        double celsius = Double.parseDouble(input);

        // Convert Celsius to Fahrenheit
        double fahrenheit = (celsius * 9/5) + 32;

        // Convert Celsius to Kelvin
        double kelvin = celsius + 273.15;

        // Display the results in message dialogs
        String message = "Celsius: " + celsius + "\n"
                + "Fahrenheit: " + fahrenheit + "\n"
                + "Kelvin: " + kelvin;

        JOptionPane.showMessageDialog(null, message, "Temperature Converter", JOptionPane.INFORMATION_MESSAGE);
    }
}
