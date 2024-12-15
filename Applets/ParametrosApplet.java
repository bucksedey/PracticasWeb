/* La etiqueta <param> del HTML la invoca el applet. */
/* El método getParameter() lee valores de <param>. */
import java.awt.*;
import java.applet.Applet;
public class ParametrosApplet extends Applet{
	String s;
	int velocidad;
	public void init(){
		String v;
		v = getParameter("velocidad");
		if(v==null){
			velocidad = 10;
		} else{
			v = Integer.parseInt(v);
		}
		s = "Cambio de velocidad: " + velocidad;
	}
	public void paint(Graphics g){
		g.drawString(s, 25, 25);
	}
}

/* 
<html>
<applet code=ParametrosApplet.class width=200 height=200>
	<param name=velocidad value="12">
	<param name=distancia valor="500m">
</applet>
</html>
 */

