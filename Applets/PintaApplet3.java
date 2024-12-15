// Otra alternativa de Applet sin parpadeo
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.List;
import java.util.ArrayList;
public class PintaApplet3 extends Applet{
	private List n = new ArrayList(5);
	public void init(){
		addMouseListener(new Mouse());
	}
	public void update(Graphics g){
		paint(g);
	}
	public void paint(Graphics g){
		for(int x=0; x<n.size(); x++){
			Point p = (Point) n.get(x);
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

/* <applet code=PintaApplet3.class width=100 height=100> </applet> */