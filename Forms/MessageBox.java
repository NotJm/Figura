package Forms;
import javax.swing.JOptionPane;
import javax.swing.JInternalFrame;

public class MessageBox {

    public static void show(JInternalFrame window, String text, String title) {
        JOptionPane.showMessageDialog(window, text, title, JOptionPane.INFORMATION_MESSAGE);
    }
    public static String input(JInternalFrame window, String text, String title) {
        String response = JOptionPane.showInputDialog(window, text, title, JOptionPane.INFORMATION_MESSAGE);
        return response;
        
    }
}
