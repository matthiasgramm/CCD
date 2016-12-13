package Uebung5;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;


public class Smiley extends Circle
{
	Smiley()
	{
		super();	
	}
	int smile = 0;
	
	
	@Override
	public void mySmileyPaint(Graphics g, int xSize, int ySize, int xStart, int yStart)
	{
		g.fillOval(xStart, yStart, xSize, ySize);
		
		g.setColor(Color.BLACK);
		
		g.setColor(new Color(255, 255, 255));
		g.fillArc(xStart+xSize/3, yStart+ySize/3, xSize/5, ySize/5, 0, 360);
		g.fillArc(xStart+xSize*2/3, yStart+ySize/3, xSize/5, ySize/5, 0, 360);
		
		
		switch(smile)
		{
			case 0: g.drawArc(xStart+xSize/4, (int)(yStart+ySize/2), xSize/2, ySize/2, 0, 180);
					break;
			case 1: g.drawLine(xStart+xSize/4, (int)(yStart+ySize/1.5), xStart+(xSize/4*3), (int)(yStart+ySize/1.5));
					break;
			case 2: g.drawArc(xStart+xSize/4, (int)(yStart+ySize/3), xSize/2, ySize/2, 180, 180);
					break;
			default: g.drawLine(xStart+xSize/4, (int)(yStart+ySize/1.5), xStart+(xSize/4*3), (int)(yStart+ySize/1.5));
		}
		
		
	}
	
	public void changeSmile()
	{
		smile = smile + 1;
		if(smile > 2)
			smile = 0;
	}
	
	public void mouseClicked(MouseEvent e)
	{
		changeSmile();
		System.out.println("Hallo Smiley " + smile);
		repaint();
	}
	
	@Override
	void specialPaint(Graphics g, int relativeSize)		
	{
		
		int marginX = (getWidth() - relativeSize) / 2;
		int marginY = (getHeight() - relativeSize) / 2;
		mySmileyPaint(g, relativeSize, relativeSize, marginX, marginY);
		
		validate();
	}	
}
