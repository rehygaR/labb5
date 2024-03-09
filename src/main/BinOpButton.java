package main;

import java.awt.event.ActionEvent;
import java.util.function.IntBinaryOperator;

@SuppressWarnings("serial")
public class BinOpButton extends CalculatorButton{

	private IntBinaryOperator operator;
	private int rightOperand;
	private int leftOperand;

	/**
	 * Konstruktor för operandknapparna, tar emot en situation, namn på knapp samt operator.
	 * 
	 * @param sit
	 * @param name
	 * @param operator
	 */
	@SuppressWarnings("static-access")
	public BinOpButton(Situation sit, String name, IntBinaryOperator operator) {
		super(sit, name);
		this.operator = operator;
		
		 if (sit.state == sit.state.Input1 || sit.state == sit.state.HasResult) {
	            sit.leftOperand = Integer.parseInt(name);
	            sit.binaryOperator = this;
	            this.setColorRed(); // Färga knappen röd
	        } else if (sit.state == sit.state.OpReady) {
	        	this.setColorGray(); // Färga den gamla knappen grå
	            sit.binaryOperator = this;
	            this.setColorRed(); // Färga den nya knappen röd
	        }
	}
	
	public int applyOperation() {
		return operator.applyAsInt(leftOperand, rightOperand);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		transition();
	}

	@Override
	public void transition() {
		// TODO Auto-generated method stub
		switch(sit.state.toString()) {
		case "Input1":
			
		}
	}

}
