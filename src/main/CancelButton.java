package main;

import java.awt.Color;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class CancelButton extends CalculatorButton {

	CancelButton(Situation sit, String name) {
		super(sit, name = "C");
		// TODO Auto-generated constructor stub
		if (this.getBackground() == Color.red) { // Om knappen är röd, ska den återgå till grå
			this.setBackground(Color.gray);
		}
	}

	@Override
	void transition() {
		// TODO Auto-generated method stub
		switch (sit.state.toString()) {
		case "OpReady":
			sit.state = State.Input1;
			sit.leftOperand = 0;
			sit.display.setText(Integer.toString(sit.leftOperand));
			sit.binaryOperator.setColorGray();
			break;
		case "Input1":
			sit.leftOperand = 0;
			sit.display.setText(Integer.toString(sit.leftOperand));
			break;
		case "Input2":
			sit.state = State.Input1;
			sit.leftOperand = 0;
			sit.display.setText(Integer.toString(sit.leftOperand));
			sit.binaryOperator.setColorGray();
			break;
		case "HasResult":
			sit.state = State.Input1;
			sit.leftOperand = 0;
			sit.display.setText(Integer.toString(sit.leftOperand));
			break;
		}
	}

}
