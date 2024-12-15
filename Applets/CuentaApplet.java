import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class CuentaApplet extends Applet{
	int cuenta;
	public void init(){
		cuenta = 0;
	}
	public void paint(Graphics g){
		g.drawString("Este es un Applet", 25, 25);
		++cuenta;
		g.drawString("Veces de llamadas a Paint:" + cuenta, 25, 50);
	}
}
/* <applet code=CuentaApplet.class width=100 height=100> </applet> */