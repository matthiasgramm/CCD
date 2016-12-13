package Uebung5;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

public class Circle extends GeometricObject
{
	Circle()
	{
		super();
	}
	
	
	
	@Override
	void specialPaint(Graphics g, int relativeSize)		
	{		
		int marginX = (getWidth() - relativeSize) / 2;
		int marginY = (getHeight() - relativeSize) / 2;
		g.fillOval(marginX, marginY,relativeSize,relativeSize);
		
		validate();
	}	




	public void mySmileyPaint(Graphics g, int xSize, int ySize, int xStart,
			int yStart) {
		// TODO Auto-generated method stub
		
	}


}
