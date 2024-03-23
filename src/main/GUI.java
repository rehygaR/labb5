package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

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
		setTitle("Miniräknare");
		
		this.canvas = new JPanel(new GridBagLayout());
		this.keyPad = new JPanel(new GridLayout(4,4,6,6));
		
		GridBagConstraints gbc = new GridBagConstraints();
		//gbc.insets = new Insets(15,15,15,15);
		
		
		canvas.setPreferredSize(new Dimension(250, 300));
		

		
		
		DigitButton btn0 = new DigitButton(sit, "7");
		DigitButton btn1 = new DigitButton(sit, "8");
		DigitButton btn2 = new DigitButton(sit, "9");
		BinOpButton btn3 = new BinOpButton(sit, "/", (a, b) -> a / b);
		DigitButton btn4 = new DigitButton(sit, "4");
		DigitButton btn5 = new DigitButton(sit, "5");
		DigitButton btn6 = new DigitButton(sit, "6");
		BinOpButton btn7 = new BinOpButton(sit, "*", (a, b) -> a * b);
		DigitButton btn8 = new DigitButton(sit, "1");
		DigitButton btn9 = new DigitButton(sit, "2");
		DigitButton btn10 = new DigitButton(sit, "3");
		BinOpButton btn11 = new BinOpButton(sit, "-", (a, b) -> a - b);
		DigitButton btn12 = new DigitButton(sit, "0");
		EqualsButton btn13 = new EqualsButton(sit, "=");
		CancelButton btn14 = new CancelButton(sit, "C");
		BinOpButton btn15 = new BinOpButton(sit, "+", (a, b) -> a + b);
		
		keyPad.add(btn0);
		keyPad.add(btn1);
		keyPad.add(btn2);
		keyPad.add(btn3);
		keyPad.add(btn4);
		keyPad.add(btn5);
		keyPad.add(btn6);
		keyPad.add(btn7);
		keyPad.add(btn8);
		keyPad.add(btn9);
		keyPad.add(btn10);
		keyPad.add(btn11);
		keyPad.add(btn12);
		keyPad.add(btn13);
		keyPad.add(btn14);
		keyPad.add(btn15);
		
		keyPad.setPreferredSize(new Dimension(250, 250));
		keyPad.setBackground(Color.gray);
		
		sit.display.setText("0");
		sit.display.setOpaque(true);
		sit.display.setBackground(Color.LIGHT_GRAY);
		sit.display.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		sit.display.setPreferredSize(new Dimension(250, 50));
		sit.display.setHorizontalAlignment(JLabel.RIGHT);
		sit.display.setFont(new Font("Dialog", Font.BOLD, 40));
		sit.display.setForeground(Color.black);
		
		
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		canvas.add(sit.display, gbc);
		gbc.gridx = 0;
		gbc.gridy = 1;
		canvas.add(keyPad, gbc);
		
		
		setContentPane(canvas);
		pack();
		setVisible(true);
	}
	
	
}
