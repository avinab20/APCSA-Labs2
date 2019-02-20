// Lab06v100.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.util.*; 
                                                                

public class Lab06v100 extends Applet
{
    
    public void paint(Graphics g)   
    {
        // Draw Grid
        g.drawRect(10,10,780,580);
        g.drawLine(400,10,400,590);
        g.drawLine(10,300,790,300);
        
        // Draw Random Lines
        for (int k=0; k<100; k++){
            int x1 = (int)(Math.random()*390+10);
            int y1 = (int)(Math.random()*290+10);
            int x2 = (int)(Math.random()*390+10);
            int y2 = (int)(Math.random()*290+10);
            int red = (int)(Math.random()*256);
            int green = (int)(Math.random()*256);
            int blue = (int)(Math.random()*256);
            g.setColor(new Color(red,green,blue));
            g.drawLine(x1,y1,x2,y2);
        }
        
        // Draw Random Squares
         for (int k=0; k<100; k++){
            int x1 = (int)(Math.random()*340+401);
            int y1 = (int)(Math.random()*240+10);
            int red = (int)(Math.random()*256);
            int green = (int)(Math.random()*256);
            int blue = (int)(Math.random()*256);
            g.setColor(new Color(red,green,blue));
            g.fillRect(x1,y1,50,50);
        }
        
        // Draw Random Circles
        for (int k=0; k<100; k++){
            int x1 = (int)(Math.random()*190+11);
            int y1 = (int)(Math.random()*90+301);
            int diam = (int)(Math.random()*201);
            int red = (int)(Math.random()*256);
            int green = (int)(Math.random()*256);
            int blue = (int)(Math.random()*256);
            g.setColor(new Color(red,green,blue));
            g.drawOval(x1,y1,diam,diam);
        }

        // Draw 3-D Box
        Polygon square = new Polygon();
        square.addPoint(525,425);
        square.addPoint(625,425);
        square.addPoint(625,525);
        square.addPoint(525,525);
        g.setColor(new Color(140,200,20));
        g.fillPolygon(square);
        
        Polygon tri = new Polygon();
        tri.addPoint(575,375);
        tri.addPoint(625,425);
        tri.addPoint(575,425);
        g.setColor(new Color(120,100,250));
        g.fillPolygon(tri);
    
        Polygon trap = new Polygon();
        trap.addPoint(575,375);
        trap.addPoint(575,425);
        trap.addPoint(525,425);
        trap.addPoint(475,375);
        g.setColor(new Color(170,100,220));
        g.fillPolygon(trap);
        
        Polygon trap2 = new Polygon();
        trap2.addPoint(525,425);
        trap2.addPoint(525,525);
        trap2.addPoint(475,475);
        trap2.addPoint(475,375);
        g.setColor(new Color(250,100,200));
        g.fillPolygon(trap2);
    
    }
        
}



    
 