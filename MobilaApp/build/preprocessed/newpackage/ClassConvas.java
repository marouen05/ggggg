package newpackage;


import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Melek
 */
public class ClassConvas extends Canvas {

    int w= getWidth();
    int h= getHeight();
    protected void paint(Graphics g) {
        g.setColor(250,250,250);
        g.fillRect(0, 0, w, h);
        g.setColor(255,0,0);
      /*  g.fillRect(0,0, w/2, h/2);
        g.setColor(0,255,0);
        g.fillArc(60, 100, 100, 100, 0, 360);*/

      /*  g.fillRect(w/2-w/4, h/2-h/4, w/2, h/2);
        g.setColor(0,255,0);
        g.drawLine(w/2, h, w/2, 0);
        g.drawLine(0, h/2, w, h/2);  */
     
        int rColor[]= { 0xff0000, 0xffa500, 0xffff00, 0xadff2f, 0x32cd32, 0x0000ff, 0x9400d3,0xffffff };
     /*   for(int i=0;i<8;i++)
        {
            g.setColor(rColor[i]);
            g.fillArc(w2/4-10, h2/4-10, w/2, h/2, 0, 180);
            h2+=10;
            w2+=10;
        }*/

     /*   int cmp= 0;
        for(int i=0; i<rColor.length;i++)
        {
            g.setColor(rColor[i]);
            g.fillArc(cmp,cmp,w-2*cmp, w-2*cmp, 0, 180);
            cmp+=10;
        }
        g.setColor(0,255,0);
        g.drawString("salem", w-20, h-20, Graphics.RIGHT|Graphics.BASELINE);
*/
    }

}
