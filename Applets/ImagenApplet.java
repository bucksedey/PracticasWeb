import java.awt.*;
import java.applet.*;
public class ImagenApplet extends Applet{
	Image imgen;
	public void init(){
		img = getImage(getDocumentBase(), "imagenes/imagen.gif");
	}
	public void paint(Graphics g){
		g.drawImage(img, 25, 25, this);
	}
}

/* <applet code=ImagenApplet.class width=100 height=100> </applet> */
/* getImage(URL base, String target)
	Obtiene una imagen del archivo de target ubicado en la URL especificada 
	por base. Los valores devueltos son una instancia de la clase Image.
*/

