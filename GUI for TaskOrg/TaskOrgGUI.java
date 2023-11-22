import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JButton;

class TaskOrgGUI {

    public TaskOrgGUI() {

        JFrame frame = new JFrame();

        JButton button = new JButton("Click over here");

        
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Task Organizer");
        frame.pack();
        frame.setVisible(true);

    }
    public static void main(String[] args) {

        new TaskOrgGUI();

        }
}