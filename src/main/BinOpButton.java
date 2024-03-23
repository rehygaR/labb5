package main;

import java.awt.event.ActionEvent;
import java.util.function.IntBinaryOperator;

@SuppressWarnings("serial")
class BinOpButton extends CalculatorButton {

	private IntBinaryOperator operator;
	private int rightOperand;
	private int leftOperand;

	/**
	 * Konstruktor för operandknapparna, tar emot en situation, namn på knapp samt
	 * operator.
	 * 
	 * @param sit
	 * @param name
	 * @param operator
	 */
	@SuppressWarnings("static-access")
	BinOpButton(Situation sit, String name, IntBinaryOperator operator) {
		super(sit, name);
		this.operator = operator;

	}

	int applyOperation() {
		return operator.applyAsInt(sit.leftOperand, sit.rightOperand);
	}

	@Override
	void transition() {
		// TODO Auto-generated method stub
		switch (sit.state.toString()) {
		case "OpReady":
			sit.binaryOperator.setColorGray();
			sit.binaryOperator = this;
			this.setColorRed();
			break;
		case "Input1":
			sit.state = State.OpReady;
			sit.binaryOperator = this;
			this.setColorRed();
			break;
		case "Input2":
			break;
		case "HasResult":
			sit.state = State.OpReady;
			sit.binaryOperator = this;
			this.setColorRed();
			break;
		}
	}

}
