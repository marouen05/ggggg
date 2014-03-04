/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package newpackage;

import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.List;
import javax.microedition.midlet.*;

/**
 * @author Melek
 */
public class MidletMenu extends MIDlet implements CommandListener {
    Display disp = Display.getDisplay(this);
    String[] valeurs = {"DrawRect", "DrawCercle" };
    List mylist = new List("DrawForms",List.IMPLICIT,valeurs,null);
    public void startApp() {
        mylist.setCommandListener(this);
        disp.setCurrent(mylist);
    }

    public void pauseApp() {
    }

    public void destroyApp(boolean unconditional) {
    }

    public void commandAction(Command c, Displayable d) {
        if(c==List.SELECT_COMMAND)
        {
            disp.setCurrent(new ListeCanvas());
        }
    }
    class ListeCanvas extends Canvas implements CommandListener {

        int w = getWidth();
        int h = getHeight();
        Command cmdVibrate= new Command("Vibrate", Command.SCREEN, 0);
        Command cmdFlash = new Command("Flash",Command.SCREEN, 0);

        protected void paint(Graphics g) {
            this.setCommandListener(this);
            this.addCommand(cmdFlash);
            this.addCommand(cmdVibrate);
        g.setColor(255,255,255);
        g.fillRect(0, 0, w, h);
        g.setColor(255,0,0);
        g.drawLine(w/2, 0, w/2, h);
        g.drawLine(0, h/2, w, h/2);
        if(mylist.getSelectedIndex()==0)
        {
            g.fillRect(w/2-20, h/2-20, 40, 40);
        }
        if(mylist.getSelectedIndex()==1)
        {
            g.fillArc(w/2 -20, h/2-20, 40, 40, 0, 360);
        }
        }

        public void commandAction(Command c, Displayable d) {
            if(c== cmdFlash) {
                disp.flashBacklight(2000);
            }
            if(c== cmdVibrate) {
                disp.vibrate(2000);
            }
        }

    }
}
