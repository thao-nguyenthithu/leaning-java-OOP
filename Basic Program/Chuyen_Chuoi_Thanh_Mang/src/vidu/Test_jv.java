package vidu;

import java.util.Arrays;

public class Test_jv {
	public static void main(String[] args) {
		String s = "Xin chao cac ban, toi la Dua!";
		
		String[] a = s.split(" "); // cat mang ra dua tren khoang trang
		System.out.println(Arrays.toString(a));
		
		String[] b = s.split(", toi ");
		System.out.println(Arrays.toString(b));
		
		String s2 = "Xin chao, minh la Dua. Minh la lap trinh vien!";
		
		String[] c = s2.split("\\.|\\,"); // dung để cắt mảng s2 dựa trên dấu (.) hoặc phẩy (,).
		System.out.println("Mang s2 gom " + c.length +" phan tu = " + Arrays.toString(c));
		
		String s3 = "Nguyen Van A";
		String[] d = s3.split(" ");
		System.out.println(Arrays.toString(d));
		System.out.println("Ten: " + d[d.length - 1]);
		
	}
}
