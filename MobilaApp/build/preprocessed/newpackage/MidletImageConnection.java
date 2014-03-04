/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package newpackage;

import java.io.DataInputStream;
import java.io.IOException;
import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;
import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
/**
 * @author Melek
 */
public class MidletImageConnection extends MIDlet {
    Display disp = Display.getDisplay(this);
    HttpConnection hc;
    DataInputStream ds;
    Form myForm = new Form("Affichage image");
    byte tabImage[];
    Image img;
    
    public void startApp() {
        try {
            hc = (HttpConnection) Connector.open("http://localhost/x/exit.gif");
            ds=new DataInputStream(hc.openDataInputStream());

            int taille = (int) hc.getLength();
            tabImage = new byte[taille];

            if(taille!=1)
            {
                ds.readFully(tabImage);
                img= Image.createImage(tabImage, 0, taille);
                myForm.append(img);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        disp.setCurrent(myForm);

    }

    public void pauseApp() {
    }

    public void destroyApp(boolean unconditional) {
    }
}
