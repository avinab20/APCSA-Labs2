// Lab04bvst.java
// The AWT Graphics Program
// This is the student, starting version of Lab04b.


import java.awt.*;
import java.applet.*;


public class Lab04bvst extends Applet
{

    public void paint(Graphics g)
    {
       // DRAW CUBE
       g.drawRect(0,0,225,225);
       g.drawRect(100,75,225,225);
        
       g.drawLine(0,0,100,75);
       g.drawLine(0,225,100,300);
       g.drawLine(225,0,325,75);
       g.drawLine(225,225,325,300);

       // DRAW SPHERE
       g.drawOval(50,37,225,225);//circle
       
       g.drawOval(50,67,225,165);//ovals horizontally
       g.drawOval(50,97,225,105);
       g.drawOval(50,120,225,60);
       
       g.drawOval(80,37,165,225);//ovals vertically
       g.drawOval(110,37,105,225);
       g.drawOval(135,37,60,225);

       // DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE
       g.drawOval(750,250,200,200);//outer circle
       
       g.drawLine(850,250,760,390);//triangle
       g.drawLine(850,250,940,390);
       g.drawLine(760,390,940,390);
        
       g.drawOval(800,290,100,100);//inner circle

       // DRAW APCS
       g.fillRect(75,375,25,125);
       g.fillRect(100,375,25,25);
       g.fillRect(125,375,25,125);
       g.fillRect(100,425,25,25);//A
       
       g.fillRect(175,375,25,125);
       g.fillRect(200,375,25,25);
       g.fillRect(200,425,25,25);
       g.fillRect(225,375,25,75);//P
        
       g.fillRect(275,375,25,125);
       g.fillRect(300,375,50,25);
       g.fillRect(300,475,50,25);//C
       
       g.fillRect(375,375,75,25);
       g.fillRect(375,400,25,25);
       g.fillRect(375,425,75,25);
       g.fillRect(425,450,25,25);
       g.fillRect(375,475,75,25);//S

       // DRAW PACMEN FLOWER
       g.fillArc(600,440,100,100,315,270);//bottom
       g.fillArc(600,310,100,100,135,270);//top
       g.fillArc(665,375,100,100,45,270);//right
       g.fillArc(535,375,100,100,225,270);//left

    }

}


