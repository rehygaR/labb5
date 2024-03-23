package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
abstract class CalculatorButton extends JButton implements ActionListener { // JLabel.getText(); returnerar en
																					// sträng som blir vår högra operand
																					// vid operationer
	private final int btnSize = 50;
	private final int fontSize = 30;
	Situation sit;

	/**
	 * Konstruktorn för den abstrakta klassen som ärvs av de konkreta knapparna som
	 * ska finnas på minirknaren.
	 * 
	 * @param sit
	 * @param name
	 */
	CalculatorButton(Situation sit, String name) {

		super(name); // Ger JButtonen namnet på knappen så man kan veta vilken knapp det är, ex om
						// det är nr 9 eller operanden +
		this.sit = sit;
		this.setBackground(Color.white); // Sätter färgen
		this.setPreferredSize(new Dimension(btnSize, btnSize)); // Sätter den önskade dimensionen på knapparna, detta fall 50x50
														// pixlar
		this.setForeground(Color.black);
		this.setFont(new Font("Dialog", Font.BOLD, fontSize)); // Sätter Fonten
		this.addActionListener(this);
//		this.setOpaque(true);
		// this.actionPerformed();

	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		transition();
	}

	/**
	 * Instans metod som sätter bakgrunden på knappen som trycks till röd, dvs
	 * indikerar vilken knapp som tryckts
	 */
	void setColorRed() {
		this.setBackground(Color.red);
	}

	void setColorGray() {
		this.setBackground(Color.white);
	}

	/**
	 * Returnerar knappens text, som möjliggör multiplikation
	 */
	public String toString() {
		return this.getText();
	}

	/**
	 * Abstrakt metod vars syfte är att genomföra övergångar mellan grund- tillstånd
	 * enligt tillståndsdiagrammet.
	 */
	abstract void transition();

}
