package main;

import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class EqualsButton extends CalculatorButton {

	EqualsButton(Situation sit, String name) {
		super(sit, name);
		// TODO Auto-generated constructor stub
	}


	@Override
	void transition() {
		// TODO Auto-generated method stub
		switch (sit.state.toString()) {
		case "OpReady":

			break;
		case "Input1":

			break;
		case "Input2":
			sit.binaryOperator.setColorGray();
			sit.leftOperand = sit.binaryOperator.applyOperation();
			sit.display.setText(Integer.toString(sit.leftOperand));
			sit.state = State.HasResult;
			break;
		case "HasResult":

			break;
		}
	}

}
