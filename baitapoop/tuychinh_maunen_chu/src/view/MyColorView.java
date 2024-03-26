package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.MyColorListener;
import model.MyColorModel;

public class MyColorView extends JFrame{
	private MyColorModel myColorModel; 
	private JLabel jLaybel;
	
	public MyColorView() {
		this.myColorModel = new MyColorModel();
		this.init();
	}
	
	private void init() {
		this.setTitle("My Color");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null); 
		this.setSize(1000,600);
		
		Font font_text = new Font("Arial", Font.BOLD, 100);
		jLaybel = new JLabel("TEXT"); 
		jLaybel.setFont(font_text);
		
		JPanel jPanel = new JPanel(); 
		jPanel.setLayout(new GridLayout(2,3));
		
		Font font = new Font("Arial", Font.BOLD, 20);
		MyColorListener myColorListener = new MyColorListener(this);
		
		JButton jButton_text_red = new JButton("Red Text");
		jButton_text_red.setFont(font);
		jButton_text_red.setForeground(Color.RED);
		jButton_text_red.addActionListener(myColorListener);
		JButton jButton_text_yellow = new JButton("Yellow Text");
		jButton_text_yellow.setFont(font);
		jButton_text_yellow.setForeground(Color.YELLOW);
		jButton_text_yellow.addActionListener(myColorListener);
		JButton jButton_text_green = new JButton("Green Text");
		jButton_text_green.setFont(font);
		jButton_text_green.setForeground(Color.GREEN);
		jButton_text_green.addActionListener(myColorListener);
		
		JButton jButton_background_red = new JButton("Red Background");
		jButton_background_red.setFont(font);
		jButton_background_red.setBackground(Color.RED);
		jButton_background_red.setOpaque(true); // to luon vien
		jButton_background_red.addActionListener(myColorListener);
		JButton jButton_background_yellow = new JButton("Yellow Background");
		jButton_background_yellow.setFont(font);
		jButton_background_yellow.setBackground(Color.YELLOW);
		jButton_background_yellow.setOpaque(true); // to luon vien
		jButton_background_yellow.addActionListener(myColorListener);
		JButton jButton_background_green = new JButton("Green Background");
		jButton_background_green.setFont(font);
		jButton_background_green.setBackground(Color.GREEN);
		jButton_background_green.setOpaque(true); // to luon vien
		jButton_background_green.addActionListener(myColorListener);
		
		jPanel.add(jButton_text_red);
		jPanel.add(jButton_text_yellow);
		jPanel.add(jButton_text_green);
		jPanel.add(jButton_background_red);
		jPanel.add(jButton_background_yellow);
		jPanel.add(jButton_background_green);
		
		
		this.setLayout(new BorderLayout());
		this.add(jLaybel, BorderLayout.NORTH);
		this.add(jPanel, BorderLayout.CENTER);
		
		this.setVisible(true);
	}

	public void changeColor(Color color) {
		this.jLaybel.setForeground(color);
	}
	
	public void changeBackground(Color color) {
		this.jLaybel.setBackground(color);
		this.jLaybel.setOpaque(true); // to luon vien
	}
	
	
}
