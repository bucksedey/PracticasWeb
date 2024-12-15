import java.awt.*;
import java.applet.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class AudioApplet extends Applet{
	public void init(){
		addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				play(getCodeBase(), "sonidos/sonido.mp3);
			}
		});
	}
	public void paint(Graphics g){
		g.drawString("Prueba de audio", 25, 25);
	}
}

/* <applet code=AudioApplet.class width=100 height=100> </applet> */
/* getAudioClip(URL base, String target)
	Obtiene un sonido del archivo de target ubicado en la URL especificada 
	por base. Los valores devueltos son una instancia de la clase AudioClip.
*/

