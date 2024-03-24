package main;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*
 * Rút thăm trúng thưởng
 * TreeSet thì thêm phần tử vaò sẽ được sắp xếp theo thứ tự bé -> lớn
 * ứng dụng trong từ điển 
 * 
 */
public class TreeSET {
	Set<String> hopPhieuThuong = new TreeSet<String>();
	
	public TreeSET() {
	}
	
	public boolean themPhieu(String giaTri) {
		return this.hopPhieuThuong.add(giaTri);
	}
	
	public boolean xoaPhieu(String giaTri) {
		return this.hopPhieuThuong.remove(giaTri);
	}
	
	public boolean kiemTraPhieuTonTai(String giaTri) {
		return this.hopPhieuThuong.contains(giaTri);
	}
	
	public void xoaAll() {
		this.hopPhieuThuong.clear();
	}
	
	public int laySoLuong() {
		return this.hopPhieuThuong.size();
	}
	
	public String rutThamPhieu() {
		String ketQua = "";
		Random rd = new Random();
		int viTri = rd.nextInt(this.hopPhieuThuong.size());
		ketQua = (String)this.hopPhieuThuong.toArray()[viTri];
		return ketQua;
	}
	
	public void outAll() {
		System.out.println(Arrays.toString(this.hopPhieuThuong.toArray()));
	}

	public static void main(String[] args) {
		int luachon = 0;
		Scanner sc = new Scanner(System.in);
		TreeSET rt = new TreeSET();
		do {
			System.out.println("------------MENU-----------");
			System.out.println("1. Them ma so du thuong");
			System.out.println("2. Xoa ma so du thuong");
			System.out.println("3. Kiem tra ma so co ton tai hay ko ");
			System.out.println("4. Xoa tat ca phieu");
			System.out.println("5. So luong phieu du thuong");
			System.out.println("6. Rut tham phieu trung thuong");
			System.out.println("7. In ra tat ca cac phieu");
			System.out.println("0. Thoat chuong trinh");
			System.out.println("---------------------------");
			System.out.print("Lua chon cua ban la: ");
			luachon = sc.nextInt();	
			sc.nextLine();
			
			if(luachon == 1 || luachon == 2 || luachon == 3) {
				System.out.println("Nhap vao ma phieu du thuong: ");
				String giaTri = sc.nextLine();
				if(luachon == 1) {
					rt.themPhieu(giaTri);
				}else if(luachon == 2) {
					rt.xoaPhieu(giaTri);
				}else {
					System.out.println("Ket qua kiem tra: " + rt.kiemTraPhieuTonTai(giaTri));
				}	
			}else if(luachon == 4) {
				rt.xoaAll();
			}else if(luachon == 5) {
				System.out.println("So luong phieu la: " + rt.laySoLuong());
			}else if(luachon == 6) {
				System.out.println("Phieu trung thuong la: "+ rt.rutThamPhieu());
			}else if(luachon == 7) {
				System.out.println("Cac ma phieu du thuong la: ");
				rt.outAll();
			}
		}while(luachon != 0);
		
	}
}

