/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package newpackage;

import java.io.IOException;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/**
 *
 * @author Melek
 */
public class ImageCanvas extends Canvas {

    int w= getWidth();
    int h= getHeight();
    Image img;
    
    protected void paint(Graphics g) {
        try {
            g.setColor(255, 255, 255);
            g.fillRect(0, 0, w, h);
            img = Image.createImage("/images/exit.gif");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        g.drawImage(img, 0, 0, Graphics.LEFT|Graphics.TOP);
        g.drawImage(img, w, h, Graphics.RIGHT|Graphics.BOTTOM);
        g.drawImage(img, w/2, h/2, Graphics.HCENTER|Graphics.VCENTER);
    }

}
