import javax.swing.JOptionPane;

public class TracksIF {
    public static void main(String[] args) {
        String[] strands = {"STEM", "ABM", "HUMSS", "GAS", "TVL"};

        int choice = JOptionPane.showOptionDialog(
                null,
                "Select a strand:",
                "Senior High School Strands",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                strands,
                strands[0]
        );

        if (choice >= 0) {
            String selectedStrand = strands[choice];
            JOptionPane.showMessageDialog(
                    null,
                    "You selected " + selectedStrand + " strand."
            );
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "No strand selected.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
}
