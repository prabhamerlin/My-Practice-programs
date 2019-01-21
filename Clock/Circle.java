import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Line2D;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Circle extends JPanel implements ActionListener
{
	public void paint(Graphics g)
	{
		g.translate(getWidth()/2,getHeight()/2); // translate origin to center
		//g.scale(1.0, -1.0);
	
		setSize(500, 500);
		//g.drawOval(250, 250, 250, 250);
		
		int R = 120; //R = diameter
		g.setColor(Color.gray);
		g.drawOval(0-R/2, 0-R/2, R, R);
		
		
		//g.fillOval(R, R, R, R);
		
		
		///g.drawLine(x_mid, y_mid, x_end-100, y_end-100);
		//g.setColor(Color.magenta);
		
		
		
		//int hr = 3;
	//	int min = 45;
		
		
		/*3.00pm = 0 degree
		 * 3.15pm = 90 degree
		 * total = 360 degree
		 * 360/60 = 6 degree/min
		*/
		//  Date d = new Date();
		//System.out.println(d);
		
		//timer = new Timer(1000,new ActionListener())
		
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		int hr = calendar.get(Calendar.HOUR);
		int min = calendar.get(Calendar.MINUTE);
		int seconds = calendar.get(Calendar.SECOND);
		
		double angle = 0;
	    angle =	min * Math.toRadians(6); // 1 min = 6 degree
		
		
		
		
		//double x = Math.sin(angle) * R;
		//double hyp = R;
	    double min_hand_len = (R/2)*0.8;
		int x = (int) (min_hand_len * Math.sin(angle));
		int minute_x_end = x;
		
		int y = (int) (min_hand_len * Math.cos(angle));
		int minute_y_end = y;
		
		Graphics2D g2 = (Graphics2D) g;
	    g2.setStroke(new BasicStroke(2));
	   // g2.drawLine(...);   //thick
		g.drawLine(0,0, minute_x_end, -minute_y_end);
		
		
		//HOUR HAND
		double hour_angle = 0;
		hour_angle = ((hr*60)+min) * Math.toRadians(0.5); //1 hr = 0.5 degree
		
		double hour_hand_len = (R/2)* 0.5;
		int hour_x_end = (int) (hour_hand_len * Math.sin(hour_angle));
		int hour_y_end = (int) (hour_hand_len * Math.cos(hour_angle));
		g2.setStroke(new BasicStroke(4));
		g2.drawLine(0,0, hour_x_end, -(hour_y_end));
		
		//second hand
		
		double second_angle = 0;
		second_angle = seconds * Math.toRadians(0.1);
		double sec_hand_len = (R/2)*0.8;
		int sec_x_end = (int) (sec_hand_len * Math.sin(hour_angle)); //x = R sin(angle)
		int sec_y_end = (int) (sec_hand_len * Math.cos(hour_angle));// y= R cos(angle)
		g2.setStroke(new BasicStroke(1));
		g2.drawLine(0,0, sec_x_end, -(sec_y_end));
	}
	
	//https://stackoverflow.com/questions/34466885/trying-to-update-date-and-time-in-a-loop
	public final static int ONE_SECOND = 1000;
	
	Timer timer = new Timer(ONE_SECOND, new ActionListener() {
	    public void actionPerformed(ActionEvent evt) {
		//...Update the progress bar...

	        if (/* thread is done */) {
	            timer.stop();
	            //...Update the GUI...
	        }
	    }    
	});


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}}
