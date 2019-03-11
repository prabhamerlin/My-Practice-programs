import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JPanel;

public class Circle extends JPanel implements Runnable
{
	int R = 120; //R = diameter
	Thread thread = null;

	public void start() {  
		if (thread == null) {  
			thread = new Thread(this);  
			thread.start();  
		}  
	}  
	public void run() 
	{  
		while (thread != null) 
		{  
			try 
			{  
				repaint();
				Thread.sleep(100);  
			}
			catch (InterruptedException e) 
			{  
			}  


		}
	}  

	public void stop()  
	{  

		thread = null;  
	}  

	public void draw(Graphics g)
	{
		//g.translate(getWidth()/2,getHeight()/2); // translate origin to center
		//g.scale(1.0, -1.0);
		setSize(500, 500);

		//g.drawOval(250, 250, 250, 250);


		g.setColor(Color.gray);
		g.drawOval(0-R/2, 0-R/2, R, R);
	}
	public void paint(Graphics g)
	{

		g.translate(getWidth()/2,getHeight()/2); // translate origin to center
		//g.fillOval(R, R, R, R);
		g.setColor(Color.cyan);
		g.fillOval(0-R/2, 0-R/2, R, R);
		g.setColor(Color.gray);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		int hr = calendar.get(Calendar.HOUR);
		int min = calendar.get(Calendar.MINUTE);
		int seconds = calendar.get(Calendar.SECOND);


		//MINUTE HAND

		double min_angle =	min * Math.toRadians(6) + seconds * Math.toRadians(0.1); // 1 min = 6 degree
		// 1s = 0.1 degree

		//double x = Math.sin(angle) * R;
		//double hyp = R;
		double min_hand_len = (R/2)*0.8;
		int x = (int) (min_hand_len * Math.sin(min_angle));
		int minute_x_end = x;

		int y = (int) (min_hand_len * Math.cos(min_angle));	
		int minute_y_end = y;

		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(2));
		// g2.drawLine(...);   //thick
		g.drawLine(0,0, minute_x_end, -minute_y_end);


		//HOUR HAND

		double hour_angle = ((hr*60)+min) * Math.toRadians(0.5); //1 hr = 0.5 degree

		double hour_hand_len = (R/2)* 0.5;
		int hour_x_end = (int) (hour_hand_len * Math.sin(hour_angle));
		int hour_y_end = (int) (hour_hand_len * Math.cos(hour_angle));
		g2.setStroke(new BasicStroke(4));
		g2.drawLine(0,0, hour_x_end, -(hour_y_end));

		//second hand

		double second_angle = seconds * Math.toRadians(6); // 1s = 6 degree
		double sec_hand_len = (R/2)*0.8;
		int sec_x_end = (int) (sec_hand_len * Math.sin(second_angle)); //x = R sin(angle)
		int sec_y_end = (int) (sec_hand_len * Math.cos(second_angle));// y= R cos(angle)
		g2.setColor(Color.magenta);
		g2.setStroke(new BasicStroke(1));
		g2.drawLine(0,0, sec_x_end, -(sec_y_end));
	}

	//https://stackoverflow.com/questions/34466885/trying-to-update-date-and-time-in-a-loop


}
