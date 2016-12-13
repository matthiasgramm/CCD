package Uebung5;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.util.Random;

public class Pacman extends GeometricObject
{
	Pacman()
	{
		super();
	}
	
	@Override
	void specialPaint(Graphics g, int relativeSize)
		
	{
		int marginX = (getWidth() - relativeSize) / 2;
		int marginY = (getHeight() - relativeSize) / 2;
		g.fillArc(marginX, marginY, relativeSize, relativeSize, 50, 270);
		validate();
	}


}
