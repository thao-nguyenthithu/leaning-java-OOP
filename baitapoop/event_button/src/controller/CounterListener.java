package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.CounterView;

public class CounterListener implements ActionListener{
	private CounterView ctv;
	
	//CounterListener dieu kien chuong trinh CounterView
	public CounterListener(CounterView ctv) {
		this.ctv = ctv;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		//Lấy tên nút bấm: getActionCommand()
		String src = e.getActionCommand(); 
		System.out.println("Ban da nhan nut: " + src);
		
		//điều khiển lại view
		if(src.equals("UP")) {
			this.ctv.increment();
		}else if(src.equals("DOWN")) {
			this.ctv.decrement();
		}else if(src.equals("Reset")) {
			this.ctv.reset();
		}
	}
	
}
