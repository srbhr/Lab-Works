//program to print hello world using applet
import java.applet.Applet; 
import java.awt.Graphics; 
public class helloApplet extends Applet 
{ 
	@Override
	public void paint(Graphics g) 
	{ 
		g.drawString(" hello world !!! ", 25, 25); 
	} 	
} 