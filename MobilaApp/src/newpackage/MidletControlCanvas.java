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
public class MidletControlCanvas extends MIDlet {
    Display disp = Display.getDisplay(this);
    public void startApp() {
        disp.setCurrent(new KeyControl());
    }

    public void pauseApp() {
    }

    public void destroyApp(boolean unconditional) {
    }

    class KeyControl extends Canvas {

        int w = getWidth();
        int h = getHeight();
        int x = w/2-20;
        int y = h/2-20;
        protected void paint(Graphics g) {
            g.setColor(255,255,255);
            g.fillRect(0, 0, w, h);
            g.setColor(255,0,0);
            g.fillRect(x, y, 40, 40);
        }

        protected void keyPressed(int keyCode) {
            int myKey = getGameAction(keyCode);
            switch(myKey)
            {
                case UP:
                    if(y>0)
                    y-=10; break;
                case DOWN:
                    if(y<h-40)
                    {
                    y+=10;

                    }
                    break;
                case RIGHT:
                    x+=10; break;
                case LEFT:
                    x-=10; break;
                default:break;

            }
            repaint();
            if(keyCode==KEY_NUM5) {
                System.out.println("yahoo");
            }

            }
        protected void pointerPressed(int x,int y) {
            this.x=x;
            this.y=y;
            repaint();
            }


    }
}
