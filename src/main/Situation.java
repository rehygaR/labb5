package main;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Situation extends JFrame {
	
	State state = State.Input1;
	JLabel display;
	BinOpButton binaryOperator;
	int leftOperand;
	
	Situation(JLabel display){
		this.display = display;
	}
}
