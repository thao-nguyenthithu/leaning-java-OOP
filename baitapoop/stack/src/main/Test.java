package main;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Stack<String> stackChuoi = new Stack<String>();
		
//		stackChuoi.push(""); //dua gia tri
//		stackChuoi.pop(); // lay xoa xong xoa
//		stackChuoi.peek(); // lay ra nhung ko xoa
//		stackChuoi.clear(); // xoa all
//		stackChuoi.contains(); // xac dinh gia tri co ton tai
//		stackChuoi.size(); // do lon stack
		
		// vi du dao chuoi
		System.out.println("Nhap vao chuoi: ");
		String s = sc.nextLine();
		for(int i = 0; i < s.length();i++) {
			stackChuoi.push(s.charAt(i)+ "");
		}
		System.out.println("Chuoi dao nguoi: ");
		for(int i = 0; i < s.length();i++) {
			System.out.print(stackChuoi.pop());
		}
		
		//Vi du chuyen he 10 sang he 2
		Stack<Integer> stackSoDu = new Stack<Integer>();
		System.out.println("\nNhap so nguyen duong: ");
		int x = sc.nextInt();
		while(x>0) {
			int soDu = x % 2; 
			stackSoDu.push(soDu);
			x = x/2;
		}
		System.out.println("So nhi phan la: ");
		
//		for(int i = 0 ; i < stackSoDu.size(); i++) { 
		// sai, tai vi moi lan chay xong for() thi size bi thay doi (giam di 1).
//			System.out.print(stackSoDu.pop());
//		}
		int n = stackSoDu.size();
		for(int i = 0 ; i < n; i++) {
			System.out.print(stackSoDu.pop());
		}
		
	}
}
