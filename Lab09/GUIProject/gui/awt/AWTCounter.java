package hust.soict.hedspi.gui.awt;
import java.awt.*;
import java.awt.event.*; 
public class AWTCounter extends Frame implements ActionListener {
 private Label lblCount; 	// Declare a Label component
 private TextField tfCount; // Declare a TextField component
 private Button btnCount; 	// Declare a Button component
 private int count = 0; 	// Counter's value

 // Constructor to setup GUI components and event handlers
 public AWTCounter () {
 setLayout(new FlowLayout());
 // "super" Frame, which is a Container, sets its layout to FlowLayout to arrange
 // the components from left-to-right, and flow to next row from top-to-bottom.

 lblCount = new Label("Counter"); 	// construct the Label component
 add(lblCount); 					// "super" Frame container adds Label component

tfCount = new TextField(count + "", 10); // construct the TextField component with initial text
tfCount.setEditable(false);
add(tfCount);

 btnCount = new Button("Count");
 add(btnCount);

 btnCount.addActionListener(this);



 setTitle("AWT Counter"); 			// "super" Frame sets its title
 setSize(250, 100); 				// "super" Frame sets its initial window size
 setVisible(true);

 }

public static void main(String[] args) {
	AWTCounter app = new AWTCounter();
 }

public void actionPerformed(ActionEvent e) {
	++count; // Increase the counter value
	// Display the counter value on the TextField tfCount 
	tfCount.setText(count + ""); // Convert int to String
 }
}