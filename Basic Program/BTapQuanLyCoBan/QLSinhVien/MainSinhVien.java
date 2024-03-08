public class MainSinhVien {
    public static void main(String[] args) {
        NgaySinh ns1 = new NgaySinh(1, 1, 2001); 
        NgaySinh ns2 = new NgaySinh(1, 1, 2001); 

        Lop lop1 = new Lop("CNTT1", "Khoa cong nghe TT"); 
        Lop lop2 = new Lop("Kinh Te 2", "Khoa kinh te va kinh doanh"); 

        SinhVien sv1 = new SinhVien(123, "Nguyen Van A", ns1, 8.0, lop1); 
        SinhVien sv2 = new SinhVien(004, "Nguyen Van B", ns2, 4.5, lop2);

        System.out.println("Ten khoa cua SV1: " + sv1.layTenKhoa());
        
        System.out.println("SV1 co dau hay khong: " + sv1.ktSVDau());
        System.out.println("SV2 co dau hay khong: " + sv2.ktSVDau());
        
        System.out.println("SV1 va SV2 co cung ngay sinh ko: " + sv1.ktNgaySinhSV(sv2));
    
    }
}
