//https://www.mkyong.com/java/java-display-list-of-timezone-with-gmt/
import javax.swing.*;

public class Main 
{

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("Current time");
		//JFrame frame2 = new JFrame("Current time2");
		/*JPanel panel = new JPanel();
		panel.setBackground(Color.gray);*/
		frame.setSize(800, 800);
		Circle circlePanel = new Circle();
		//Circle circlePanel2 = new Circle();
		frame.add(circlePanel);
		//frame2.add(circlePanel2);
		frame.setVisible(true);
		//frame2.setVisible(true);
		
		/*
		Graphics g = null;
		circlePanel.draw(g);
		circlePanel.paint(g);
*/
		circlePanel.start();
		//circlePanel2.start();
	}

}


