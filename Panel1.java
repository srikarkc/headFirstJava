import javax.swing.*;
import java.awt.*;
import java.io.*;

public class Panel1 implements Serializable {
	public static void main(String[] args) {
		Panel1 gui = new Panel1();
		gui.go();
	}
	
	public void go() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		panel.setBackground(Color.darkGray);
		
		// Adding a button to the panel
		JButton button = new JButton("Shock Me!");
		panel.add(button);
		
		// Adding another 2 buttons to the Panel
		JButton buttonTwo = new JButton("This is another button.");
		JButton buttonThree = new JButton("I identify as a button.");
		panel.add(buttonTwo);
		panel.add(buttonThree);
		
		// If you need to change layout to Box Layout
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(BorderLayout.EAST, panel);
		frame.setVisible(true);
		frame.setSize(200, 200);
	}
}