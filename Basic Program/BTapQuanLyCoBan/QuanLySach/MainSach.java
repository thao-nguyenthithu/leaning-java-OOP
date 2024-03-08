public class MainSach {
    public static void main(String[] args) {
        NgayPhim ngay1 = new NgayPhim(8, 3, 2004);
        NgayPhim ngay2 = new NgayPhim(4, 8, 2000);

        TacGia tacgia1 = new TacGia("Dua", ngay1); 
        TacGia tacgia2 = new TacGia("BimBim", ngay2); 

        Sach sach1 = new Sach("OOP", 111, 2023, tacgia1);
        Sach sach2 = new Sach("Dune", 300, 2020, tacgia2);
        
        sach1.inTenSach();
        sach2.inTenSach();
    
        System.out.println("Kiem tra namXB cua sach 1 va 2: " + sach1.ktCungNam(sach2));
    
        System.out.println("Gia sach sau khi giam 10% la: "+ sach1.giaSauKhiGiam(10));
    }
}
