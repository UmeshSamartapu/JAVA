import java.applet.Applet;
import java.awt.Graphics;

/* 
<applet code="HelloWorldApplet.class" width="300" height="100">
</applet> 
*/

public class HelloWorldApplet extends Applet {

    @Override
    public void paint(Graphics g) {
        // Set the message to be displayed
        g.drawString("Hello, World!", 20, 50); 
        // Draw the string at coordinates (20, 50)
    }
}
