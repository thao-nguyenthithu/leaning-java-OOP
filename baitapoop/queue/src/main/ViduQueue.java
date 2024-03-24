package main;

import java.util.LinkedList;
import java.util.Queue;

public class ViduQueue {
	public static void main(String[] args) {
		Queue<String> dsSV = new LinkedList<String>();
		
		dsSV.offer("Nguyen van a");
		dsSV.offer("Nguyen van B");
		dsSV.offer("Nguyen van C");
		dsSV.offer("Nguyen van D");
		
		while(true) {
			String ten = dsSV.poll(); // lay xong xoa luon
			if(ten == null) {
				break;
			}
			System.out.println(ten);
			
		}
	}
}
