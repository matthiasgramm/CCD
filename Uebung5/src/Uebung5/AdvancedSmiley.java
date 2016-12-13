
package Uebung5;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;


public class AdvancedSmiley extends GeometricObject
{
	Image froehlich;
	Image normal;
	Image traurig;
	
	AdvancedSmiley()
	{
		super();	
		Toolkit defaultTK = Toolkit.getDefaultToolkit();
		froehlich= defaultTK.getImage("/Users/mats/Desktop/Fotosmiley/smiOne.jpg");
		normal= defaultTK.getImage("/Users/mats/Desktop/Fotosmiley/smiTwo.jpg");
		traurig= defaultTK.getImage("/Users/mats/Desktop/Fotosmiley/smiThree.jpg");
	}
	int smile = 0;
	
	

	public void mySmileyPaint(Graphics g, int xSize, int ySize, int xStart, int yStart)
	{	
		
		switch(smile)
		{
			case 0: g.drawImage(froehlich, xStart+shapegroesse/2+relativeSize/2, yStart+shapegroesse/2+relativeSize/2, relativeSize, relativeSize, this);
				// g.drawArc(xStart+xSize/4, (int)(yStart+ySize/2), xSize/2, ySize/2, 0, 180);
					break;
			case 1: g.drawImage(normal, xStart+relativeSize/2, yStart+relativeSize/2, relativeSize, relativeSize, this);
					//g.drawLine(xStart+xSize/4, (int)(yStart+ySize/1.5), xStart+(xSize/4*3), (int)(yStart+ySize/1.5));
					break;
			case 2: g.drawImage(traurig, xStart+relativeSize/2, yStart+relativeSize/2, relativeSize, relativeSize, this);
				// g.drawArc(xStart+xSize/4, (int)(yStart+ySize/3), xSize/2, ySize/2, 180, 180);
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
