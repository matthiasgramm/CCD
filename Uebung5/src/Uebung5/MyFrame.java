package Uebung5;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.RescaleOp;
import java.io.File;
import java.util.logging.Logger;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;


class MyFrame extends JFrame 
{
	private static final String EXIT_ON_CLOSE = null;

	MyFrame()
	{
		this.setSize(400,400);
		this.setLayout(new GridLayout(15,15));
		final JPanel panel = new JPanel();
		panel.setSize(400, 400);
		JMenuBar bar = new JMenuBar();
		JMenu menu = new JMenu();
		final Image[] buchstabenImages = new Image[26];
		JMenuItem bilderLadenItem = new JMenuItem();
		bilderLadenItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				JFileChooser chooser = new JFileChooser();
				chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				chooser.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						JFileChooser chooser = (JFileChooser)arg0.getSource();
						File selectedFile = chooser.getSelectedFile();
						Toolkit defaultTK = Toolkit.getDefaultToolkit();
						File[] enthalteneDateien = selectedFile.listFiles();
						for(int i = 0; i < enthalteneDateien.length; i++) {
							if(i > 25)
								return;
							buchstabenImages[i] = defaultTK.createImage(enthalteneDateien[i].toString());
						}
					}
				});
				chooser.showOpenDialog(null);
			}
		});
		bilderLadenItem.setText("Bilderquelle wählen");
		menu.setText("Optionen");
		menu.add(bilderLadenItem);
		bar.add(menu);
		
		JTextField eingabefeld = new JTextField();
		JFrame outer = this;
		eingabefeld.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent event) {
				// TODO Auto-generated method stub
				JTextField herkunft = (JTextField)event.getSource();
				System.out.println("Es wurde der Text: >>" + herkunft.getText() + "<< eingegeben.");
				for(int i = 0; i < herkunft.getText().length(); i++) {
					char aktuellerBuchstabe = herkunft.getText().charAt(i);
					int arrayPlace = Character.getNumericValue(aktuellerBuchstabe) - 10;
					MyLetter letter = new MyLetter(buchstabenImages[arrayPlace]);
					letter.setSize(200,200);
					panel.add(letter);
				}
				repaint();
				validate();
			}
		});
		this.add(bar);
		this.add(panel, BorderLayout.CENTER);
		this.add(eingabefeld, BorderLayout.SOUTH);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void setDefaultCloseOperation(String exitOnClose) {
		// TODO Auto-generated method stub		
	}
}
