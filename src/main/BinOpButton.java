package main;

import java.awt.event.ActionEvent;
import java.util.function.IntBinaryOperator;

@SuppressWarnings("serial")
public class BinOpButton extends CalculatorButton {

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
	public BinOpButton(Situation sit, String name, IntBinaryOperator operator) {
		super(sit, name);
		this.operator = operator;

	}

	public int applyOperation() {
		return operator.applyAsInt(leftOperand, rightOperand);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
//		if (sit.state == sit.state.Input1 || sit.state == sit.state.HasResult) {
//			sit.binaryOperator = this;
//			super.setColorRed(); // Färga knappen röd
//		}
//		if (sit.state == sit.state.OpReady) {
//			
//			this.setColorGray(); // Färga den gamla knappen grå
//			sit.binaryOperator = this;
//			this.setColorRed(); // Färga den nya knappen röd
//		}
		transition();
	}

	@Override
	public void transition() {
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
			sit.binaryOperator.setColorGray();
			sit.binaryOperator = this;
			this.setColorRed();
			break;
		case "HasResult":
			sit.leftOperand = Integer.parseInt(sit.display.getText());
			sit.state = State.OpReady;
			break;
		}
	}

}
