package view;

import java.awt.BorderLayout;
import java.awt.TextField;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.CounterListener;
import model.CounterModel;

public class CounterView extends JFrame{
	private CounterModel counterModel; 
	private JButton jButton_up; 
	private JButton jButton_down; 
	private JLabel jLabel_value;
	private JButton jButton_reset;
	
	public CounterView() {
		this.counterModel = new CounterModel();
		this.init(); //hàm khởi tạo (viết)
		this.setVisible(true);
	}
	
	public void init() {
		this.setTitle("Counter");
		this.setSize(300,300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Đối tượng để lắng nghe người dùng ấn nút: ActionListener
		//và nó được hiện thực lại thông qua CounterListener
		ActionListener ac = new CounterListener(this);
		// Giống với: CounterListener ac = new CounterListener(this); 
		// this la CounterView hien tai cta dang lam vc
		
		jButton_up = new JButton("UP");
		jButton_up.addActionListener(ac);
		//khi ngta ấn nút này thì nó sẽ đi đến cái controller mà quản lý thao tác nút này.
		
		jButton_down = new JButton("DOWN"); 
		jButton_down.addActionListener(ac);
		
		jButton_reset = new JButton("Reset");
		jButton_reset.addActionListener(ac);
		
		jLabel_value = new JLabel(this.counterModel.getValue()+"",JLabel.CENTER); // can so ra giua
		
		JPanel jPanel = new JPanel();
		jPanel.setLayout(new BorderLayout());
		jPanel.add(jButton_up,BorderLayout.WEST);
		jPanel.add(jLabel_value,BorderLayout.CENTER);
		jPanel.add(jButton_down,BorderLayout.EAST);
		
		
		this.setLayout(new BorderLayout());
		this.add(jPanel, BorderLayout.CENTER );
		this.add(new TextField(),BorderLayout.NORTH);
		this.add(jButton_reset, BorderLayout.SOUTH);
	}
	
	public void increment() {
		this.counterModel.increment();
		this.jLabel_value.setText(this.counterModel.getValue() +""); //lấy ngược value từ model ra
		
	}
	
	public void decrement() {
		this.counterModel.decrement();
		this.jLabel_value.setText(this.counterModel.getValue() +""); //lấy ngược value từ model ra
		
	}
	
	public void reset() {
		this.counterModel.reset();
		this.jLabel_value.setText(this.counterModel.getValue() +""); //lấy ngược value từ model ra
		
	}
	
}
