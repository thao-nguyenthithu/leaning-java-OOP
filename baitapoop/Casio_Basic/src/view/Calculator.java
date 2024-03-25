package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class Calculator extends JFrame{
	public Calculator() {
		this.setTitle("My Calculator");
		this.setSize(300,300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextField jTextField = new JTextField();
		
		//Panel 1: Noi chua textField
		JPanel jPanel_head = new JPanel();
		jPanel_head.setLayout(new BorderLayout());
		jPanel_head.add(jTextField,BorderLayout.CENTER);
		
		//Panel 2: Noi chua button
		JPanel jPanel_butons = new JPanel();
		jPanel_butons.setLayout(new GridLayout(5,3)); // 5 dong 3 cot
		jPanel_butons.add(new JButton("0"));
		jPanel_butons.add(new JButton("1"));
		jPanel_butons.add(new JButton("2"));
		jPanel_butons.add(new JButton("3"));
		jPanel_butons.add(new JButton("4"));
		jPanel_butons.add(new JButton("5"));
		jPanel_butons.add(new JButton("6"));
		jPanel_butons.add(new JButton("7"));
		jPanel_butons.add(new JButton("8"));
		jPanel_butons.add(new JButton("9"));
		jPanel_butons.add(new JButton("+"));
		jPanel_butons.add(new JButton("-"));
		jPanel_butons.add(new JButton("*"));
		jPanel_butons.add(new JButton("/"));
		jPanel_butons.add(new JButton("="));
		
		//tao layout + add Panel vao Layout
		this.setLayout(new BorderLayout());
		this.add(jPanel_head, BorderLayout.NORTH);
		this.add(jPanel_butons,BorderLayout.CENTER);
		
		
		this.setVisible(true);
	}
	public static void main(String[] args) {
		//look and feel
		try {
			//hien thi voi motif
			//UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
			
			
			/*
			 * hien thi voi giao dien dung he dieu hanh mac dinh ma ban dang sd
			 * 
			 * UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			 * 
			 */
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			
			new Calculator();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
