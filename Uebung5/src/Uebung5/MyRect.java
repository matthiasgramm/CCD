package Uebung5;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

public class MyRect extends GeometricObject
{
	MyRect()
	{
		super();
	}
	
	@Override
	void specialPaint(Graphics g, int relativeSize) 
	{
		//g.setColor(new Color(122,1,122));
		int marginX = (getWidth() - relativeSize) / 2;
		int marginY = (getHeight() - relativeSize) / 2;
		g.fillRect(marginX, marginY,relativeSize,relativeSize);
		validate();
	}
	
}
