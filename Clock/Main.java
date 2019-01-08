import java.awt.Color;

import javax.swing.*;

public class Main 
{

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("Current time");
		/*JPanel panel = new JPanel();
		panel.setBackground(Color.gray);*/
		frame.setSize(800, 800);
		Circle circlePanel = new Circle();
		frame.add(circlePanel);
		frame.setVisible(true);
		

	}

}
