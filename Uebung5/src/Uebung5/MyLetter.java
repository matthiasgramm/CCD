package Uebung5;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

public class MyLetter extends JPanel
{

	public MyLetter(Image i) 
	{
		 ihh = i;
	}
	
	Image ihh;
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		g.drawImage(ihh , 0, 0, 200, 200, this);
	}
}
