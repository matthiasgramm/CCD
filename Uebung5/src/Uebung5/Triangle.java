package Uebung5;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

public class Triangle extends GeometricObject
{
	Triangle()
	{
		super();
	}
	
	@Override
	void specialPaint(Graphics g, int relativeSize) 
	{
		int []x=new int[4];
		int []y=new int[4];
		
		int marginX = (getWidth() - relativeSize) / 2;
		int marginY = (getHeight() - relativeSize) / 2;
		

	// A simple triangle.
	//x[0]= marginX; x[1]=relativeSize/2; x[2]=relativeSize; x[3]=relativeSize; 
	//y[0]= marginY; y[1]=relativeSize; y[2]=relativeSize; y[3]=relativeSize;
	x[0]= getWidth() / 2; x[1] = getWidth() - marginX; x[2]=marginX; //x[3]=relativeSize; 
	y[0]= marginY; y[1]=getHeight() - marginY; y[2]=getHeight() - marginY; //y[3]=relativeSize;
	//int n = 3;

	//int p = new int(x, y, n);  // This polygon represents a triangle with the above
	                           //   vertices.
	//g.setColor(new Color(130,76,61));
	g.fillPolygon(x,y,3);     // Fills the triangle above.
	validate();	
}
	
}
