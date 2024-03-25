package view;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Vidu_GridLayout extends JFrame{
	public Vidu_GridLayout() {
		this.setTitle("GridLayout");
		this.setSize(600, 400);
		this.setLocationRelativeTo(null); // can giua cua so chuong trinh 
	
		//set Layout
		GridLayout gridLayout = new GridLayout();
		GridLayout gridLayout_1 = new GridLayout(4,6);
		GridLayout gridLayout_2 = new GridLayout(4,5,30, 30);
		//this.setLayout(gridLayout);
		//this.setLayout(gridLayout_1);
		this.setLayout(gridLayout_2);
			
		// button 
//		JButton button1 = new JButton("Dang ki");
//		JButton button2 = new JButton("Dang nhap");
//		
		for(int i = 0; i< 12; i++) {
			JButton button = new JButton(i + "");
			this.add(button);
		}
		//add thanh phan 
//		this.add(button1);
//		this.add(button2);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Vidu_GridLayout();
		
	}
}
