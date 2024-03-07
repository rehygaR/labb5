package main;

import java.awt.event.ActionListener;

import javax.swing.JButton;

public abstract class CalculatorButton extends JButton implements ActionListener { // JLabel.getText(); returnerar en sträng som blir vår högra operand
	
	
	
	public CalculatorButton(Situation sit, String name) {
		
		super(name);
		this.addActionListener(this);
		
	}
	
	public abstract void transition();
	
	
	
}
