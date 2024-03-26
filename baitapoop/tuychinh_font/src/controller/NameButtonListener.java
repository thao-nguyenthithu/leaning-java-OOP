package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.NameButtonView;

public class NameButtonListener implements ActionListener{

	private NameButtonView nameButtonView;
	
	
	public NameButtonListener(NameButtonView nameButtonView) {
		this.nameButtonView = nameButtonView;
	} 


	@Override
	public void actionPerformed(ActionEvent e) {
		String event = e.getActionCommand();
		if(event.equals("Plain")) {
			this.nameButtonView.changeTo_1();
		}else if(event.equals("Bold")) {
			this.nameButtonView.changeTo_2();
		}else if(event.equals("Italic")) {
			this.nameButtonView.changeTo_3();
		}
	}

}
