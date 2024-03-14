package test;

import dao.KhachHangDAO;
import model.KhachHang;

public class testKhachHang {

	for(int i = 1; i < 11; i++) {
		KhachHang khach = new KhachHang(i, "Nguyen Van ", 22/21/2323 , "Dia chi ");
		KhachHangDAO.getInstance().insert(khach);
	}
}
