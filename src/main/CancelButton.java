package main;

import java.awt.Color;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class CancelButton extends CalculatorButton {

	public CancelButton(Situation sit, String name) {
		super(sit, name = "C");
		// TODO Auto-generated constructor stub
		super.resetDisplay();
		if (this.getBackground() == Color.red) { // Om knappen är röd, ska den återgå till grå
			this.setBackground(Color.gray);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		transition();
	}

	@Override
	public void transition() {
		// TODO Auto-generated method stub
		// Här ska man återgå till Input1 tillståndet, hur??
	}

}
