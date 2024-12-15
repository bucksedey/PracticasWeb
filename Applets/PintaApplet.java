import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class PintaApplet extends Applet{
	private Point n = null;
	public void init(){
		addMouseListener(new Mouse());
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
