package main;

import java.util.ArrayDeque;
import java.util.Deque;

public class ViduDeque {
	public static void main(String[] args) {
		Deque<String> hangdoi2dau = new ArrayDeque<String>(); 
		
		hangdoi2dau.offer("Nguyen Van A");
		hangdoi2dau.offer("Nguyen Van B");
		hangdoi2dau.offer("Nguyen Van C");
		hangdoi2dau.offer("Nguyen Van D");
		
		hangdoi2dau.offerFirst("Nguyen Van A01");
		hangdoi2dau.offerLast("Nguyen Van D02");
		
		int n = hangdoi2dau.size();
		for(int i = 0; i < n; i++) {
			System.out.println(hangdoi2dau.peek()); // peek lay ra nhung ko xoa
		}
		
		System.out.println("Phan tu dau tien: " + hangdoi2dau.pollFirst());
	}
}
