package test;

import java.util.ArrayList;

import dao.SachDAO;
import model.Sach;

public class testSachDAO {
	public static void main(String[] args) {
		
//		Test Insert
		
//		Sach sach1 = new Sach("OOP" , "Lap trinh Java", 68, 2024);
//		@SuppressWarnings("unused")
//		Sach sach2 = new Sach("LTC" , "Lap trinh C", 68, 2023);
//		
//		SachDAO.getInstance().insert(sach2);
//		
//		for (int i = 0; i < 10; i++) {
//			Sach sach = new Sach("OOP" + i , "Lap trinh Java" + i, 68, 2024);
//			SachDAO.getInstance().insert(sach);
//		}
		
		
		/*
		 * Test Update
		 */
//		Sach sach2 = new Sach("LTC" , "Lap trinh C", 100, 2023);
//		SachDAO.getInstance().update(sach2);
//		
//		
//		/*
//		 * Test Delete
//		 */
//		for (int i = 0; i < 10; i++) {
//			Sach sach = new Sach("OOP" + i , "Lap trinh Java" + i, 68, 2024);
//			SachDAO.getInstance().delete(sach);
//		}
		
		ArrayList<Sach> list = SachDAO.getInstance().selectAll();
		for (Sach sach : list) {
			System.out.println(sach.toString());
		}
		
		
		Sach sach_new = new Sach();
		sach_new.setId("OOP");
		Sach sach2 = SachDAO.getInstance().selectById(sach_new);
		System.out.println(sach2);
		
		//lay co dieu kien
		ArrayList<Sach> list2 = SachDAO.getInstance().selectByCondition("giaBan < 70");
		for (Sach sach : list2) {
			System.out.println(sach.toString());
		}
		
	}
}
