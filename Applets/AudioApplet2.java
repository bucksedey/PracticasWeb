import java.awt.*;
import java.applet.*;
public class AudioApplet2 extends Applet{
	AudioClip sonido;
	public void init(){
		sonido = getAudioClip(getCodeBase(), "sonidos/sonido.mp3);
	}
	public void paint(Graphics g){
		g.drawString("Prueba de audio2", 25, 25);
	}
	public void start(){
		sonido.loop(); // sonido continuo
	}
	public void stop(){
		sonido.stop();
	}
}

/* <applet code=AudioApplet2.class width=100 height=100> </applet> */
/* getAudioClip(URL base, String target)
	Obtiene un sonido del archivo de target ubicado en la URL especificada 
	por base. Los valores devueltos son una instancia de la clase AudioClip.
*/

