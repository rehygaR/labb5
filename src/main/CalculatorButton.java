package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public abstract class CalculatorButton extends JButton implements ActionListener { // JLabel.getText(); returnerar en sträng som blir vår högra operand vid operationer
	
	Situation sit;
	
	
	/**
	 * Konstruktorn för den abstrakta klassen som ärvs av de konkreta knapparna
	 * som ska finnas på minirknaren.
	 * @param sit
	 * @param name
	 */
	public CalculatorButton(Situation sit, String name) {
		
		super(name); // Ger JButtonen namnet på knappen så man kan veta vilken knapp det är, ex om det är nr 9 eller operanden +
		this.sit = sit;
		this.setBackground(Color.white); // Sätter färgen
		this.setPreferredSize(new Dimension(50,50)); // Sätter den önskade dimensionen på knapparna, detta fall 50x50 pixlar
		this.setForeground(Color.black);
		this.setFont(new Font("Dialog", Font.BOLD, 30)); // Sätter Fonten
		this.addActionListener(this);
		//this.actionPerformed();
		
	}
	
	/**
	 * Instans metod som sätter bakgrunden på knappen som trycks till röd, 
	 * dvs indikerar vilken knapp som tryckts
	 */
	public void setColorRed() {
		this.setBackground(Color.red);
	}
	
	public void setColorGray() {
		this.setBackground(Color.gray);
	}
	
	/**
	 * Returnerar knappens text, som möjliggör multiplikation
	 */
	public String toString() {
		return this.getText();
	}
	
	/**
	 * Återställer displayen när metoden tillkallas 
	 * (Återställer INTE beräkningar, utan bara siffran)
	 */
	public void resetDisplay() {
		this.sit.display = new JLabel("0");
	}
	
	/**
	 * Abstrakt metod vars syfte är att genomföra övergångar mellan grund-
	 * tillstånd enligt tillståndsdiagrammet.
	 */
	public abstract void transition();
	
	
	
}
