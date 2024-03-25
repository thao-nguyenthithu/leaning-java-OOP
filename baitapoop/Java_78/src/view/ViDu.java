package view;

import javax.swing.JFrame;

public class ViDu {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setTitle("Vi Du JFrame");
		jf.setSize(600,400);
//				
//		while(true) {
//			System.out.println("Dang chay!");
//			
//		}
		
		jf.setLocation(450,200);
		
		//Thoat ra khoi chuong trinh khi dong cua so JFrame
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}
}
