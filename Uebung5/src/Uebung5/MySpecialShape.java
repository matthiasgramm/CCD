
package Uebung5;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

public class MySpecialShape extends GeometricObject
{
	MySpecialShape()
	{
		super();
	}
	
	@Override
	void specialPaint(Graphics g, int relativeSize) 
	{
		//int n = 3;	
		int []x=new int[5];
		int []y=new int[5];

	// A simple triangle.
	//x[0]=10; x[1]=getWidth()/2; x[2]=getWidth()-10; x[3]=getWidth()/2; x[4]=getWidth()-10; 
	//y[0]=getHeight()-10/2; y[1]=10; y[2]=getHeight()-10/2; y[3]=getHeight()/2; y[4]=getHeight()-10/2; 

	//int p = new int(x, y, n);  // This polygon represents a triangle with the above
	                           //   vertices.
	int marginX = (getWidth() - relativeSize) / 2;
	int marginY = (getHeight() - relativeSize) / 2;
	
	g.fillArc(marginX,marginY, relativeSize, (int)(relativeSize * 1.),230,220);
	validate();
	
	}

}	
