import javax.swing.JOptionPane;

public class TracksButtons {
    public static void main(String[] args) {
        String[] strands = {"STEM", "ABM", "HUMSS", "GAS", "TVL"};
        int selectedOption = -1;

        do {
            selectedOption = JOptionPane.showOptionDialog(
                    null,
                    "Select a strand:",
                    "Strand Selection",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    strands,
                    strands[0]
            );

            if (selectedOption == JOptionPane.CLOSED_OPTION) {
                JOptionPane.showMessageDialog(
                        null,
                        "No strand selected.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        } while (selectedOption == JOptionPane.CLOSED_OPTION);

        String selectedStrand = strands[selectedOption];
        JOptionPane.showMessageDialog(null, "You selected: " + selectedStrand);
    }
}
