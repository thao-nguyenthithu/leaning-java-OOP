package test;

import java.util.Scanner;

import main.DanhSachSV;
import main.SinhVien;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DanhSachSV dssv = new DanhSachSV();
		int luaChon = 0;
		do {
			System.out.println("-------MENU------");
			System.out.println(
					"1. Thêm sinh viên vào danh sách.\r\n"
					+ "2. In danh sach SV ra man hinh. \r\n"
					+ "3. Kiểm tra danh sách có rỗng hay không. \r\n"
					+ "4. Lấy ra số lượng sinh viên trong danh sách. \r\n"
					+ "5. Làm rỗng danh sách sinh viên. \r\n"
					+ "6. Kiểm tra sv có tồn tại trong danh sách hay ko, dựa trên MSV. \r\n"
					+ "7. Xóa 1 sv ra khỏi danh sách dựa trên MSV. \r\n"
					+ "8. Tìm kiếm tất cả sv dự trên Tên được nhập từ bàn phím. \r\n"
					+ "9. Xuất ra danh sách sinh viên có điểm từ cao đến thấp.\r\n"
					+ "0. Thoat khoi chuong trinh.\n"
					);
			System.out.println("------------------");
			System.out.print("Lua chon cua ban: ");
			luaChon = sc.nextInt();
			sc.nextLine();
			
			switch (luaChon) {
			case 1: {
				System.out.println("Nhap ma sinh vien: ");
				String maSinhVien = sc.nextLine();
				System.out.println("Nhap ho va ten: ");
				String hoVaTen = sc.nextLine();
				System.out.println("Nhap nam sinh: ");
				int namSinh = sc.nextInt();
				System.out.println("Nhap diem trung binh: ");
				double diemTrungBinh = sc.nextDouble();
				
				SinhVien sv = new SinhVien(maSinhVien, hoVaTen, namSinh, diemTrungBinh);
				dssv.themSinhVien(sv);
				break;
			}
			case 2: {
				dssv.inDanhSachSV();
				break;
			}
			case 3: {
				System.out.println("Danh sach tren rong? " + dssv.kiemtraDanhSachRong());
				break;
			}
			case 4: {
				System.out.println("So luong sinh vien trong danh sach hien tai: " + dssv.laySoLuongSinhVien());
				break;
			}
			case 5: {
				dssv.lamRongDanhSach();
				System.out.println("Da xoa het danh sach sinh vien!");
				break;
			}
			case 6: {
				System.out.println("Nhap ma sinh vien: ");
				String maSinhVien = sc.nextLine();
				SinhVien sv = new SinhVien(maSinhVien);
				System.out.println("Sinh vien co trong danh sach khong? " + dssv.kiemtraTonTai(sv));
				break;
			}
			case 7: {
				System.out.println("Nhap ma sinh vien can xoa: ");
				String maSinhVien = sc.nextLine();
				SinhVien sv = new SinhVien(maSinhVien);
				System.out.println("Da xoa danh sach sinh vien? " + dssv.xoaSinhVien(sv));
				break;
			}
			case 8: {
				System.out.println("Nhap ho va te sinh vien can tim: ");
				String Ten = sc.nextLine();
				System.out.println("Ket qua tim kiem: ");
				dssv.timSinhVien(Ten);
				break;
			}
			case 9: {
				dssv.sapXepTheoDiem();
				dssv.inDanhSachSV();
				break;
			}
			default:
				System.out.println("Nhap sai! Vui long chon lai!");
				break;
			}
		}while(luaChon != 0);
	}
}
