package main;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class GUI extends JFrame{
	
	private JPanel canvas;
	private JPanel keyPad;
	
	
	/**
	 * 
	 * @param sit
	 */
	public GUI(Situation sit) { // IntBinaryOperator
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		canvas = new JPanel(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		keyPad = new JPanel(new GridLayout(4,4,5,5));
		sit.display = new JLabel("0"); // Startar displayen med siffran noll när man startar programmet
		sit.display.setVisible(true);
		sit.display.setPreferredSize(new Dimension(300, 300));
		canvas.add(sit.display);
		canvas.add(keyPad);
		setContentPane(canvas);
		
		pack();
		setVisible(true);
	}
	
	
}
