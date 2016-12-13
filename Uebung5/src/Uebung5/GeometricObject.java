package Uebung5;

import java.awt.Color;
//import java.util.Random;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.RescaleOp;
import java.util.logging.Logger;

 
import java.awt.event.MouseMotionAdapter;  

import javax.swing.*; 
import javax.swing.event.MouseInputAdapter;


abstract class GeometricObject extends JPanel implements MouseListener, MouseMotionListener
{
	private Color myColor;

	int xVar;
	int yVar;
	int posiX;
	int posiY;
	int shapegroesse;
	int relativeSize;
	int GroesseX;
	int GroesseY;
	
	
	public void mouseClicked(MouseEvent me)
	{
	System.out.println("Geklickt!!!");
	System.out.println(me.toString());

	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		int maxi = Math.min(getWidth(), getHeight());
		if(maxi < 15) maxi = 15;
		setRelativeSize((int)(Math.random() * maxi));
		repaint();
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Hallo!");
		setColor(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int) Math.random()*255));
		repaint();
	}  		
  		//addMouseListener(e);
  		//addMouseMotionListener(e); 

	
	GeometricObject()
	{
		//addMouseListener((MouseListener)this);
		//addMouseMotionListener((MouseMotionListener)this);
//		super();
//		xVar = this.getX();
//		yVar = this.getY();
//		posiX = getWidth();
//		posiY = getHeight();	
	}
	
	void setColor(Color color)
	{
		myColor = color;
	}
	
	abstract void specialPaint(Graphics g, int relativeSize);
	
	@Override
	public void paint(Graphics g)
	{
		super.paint(g);
		
		//g.setColor(Color.RED);
		int w = (int)getWidth();
		int h = (int)getHeight();
		g.drawRect(0, 0, w, h);
		g.setColor(myColor);
		System.out.println(relativeSize);
		
		if(h < w)
			specialPaint(g, h * relativeSize / 50);
		else
			specialPaint(g, w * relativeSize / 50);
		
		//der kleinere Wert im Feld mal die relative Gršsse, die ich eingestellt habe
	}
	
	public void setRelativeSize(int shapegroesse)
	{
		System.out.println("Relative Grš§e gesetzt:" + shapegroesse);
		this.relativeSize = shapegroesse;	
	}
}
