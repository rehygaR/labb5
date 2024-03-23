package main;

import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
class DigitButton extends CalculatorButton {

	DigitButton(Situation sit, String name) {
		super(sit, name);
		// TODO Auto-generated constructor stub
		if (sit.display.getText() == "0") {
			sit.display.setText(name);
		} else {
			sit.display.setText(sit.display.getText());
		}
	}

	@Override
	void transition() {
		// TODO Auto-generated method stub
		switch (sit.state.toString()) {
		case "OpReady":
			sit.state = State.Input2;
			sit.rightOperand = Integer.parseInt(this.toString());
			sit.display.setText(Integer.toString(sit.rightOperand));
			break;
		case "Input1":
			sit.leftOperand = Integer.parseInt(sit.display.getText()) * 10 + Integer.parseInt(this.toString());
			sit.display.setText(Integer.toString(sit.leftOperand));
			break;
		case "Input2":
			sit.rightOperand = Integer.parseInt(sit.display.getText()) * 10 + Integer.parseInt(this.toString());
			sit.display.setText(Integer.toString(sit.rightOperand));
			break;
		case "HasResult":
			sit.leftOperand = Integer.parseInt(this.toString());
			sit.state = State.Input1;
			sit.display.setText(Integer.toString(sit.leftOperand));
			break;
		}

	}
}
