import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class LupaApplet extends JApplet {
	panelDibujo pd;
	public void init(){
		pd=new panelDibujo();
		add(pd);
	}
}
class panelDibujo extends JPanel implements MouseMotionListener, MouseWheelListener{
	ImageIcon imagen;
	int x=0;
	int y=0;
	double zoom=1;
 	public panelDibujo(){
		imagen=new ImageIcon(getClass().getResource("help.jpg")); //getResource("../Imagenes/foto.jpg"));
		addMouseMotionListener(this);
		addMouseWheelListener(this);
	}
	public void paintComponent(Graphics g){
		super.paintComponents(g);
		Graphics2D g2d=(Graphics2D)g;
		g2d.scale(zoom, zoom);
		g2d.drawImage(imagen.getImage(), x, y, this);
	}
	@Override
	public void mouseDragged(MouseEvent e) { }
	@Override
	public void mouseMoved(MouseEvent e) {
		if(x>-(imagen.getIconWidth()-this.getWidth())){
			if(e.getX()>(this.getWidth()-50)){
				x-=10;
				repaint();
			}
		}
		if(x<0){
			if(e.getX()>0 && e.getX()<50){
				x+=10;
				repaint();
			}
		}
		if(y<0){
			if(e.getY()>0 && e.getY()<50){
				y+=10;
				repaint();
			}
		}
		if(y>-(imagen.getIconHeight()-this.getHeight())){
			if(e.getY()>(this.getHeight()-50)){
				y-=10;
				repaint();
			}
		}
	}
	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		if(e.getWheelRotation()<0){
			zoom+=-e.getUnitsToScroll()*0.3;
		}else{
			if(zoom>1){
				zoom-=e.getUnitsToScroll()*0.3;
			}
		}
		repaint();
	}
}
