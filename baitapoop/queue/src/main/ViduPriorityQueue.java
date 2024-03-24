package main;

import java.util.PriorityQueue;
import java.util.Queue;

public class ViduPriorityQueue {
	public static void main(String[] args) {
		Queue<String> dsSV = new PriorityQueue<String>();
		
		
		dsSV.offer("Nguyen van B");
		dsSV.offer("Nguyen van C");
		dsSV.offer("Nguyen van A");
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