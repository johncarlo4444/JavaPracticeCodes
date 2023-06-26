import javax.swing.JOptionPane;

public class TracksOrigDropDown {
    public static void main(String[] args) {
        String[] strands = {"STEM", "ABM", "HUMSS", "GAS", "TVL"};
        String selectedStrand = null;

        do {
            selectedStrand = (String) JOptionPane.showInputDialog(
                    null,
                    "Select a strand:",
                    "Strand Selection",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    strands,
                    strands[0]
            );

            if (selectedStrand == null) {
                JOptionPane.showMessageDialog(
                        null,
                        "No strand selected.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        } while (selectedStrand == null);

        JOptionPane.showMessageDialog(null, "You selected: " + selectedStrand);
    }
}
