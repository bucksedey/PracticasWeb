// Applet sin parpadeo
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class PintaApplet2 extends Applet{
	private Point n = null;
	public void init(){
		addMouseListener(new Mouse());
	}
	public void update(Graphics g){
		paint(g);
	}
	public void paint(Graphics g){
		if(n != null){
			g.drawString("Hola!", n.x, n.y);
		}
	}
	private class Mouse extends MouseAdapter{
		public void mousePressed(MouseEvent e){
			n = e.getPoint();
			repaint();
		}
	}
}

/* <applet code=PintaApplet2.class width=100 height=100> </applet> */