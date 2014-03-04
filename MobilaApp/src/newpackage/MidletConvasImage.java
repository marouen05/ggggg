/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package newpackage;

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
/**
 * @author Melek
 */
public class MidletConvasImage extends MIDlet {
    Display disp = Display.getDisplay(this);
    
    public void startApp() {
     //   disp.setCurrent(new ClassConvas());
        disp.setCurrent(new ImageCanvas());
    }

    public void pauseApp() {
    }

    public void destroyApp(boolean unconditional) {
    }
}
