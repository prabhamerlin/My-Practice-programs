import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Circle extends JPanel
{
	public void paint(Graphics g)
	{
		setSize(500, 500);
		g.drawOval(250, 250, 250, 250);
		g.setColor(Color.gray);
		g.fillOval(250, 250, 250, 250);
		g.drawLine(125, 125, 250, 250);
		g.setColor(Color.magenta);
	}
	

}
