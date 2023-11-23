import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;


public class TaskOrgGUI {

    private JLabel label;
    private JFrame frame;
    private JPanel panel;
    private JTextField Text;
    private JTextField Text2;
    private JTextField Text3;

    public TaskOrgGUI() {

        frame = new JFrame("Please enter your tasks");

        Text = new JTextField(20);
        Text2 = new JTextField(20);
        Text3 = new JTextField(20);

        // Creating Button
        JButton submitButton = new JButton("Send");

        // Set Action to the button        

        label = new JLabel("");

        
        panel = new JPanel();

        // Creating Border for window

        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));


        // Creating the inside of the window

        panel.setLayout(new GridLayout(0, 1));
        panel.add(Text, BorderLayout.NORTH);
        panel.add(Text2, BorderLayout.NORTH);
        panel.add(Text3, BorderLayout.NORTH);
        panel.add(submitButton, BorderLayout.CENTER);
        panel.add(label, BorderLayout.SOUTH);

        // Centering the action
        frame.add(panel, BorderLayout.CENTER);

        // Setting the close button 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Setting the title of window 

        frame.setTitle("Task Organizer");
        frame.pack();
        frame.setVisible(true);

        submitButton.addActionListener(new ActionListener(){


    public void actionPerformed(ActionEvent e) {

        String Input = Text.getText();
        String Input2 = Text2.getText();
        String Input3 = Text3.getText();
        label.setText("User input: " + Input+ ", " + Input2 + ", "  + Input3);

    }

    });

    }
    public static void main(String[] args) {

        new TaskOrgGUI();

        }

}