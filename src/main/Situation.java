package main;

import javax.swing.JFrame;
import javax.swing.JLabel;

class Situation extends JFrame {

	State state = State.Input1;
	JLabel display;
	BinOpButton binaryOperator;
	int leftOperand;
	int rightOperand;

	Situation(JLabel display) {
		this.display = display;
	}
}
