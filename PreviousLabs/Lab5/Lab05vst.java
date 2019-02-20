// Lab05vst.java
// This is the student, starting version of the Lab05 assignment.


import java.awt.*;
import java.applet.*;


public class Lab05vst extends Applet
{
	public void paint(Graphics g)
	{
		int width = 980;
		int height = 630;
		int x1 = 10;
		int y1 = 640;
		int x2 = 990;
		int y2 = 640;
		g.drawRect(10,10,width,height);
		
		for (int i=0; i<50; i++)//bottom right
		{
		    g.drawLine(x1,y1,x2,y2);
		    x1+=20;
		    y2-=12;
		    
		}
		x1 = 10;
		y1 = 640;
		x2 = 990;
		y2 = 640;
		for (int i=0; i<50; i++)//bottom left
		{
		    g.drawLine(x1,y1,x2,y2);
		    x2-=20;
		    y1-=12;
		    
		}
		x1 = 10;
		y1 = 10;
		x2 = 990;
		y2 = 10;
		for (int i=0; i<50; i++)//top left
		{
		    g.drawLine(x1,y1,x2,y2);
		    y1+=12;
		    x2-=20;
		    
		}
		x1 = 10;
		y1 = 10;
		x2 = 990;
		y2 = 10;
		for (int i=0; i<50; i++)//top right
		{
		    g.drawLine(x1,y1,x2,y2);
		    y2+=12;
		    x1+=20;
		    
		}
		
		int width2 = 505;
		int height2 = 330;
		x1 = 245;
		y1 = 162;
		x2 = 750;
		y2 = 162;
		g.drawRect(245,162,width2,height2);
		
		for (int i=0; i<50; i++)// small top right
		{
		    g.drawLine(x1,y1,x2,y2);
		    y2+=6;
		    x1+=10;
		    
		}
		x1 = 245;
		y1 = 162;
		x2 = 750;
		y2 = 162;
		for (int i=0; i<50; i++)// small top left
		{
		    g.drawLine(x1,y1,x2,y2);
		    y1+=6;
		    x2-=10;
		    
		}
		x1 = 245;
		y1 = 492;
		x2 = 750;
		y2 = 492;
		for (int i=0; i<50; i++)//small bottom right
		{
		    g.drawLine(x1,y1,x2,y2);
		    x1+=10;
		    y2-=6; 
		    
		}
		x1 = 245;
		y1 = 492;
		x2 = 750;
		y2 = 492;
		for (int i=0; i<50; i++)//small bottom left
		{
		    g.drawLine(x1,y1,x2,y2);
		    x2-=10;
		    y1-=6;
		    
		}
	}
}

