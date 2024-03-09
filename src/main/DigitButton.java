package main;

import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class DigitButton extends CalculatorButton {

	public DigitButton(Situation sit, String name) {
		super(sit, name);
		// TODO Auto-generated constructor stub
		if (sit.display.getText() == "0") {
			sit.display.setText(name);
		} else {
			sit.display.setText(sit.display.getText());
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
		
	}

}
