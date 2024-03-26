package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.NameButtonListener;
import model.NameButtonModel;

public class NameButtonView extends JFrame{
	private NameButtonModel nameButtonModel;
	private JLabel jLabel;
	
	
	public NameButtonView() {
		this.nameButtonModel = new NameButtonModel();
		this.init();
		this.setVisible(true);
	}


	private void init() {
		this.setTitle("Button-Font");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300,300);
		this.setLocationRelativeTo(null);
		
		JPanel jpanel_Center = new JPanel()	;
		jpanel_Center.setLayout(new GridLayout(2,2));
		
		// Tao Listener
		NameButtonListener nameButtonListener = new NameButtonListener(this);
		
		//Creat font
		Font font = new Font("Arial",Font.BOLD, 20);
		
		JButton jButton_1 = new JButton("Plain"); 
		//gan font
		jButton_1.setFont(new Font("Arial",Font.PLAIN, 20));
		jButton_1.addActionListener(nameButtonListener);
		JButton jButton_2 = new JButton("Bold"); 
		jButton_2.setFont(new Font("Arial",Font.BOLD, 20));
		jButton_2.addActionListener(nameButtonListener);
		JButton jButton_3 = new JButton("Italic"); 
		jButton_3.setFont(new Font("Arial",Font.ITALIC, 20));
		jButton_3.addActionListener(nameButtonListener);
		
		jpanel_Center.add(jButton_1);
		jpanel_Center.add(jButton_2);
		jpanel_Center.add(jButton_3);
		
		JPanel jpanel_footer = new JPanel();
		jLabel = new JLabel("-----");
		jLabel.setFont(font);
		jpanel_footer.add(jLabel);
		
		this.setLayout(new BorderLayout());
		this.add(jpanel_Center, BorderLayout.CENTER); 
		this.add(jpanel_footer, BorderLayout.SOUTH);
		
	}
	
	public void changeTo_1() {
		this.nameButtonModel.setValue_1();
		jLabel.setText("Ban vua chon font: " + this.nameButtonModel.getValue());
	}

	public void changeTo_2() {
		this.nameButtonModel.setValue_2();
		jLabel.setText("Ban vua chon font: " + this.nameButtonModel.getValue());
	}

	public void changeTo_3() {
		this.nameButtonModel.setValue_3();
		jLabel.setText("Ban vua chon font: " + this.nameButtonModel.getValue());
	}
}
