/* Pinta "Hola!" en la posicion del mouse */
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class MouseApplet extends Applet{
	int x = 25;
	int y = 25;
	public void init(){
		addMouseListener(new Mouse());
	}
	public void paint(Graphics g){
		g.drawString("Hola!", x, y);
	}
	private class Mouse extends MouseAdapter{
		public void mousePressed(MouseEvent e){
			x = e.getX();
			y = e.getY();
			repaint();
		}
	}
}

/* <applet code=MouseApplet.class width=100 height=100> </applet> */


