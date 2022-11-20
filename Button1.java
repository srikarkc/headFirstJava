import javax.swing.*;
import java.awt.*;

public class Button1 {
	public static void main(String[] args) {
		Button1 gui = new Button1();
		gui.go();
	}
	public void go() {
		// Create a button for each region. Realize that NORTH & SOUTH regions, you can get whatever height you want but the width is fixed. With the EAST & WEST regions, you can get whatever width you want but the height is fixed. With the center region, you get whatever is left.
		JFrame frame = new JFrame();

		JButton east = new JButton("East");
		JButton west = new JButton("West");
		JButton north = new JButton("North");
		JButton south = new JButton("South");
		JButton center = new JButton("Center");
		
		frame.getContentPane().add(BorderLayout.EAST, east);
		frame.getContentPane().add(BorderLayout.WEST, west);
		frame.getContentPane().add(BorderLayout.NORTH, north);
		frame.getContentPane().add(BorderLayout.SOUTH, south);
		frame.getContentPane().add(BorderLayout.CENTER, center);
		
		/* OLD CODE
		JFrame frame = new JFrame();
		JButton button = new JButton("Click like you mean it.");
		// Setting big font for the text on the button
		Font bigFont = new Font("serif", Font.BOLD, 28);
		button.setFont(bigFont);
		*/
		
		//frame.getContentPane().add(BorderLayout.NORTH, button);
		frame.setSize(300,300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}	
}

