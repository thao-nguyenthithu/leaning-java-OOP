package view;

import java.awt.BorderLayout;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Vidu_BorderLayout extends JFrame {
	public Vidu_BorderLayout() {
		this.setTitle("Vidu BorderLayout");
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);
		
		//set Layout
//		BorderLayout borderLayout = new BorderLayout();
		BorderLayout borderLayout_1 = new BorderLayout(15, 15);
		this.setLayout(borderLayout_1);
		
		this.add(new JButton("Bac"), BorderLayout.NORTH);
		this.add(new JButton("Nam"), BorderLayout.SOUTH);
		this.add(new JButton("Dong"), BorderLayout.EAST);
		this.add(new JButton("Tay"), BorderLayout.WEST);
		this.add(new JButton("Giua"), BorderLayout.CENTER);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Vidu_BorderLayout();
	}
}
