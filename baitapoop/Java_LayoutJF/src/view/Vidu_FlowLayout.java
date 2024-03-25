package view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Vidu_FlowLayout extends JFrame{
	public Vidu_FlowLayout() {
		this.setTitle("FlowLayout");
		this.setSize(600, 400);
		this.setLocationRelativeTo(null); // can giua cua so chuong trinh 
	
		//set Layout
		FlowLayout flowLayout = new FlowLayout();
		FlowLayout flowLayout_1 = new FlowLayout(FlowLayout.RIGHT);
		FlowLayout flowLayout_2 = new FlowLayout(FlowLayout.CENTER, 50, 50);
		//this.setLayout(flowLayout);
		//this.setLayout(flowLayout_1);
		this.setLayout(flowLayout_2);
			
		// button 
		JButton button1 = new JButton("Dang ki");
		JButton button2 = new JButton("Dang nhap");
		
		//add thanh phan 
		this.add(button1);
		this.add(button2);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Vidu_FlowLayout();
		
	}
}
